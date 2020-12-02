package br.edu.iftm.rpg;

public class Inimigo {
    // Atributos
    private String nome;
    private int vida;
    private int dano; 

    // Construtor
    public Inimigo (String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = 100;
        this.dano = dano;
    }

    // Metodos da classe    
    public void atacar (Jogador jogador) { // Inimigo ataca
        System.out.println(nome+ " com " +dano+ " de dano atacou " +jogador.getNome());
        //System.out.println();
        jogador.pederVida(dano);
      
    }
    
    public void pederVida (int danoJogador) { 
        vida = vida - danoJogador;
        if (vida <= 0) {
            vida = 0;
            System.out.println(nome+ " morreu.\n");
        } else if (vida >= 1) {
            
            System.out.println("perdeu " +danoJogador+ " de vida, vida atual: " +vida); // Nao consegui colocar o nome do jogador perdeu .....
            System.out.println();
        }        
    }

    public void status() {
        System.out.println("Inimigo: " +nome);
        System.out.println("Vida: " +vida);
        System.out.println("Dano: " +dano);
        System.out.println();
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

    public String getNome() {
        return this.nome;
    }   
}    
    