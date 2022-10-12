package annotation;

public class TesteAnnotation {

	@Tabela(value = "Tabela Um")
	public static void Teste() {
		System.out.println("Imprime Teste");
	}
	
	public static void main(String[] args) {
		Teste();
	}

}
