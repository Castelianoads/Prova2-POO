package br.edu.iftm.rpg;

import java.util.Random;

public class Luta {
    // Atributos
    private Jogador desafiante;    
    private Inimigo desafiado;


    // Construtor
    public Luta (){

    }

    // Metodos da classe
    public void Lutar(Jogador desafiante, Inimigo desafiado) {
        this.desafiante = desafiante;
        this.desafiado = desafiado;
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(2);
        if (numero == 0) { 
            desafiante.atacar(desafiado);
        }

    }
}        
    

