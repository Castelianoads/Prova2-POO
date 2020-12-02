package br.edu.iftm.rpg;

public class Luta {
    // Metodos da classe
    public void enfrentar(Jogador jogador, Inimigo inimigo) {
        jogador.atacar(inimigo);
        inimigo.atacar(jogador);
    }
}        
    

