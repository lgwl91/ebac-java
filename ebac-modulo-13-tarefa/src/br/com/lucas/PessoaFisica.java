package br.com.lucas;

public class PessoaFisica extends Pessoa {
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public PessoaFisica(String nome, String rua, String numero, String cep, String bairro, String cidade, String estado,
			String email, String[] telefone, String cpf) {
		super(nome, rua, numero, cep, bairro, cidade, estado, email, telefone);
		this.cpf = cpf;
	}
	
	public PessoaFisica() {}
	
	public void imprimirCartaoPessoaFisica() {
		imprimirCartao();
		System.out.println("Cpf: " + this.cpf);
	}
	
}
