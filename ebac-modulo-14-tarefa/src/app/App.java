package app;

import javax.swing.JOptionPane;

import dao.ClienteSetDAO;
import dao.IClienteDAO;
import model.Cliente;

public class App {

	private static IClienteDAO iClienteDAO;

	public static void main(String[] args) {
		iClienteDAO = new ClienteSetDAO();

		String opcao = JOptionPane.showInputDialog(null,
				"Escolha uma opção:\n1 - Cadastro\n2 - Consultar\n3 - Exclusão\n4 - Alteração\n5 - Sair",
				"Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);

		while (!isOpcaoValida(opcao)) {
			opcao = JOptionPane.showInputDialog(null,
					"Opção inválida!\n\nEscolha uma opção:\n1 - Cadastro\n2 - Consultar\n3 - Exclusão\n4 - Alteração\n5 - Sair",
					"Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);
		}

		while (isOpcaoValida(opcao)) {

			if (isOpcaoSair(opcao)) {
				sair();
			} else if (isCadastro(opcao)) {
				String dados = JOptionPane.showInputDialog(null,
						"Digite os dados do Cliente separados por vígula, conforme abaixo:\n\nNome,CPF,Telefone",
						"Cadastro Cliente", JOptionPane.INFORMATION_MESSAGE);
				cadastrar(dados);
			} else if (isConsulta(opcao)) {
				String dados = JOptionPane.showInputDialog(null, "Digite o CPF do Cliente que deseja consultar:",
						"Consulta Cliente", JOptionPane.INFORMATION_MESSAGE);
				consultar(dados);
			} else if (isExclusao(opcao)) {
				String dados = JOptionPane.showInputDialog(null, "Digite o CPF do Cliente que deseja excluir:",
						"Exclusão Cliente", JOptionPane.INFORMATION_MESSAGE);
				excluir(dados);
			} else {
				String dados = JOptionPane.showInputDialog(null,
						"Digite os dados do Cliente separados por vígula, conforme abaixo:\n\nNome,CPF,Telefone",
						"Atualização Cliente", JOptionPane.INFORMATION_MESSAGE);
				atualizar(dados);
			}

			opcao = JOptionPane.showInputDialog(null,
					"Escolha uma opção:\n1 - Cadastro\n2 - Consultar\n3 - Exclusão\n4 - Alteração\n5 - Sair",
					"Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);

		}

	}

	private static void atualizar(String dados) {
		String[] dadosSeparados = dados.split(",");
		Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2]);
		iClienteDAO.alterar(cliente);
	}

	private static void excluir(String dados) {
		
		Cliente cliente = iClienteDAO.consultar(dados);
		if(cliente == null) {
			JOptionPane.showMessageDialog(null, "Cliente não encontrado :(", "Consulta Cliente",
					JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			iClienteDAO.excluir(dados);
			JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso :)", "Exclusão Cliente",
					JOptionPane.INFORMATION_MESSAGE);
		}
				
	}

	private static void consultar(String dados) {
		Cliente cliente = iClienteDAO.consultar(dados);
		if (cliente != null) {
			JOptionPane.showMessageDialog(null, "Cliente encontrado com sucesso :)\n" + cliente.toString(), "Consulta Cliente",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Cliente não encontrado :(", "Consulta Cliente",
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		String clientesCadastrados = "";
        for (Cliente c : iClienteDAO.buscarTodos()) {
            clientesCadastrados += c.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, "Clientes cadastrados:\n" + clientesCadastrados, "Consulta Cliente",
        		JOptionPane.INFORMATION_MESSAGE);

	}

	private static void cadastrar(String dados) {
		String[] dadosSeparados = dados.split(",");
		Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2]);
		Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
		if (isCadastrado) {
			JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso :)", "Cadastro Cliente",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Cliente já cadastrado :(", "Cadastro Cliente",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private static boolean isExclusao(String opcao) {
		if ("3".equals(opcao)) {
			return true;
		}
		return false;
	}

	private static boolean isConsulta(String opcao) {
		if ("2".equals(opcao)) {
			return true;
		}
		return false;
	}

	private static boolean isCadastro(String opcao) {
		if ("1".equals(opcao)) {
			return true;
		}
		return false;
	}

	private static void sair() {
		JOptionPane.showMessageDialog(null, "Até logo :) ", "Sair",
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	private static boolean isOpcaoSair(String opcao) {
		if ("5".equals(opcao)) {
			return true;
		}
		return false;
	}

	private static boolean isOpcaoValida(String opcao) {
		if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
			return true;
		}
		return false;
	}

}
