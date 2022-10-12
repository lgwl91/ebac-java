package br.com.lucas;

public class Goleiro extends Jogador {

	@Tabela(value = "agarrarBola")
	private int numeroLuva;

	public int getNumeroLuva() {
		return numeroLuva;
	}

	public void setNumeroLuva(int numeroLuva) {
		this.numeroLuva = numeroLuva;
	}

	public Goleiro(int numeroLuva) {
		super();
		this.numeroLuva = numeroLuva;
	}

	public Goleiro(String nomeJogador, int numeroChuteira, int numeroLuva) {
		super(nomeJogador, numeroChuteira);
		this.numeroLuva = numeroLuva;
	}

	public Goleiro() {
		super();
	}

	@Override
	public void chutarBola() {
		System.out.println("O goleiro chutou a bola");
	}
	
	public void agarrarBola() {
		System.out.println("O goleiro agarrou a bola");
	}

	@Override
	public String toString() {
		return "Goleiro [nomeGoleiro = " + super.getNomeJogador() +
				", numeroChuteira = " + super.getNumeroChuteira() +
				", numeroLuva = " + numeroLuva + "]";
	}
	
	
	
}
