package exemploSaulo;

import java.util.ArrayList;

public class Aluno {

	private int matricula;
	private String nome;
	private ArrayList<Double> notas;
	
	public Aluno() {
		super();
		this.notas = new ArrayList<>();
	}

	public Aluno(int matricula, String nome, ArrayList<Double> notas) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Double> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Double> notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", notas=" + notas + "]";
	}
	
	public void adicionarNota(Double nota) {
		this.notas.add(nota);
	}
	
	public Double calcularMedia() {
		Double media = 0.0;
		Integer conta = 0;
		for(Double n : this.notas) {
			conta++;
			media += n;
		}
		return media/conta;
	}

}
