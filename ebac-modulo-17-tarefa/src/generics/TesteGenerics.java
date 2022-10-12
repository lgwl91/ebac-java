package generics;

public class TesteGenerics {

	public static void main(String[] args) {

		Impressora<Carro> ic = new Impressora<>();
		
		Carro c1 = new Carro("1.0","Cano único","Padrão");
		Carro c2 = new Carro("1.6 LT","Cano bipartido","Multimedia");
		
		ic.adicionar(c1);
		ic.adicionar(c2);
		ic.imprimir();
		
		Impressora<Moto> im = new Impressora<>();
		
		Moto m1 = new Moto("300","Comum","Padrão");
		Moto m2 = new Moto("600","Esportivo","Curto");
		
		im.adicionar(m1);
		im.adicionar(m2);
		im.imprimir();
	}

}
