package br.com.lucas;

public abstract class Pessoa {
	
	private String nome;
	private String rua;
	private String numero;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	private String email;
	private String[] telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getTelefone() {
		return telefone;
	}
	public void setTelefone(String[] telefone) {
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, String rua, String numero, String cep, String bairro, String cidade, String estado,
			String email, String[] telefone) {
		super();
		this.nome = nome;
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.email = email;
		this.telefone = telefone;
	}
	public Pessoa() {}
	
	public void imprimirCartao() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Rua: " + this.rua);
		System.out.println("Numero: " + this.numero);
		System.out.println("Cep: " + this.cep);
		System.out.println("Bairro: " + this.bairro);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Estado: " + this.estado);
		System.out.println("Email: " + this.email);
		for(String tel : this.telefone) {
			System.out.println("Telefone: " + tel);
		}
	}
}
