package com.mycompany.jankenpon.players;

import io.github.guisso.jankenpon.AbstractPlayer;
import io.github.guisso.jankenpon.Move;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JogadorWiFi extends AbstractPlayer {
        
    private final List<Move> historicoAdversario = new ArrayList<>();
    private final Random aleatorio = new Random();

    @Override
    public String getDeveloperName() {
        return "Nanda Vicente"; // Nome do jogador
    }

    @Override
    public Move makeMyMove(Move jogadaAnteriorDoAdversario) {
        if (jogadaAnteriorDoAdversario != null && jogadaAnteriorDoAdversario != Move.NONE) {
            historicoAdversario.add(jogadaAnteriorDoAdversario);
        }

        if (historicoAdversario.size() < 3) {
            return jogadaAleatoria();
        }

        Move maisFrequente = jogadaMaisFrequente();
        return contraJogada(maisFrequente);
    }

    private Move jogadaAleatoria() {
        int sorteio = aleatorio.nextInt(3);
        return switch (sorteio) {
            case 0 -> Move.ROCK;
            case 1 -> Move.PAPER;
            default -> Move.SCISSORS;
        };
    }

    private Move contraJogada(Move jogada) {
        return switch (jogada) {
            case ROCK -> Move.PAPER;
            case PAPER -> Move.SCISSORS;
            case SCISSORS -> Move.ROCK;
            default -> jogadaAleatoria();
        };
    }

    private Move jogadaMaisFrequente() {
        int pedra = 0, papel = 0, tesoura = 0;

        for (Move jogada : historicoAdversario) {
            switch (jogada) {
                case ROCK -> pedra++;
                case PAPER -> papel++;
                case SCISSORS -> tesoura++;
            }
        }

        if (pedra >= papel && pedra >= tesoura) return Move.ROCK;
        else if (papel >= pedra && papel >= tesoura) return Move.PAPER;
        else return Move.SCISSORS;
    }
}
