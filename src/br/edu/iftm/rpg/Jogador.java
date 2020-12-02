package br.edu.iftm.rpg;

public class Jogador {
    // Atributos
    private String nome;
    private int vida;    
    private int dano;

    // Construtor
    public Jogador (String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = 100;
        this.dano = dano;
    }

    // Metodos da clase
    public void atacar (Inimigo inimigo) {
        System.out.println(nome+ " com " +dano+ " de dano atacou " +inimigo.getNome());
        //System.out.println();
        inimigo.pederVida(dano);
    }

    public void pederVida (int danoInimigo) {  
        vida = vida - danoInimigo;      
        if (vida <= 0) {
            vida = 0;
            System.out.println(nome+ " morreu.\n");
        
        } else if (vida >= 1) {
            System.out.println("perdeu " +danoInimigo+ " de vida, vida atual: " +vida); // Nao consegui colocar o nome do inimigo perdeu...
            System.out.println();
        }        
    }

    public void status() {
        System.out.println("Jogador: " +nome);
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
