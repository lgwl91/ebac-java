package br.com.lucas;

public abstract class Jogador {

	private String nomeJogador;
	private int numeroChuteira;
	
	public Jogador() {
		super();
	}
	
	public Jogador(String nomeJogador, int numeroChuteira) {
		super();
		this.nomeJogador = nomeJogador;
		this.numeroChuteira = numeroChuteira;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public int getNumeroChuteira() {
		return numeroChuteira;
	}

	public void setNumeroChuteira(int numeroChuteira) {
		this.numeroChuteira = numeroChuteira;
	}

	public void chutarBola() {
		System.out.println("O jogador chutou a bola");
	}
}
