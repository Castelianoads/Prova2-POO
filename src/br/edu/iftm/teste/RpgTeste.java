package br.edu.iftm.teste;

import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;

public class RpgTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Heroi", 100, 30);
        Inimigo inimigo1 = new Inimigo("Vilao", 100, 24);
        Inimigo inimigo2 = new Inimigo("Bandido", 100, 34);
        Luta luta = new Luta();
               
        luta.enfrentar(jogador1, inimigo1);
        luta.enfrentar(jogador1, inimigo2);
        luta.enfrentar(jogador1, inimigo1);
       
        jogador1.status();
        inimigo1.status();
        inimigo2.status();
    }
}
