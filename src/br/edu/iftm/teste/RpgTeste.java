package br.edu.iftm.teste;

import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;

public class RpgTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Heroi", 100, 67);
        Inimigo inimigo1 = new Inimigo("Vilao", 100, 54);
        Inimigo inimigo2 = new Inimigo("Bandido", 100, 84);
        Luta luta = new Luta();
       
        
        luta.Lutar(jogador1, inimigo1);
        luta.Lutar(jogador1, inimigo2);
        jogador1.status();
        System.out.println();
        inimigo1.status();
        System.out.println();
        inimigo2.status();

        





    }
    
}
