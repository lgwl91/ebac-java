package br.com.lucas;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaJuridica(String nome, String rua, String numero, String cep, String bairro, String cidade,
			String estado, String email, String[] telefone, String cnpj) {
		super(nome, rua, numero, cep, bairro, cidade, estado, email, telefone);
		this.cnpj = cnpj;
	}
	
	public PessoaJuridica() {}
	
	public void imprimirCartaoPessoaJuridica() {
		imprimirCartao();
		System.out.println("Cnpj: " + this.cnpj);
	}
	
}
