package abstractFactory;

public class TesteFactory {

	private static Carro montarCarro(String modelo) {
		
		CarroFactory cf = null;
		
		switch(modelo) {
			case "basic":
				cf = new CarroBasicFactory();
				break;
			case "confort":
				cf = new CarroConfortFactory();
				break;
		}
		
		Carro carro = new Carro();
		
		carro.setRoda(cf.montarRoda());
		carro.setVidro(cf.montarVidro());
		carro.setDirecao(cf.montarDirecao());
		carro.setCambio(cf.montarCambio());
		carro.setSom(cf.montarSom());
		
		return carro;
	}
	
	public static void main(String[] args) {
		
		Carro carroBasic = montarCarro("basic");
		Carro carroConfort = montarCarro("confort");
		
		System.out.println(carroBasic.toString());
		System.out.println(carroConfort.toString());
	}

}
