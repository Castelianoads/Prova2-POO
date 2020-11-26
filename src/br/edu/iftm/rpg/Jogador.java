package br.edu.iftm.rpg;

public class Jogador {
    // Atributos
    private String nome;
    private int vida;    
    private int dano;
    private Inimigo inimigo;

    private int pontosDeExperiencia;
    private int nivel;

    
    // Construtor
    public Jogador (String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = 100;
        this.dano = dano;
        this.nivel = 0;
        this.pontosDeExperiencia = 0;
        definirNivel();
    }

    // Metodos da clase
    public void atacar (Inimigo inimigo) {
        System.out.println("Atacou");
        inimigo.setVida(inimigo.getVida() - dano);
        pontosDeExperiencia = pontosDeExperiencia + 55;
    }
    
    public void pederVida (int pontos) {
        if (vida <= 0) {
            System.out.println("Jogador morreu.");
        } else if (vida >= 1) {
            pontos = inimigo.getDano();
            vida = vida - pontos;
            pontosDeExperiencia -= 25;
            System.out.println("Perdeu " +pontos+ " pontos de vida");
        }
        
    }

    private void definirNivel(){
        if (pontosDeExperiencia >= 100) {
            nivel = 1;
        }  else if (pontosDeExperiencia >= 200) {
            nivel = 2;
        }  else if (pontosDeExperiencia >= 300) {
            nivel = 3;
        }  else if  (pontosDeExperiencia >= 400) {
            nivel = 4;
        }  else if (pontosDeExperiencia >= 500) {
            nivel = 5;
        }
    }    

    public void verificarVida() {
        
    }

    public void status() {
        System.out.println("Jogador: " +nome);
        System.out.println("Vida: " +vida);
        System.out.println("Dano: " +dano);
        System.out.println("Nível: " +nivel);
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
    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
        definirNivel();
    }

}
