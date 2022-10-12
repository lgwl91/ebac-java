package br.com.lucas;

public class Programa {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		String[] tel = {"21 2222-3333","21 3333-4444"};
		
		pf.setNome("Lucas");
		pf.setRua("A");
		pf.setNumero("123");
		pf.setCep("27000-001");
		pf.setBairro("Centro");
		pf.setCidade("Rio de Janeiro");
		pf.setEstado("RJ");
		pf.setEmail("lucas@gmail.com");
		pf.setTelefone(tel);
		pf.setCpf("12345678901");
		
		pf.imprimirCartaoPessoaFisica();
		
		System.out.println("\n###################################\n");
		
		PessoaJuridica pj = new PessoaJuridica();
		String[] tel2 = {"11 4444-5555","11 5555-6666"};
		
		pj.setNome("Empresa SA");
		pj.setRua("B");
		pj.setNumero("789");
		pj.setCep("11000-009");
		pj.setBairro("Centro");
		pj.setCidade("Sao Paulo");
		pj.setEstado("SP");
		pj.setEmail("empresasa@gmail.com");
		pj.setTelefone(tel2);
		pj.setCnpj("11222333000100");
		
		pj.imprimirCartaoPessoaJuridica();
	}

}
