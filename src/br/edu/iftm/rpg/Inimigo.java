package br.edu.iftm.rpg;

public class Inimigo {
    // Atributos
    private String nome;
    private int vida;
    private int dano; 
    private Jogador jogador; 
        
    // Construtor
    public Inimigo (String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    // Metodos da classe    
    public void atacar (Jogador jogador) { // Inimigo ataca
        System.out.println("Atacou");
        jogador.setVida(jogador.getVida() - this.dano);
    }
   
    public void pederVida (int pontos) { 
        if (vida <= 0) {
            System.out.println("Jogador morreu.");
        } else if (vida >= 1) {
            pontos = jogador.getDano();
            vida = vida - pontos;
            System.out.println("Perdeu " +pontos+ " pontos de vida");
        }
        
    }

    public void status() {
        System.out.println("Inimigo: " +nome);
        System.out.println("Vida: " +vida);
        System.out.println("Dano: " +dano);
    }
   
    public int getVida() {
    	return this.vida;
    }
    public void setVida(int vida) {
	    this.vida = vida;
    }

    public int getDano() {
    	return this.dano;
    }
    public void setDano(int dano) {
    	this.dano = dano;
    }
   
}    
    