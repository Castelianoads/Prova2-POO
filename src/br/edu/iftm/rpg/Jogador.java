package br.edu.iftm.rpg;

public class Jogador {
    private String nome; // +/- 15 bytes
    private long idUsuario; // 8 bytes
    private short vida; // 2 bytes
    private short dano;  // 2 bytes
    private short pontosDeExperiencia; // 2 bytes
    private char sexo; // 1 byte
    private byte nivel; // 1 byte

    public Jogador (String nome, int dano, char sexo) {
        this.nome = nome;
        this.vida = 1000;
        this.dano = (short) dano;
        this.pontosDeExperiencia = 0;
        this.sexo = sexo;
        this.nivel = 1;
        this.idUsuario =+ 1;
    }

    public Jogador(String string, int i, int j) {
    }

    public void atacar (Inimigo inimigo) {
        System.out.println(nome+ " com " +dano+ " de dano atacou " +inimigo.getNome());
        //System.out.println();
        inimigo.pederVida(dano);
        pontosDeExperiencia =+ 250;
    }

    public void pederVida (Short danoInimigo) {  
        vida = (short) (vida - danoInimigo);      
        if (vida <= 0) {
            vida = 0;
            System.out.println(nome+ " morreu.\n");
        
        } else if (vida >= 1) {
            System.out.println("perdeu " +danoInimigo+ " de vida, vida atual: " +vida);
            System.out.println();
            pontosDeExperiencia =- 50;
        }        
    }

    public void status() {
        System.out.println("ID: " +idUsuario);
        System.out.println("Jogador: " +nome);
        System.out.println("Vida: " +vida);
        System.out.println("Dano: " +dano);
        System.out.println("Pontos de experiencia: " +pontosDeExperiencia);
        System.out.println("Nível: " +nivel);
        System.out.println();
    }
   
    public int getVida() {
    	return this.vida;
    }

    public void setVida(short vida) {
	    this.vida = vida;
    }

    public int getDano() {
    	return this.dano;
    }

    public void setDano(short dano) {
    	this.dano = dano;
    }

    public String getNome() {
        return this.nome;
    }
}
