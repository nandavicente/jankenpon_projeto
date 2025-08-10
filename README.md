# Jankenpon - JogadorWiFi

Projeto desenvolvido para a disciplina de **Programação Orientada a Objetos (POO)**.  
Implementa um jogador inteligente para o jogo **Jankenpon (Pedra, Papel, Tesoura)**, utilizando análise do histórico do adversário para prever e contra-atacar suas jogadas.

## 📚 Disciplina
- **Nome:** Programação Orientada a Objetos (POO)
- **Instituição:** IFNMG

## 👩‍💻 Desenvolvedora
- **Nome:** Maria Fernanda de Oliveira Vicente

## 🛠 Tecnologias Utilizadas
- Java
- Biblioteca `io.github.guisso.jankenpon`
- IDE recomendada: NetBeans ou IntelliJ IDEA

## 🎯 Estratégia do Jogador
1. **Coleta de Dados:** Armazena as últimas jogadas do adversário.
2. **Fase Inicial:** Faz jogadas aleatórias até ter um histórico suficiente.
3. **Análise:** Identifica a jogada mais frequente do adversário.
4. **Contra-ataque:** Escolhe a jogada vencedora contra a mais frequente.

## 📂 Estrutura do Código
- **Pacote:** `com.mycompany.jankenpon.players`
- **Classe:** `JogadorWiFi`
- **Enum:** `Move` (ROCK, PAPER, SCISSORS, NONE)

## 🚀 Execução
Este jogador deve ser integrado ao sistema base do Jankenpon, disponível na biblioteca `io.github.guisso.jankenpon`.

---
> Projeto acadêmico — uso exclusivo para fins de estudo e aprendizado.
