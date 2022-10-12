package abstractFactory;

public class CarroConfortFactory extends CarroFactory{

	public Roda montarRoda() {
		return new Roda15();
	}

	public Vidro montarVidro() {
		return new VidroDianteiroTraseiro();
	}

	public Direcao montarDirecao() {
		return new DirecaoEletrica();
	}

	public Cambio montarCambio() {
		return new CambioAutomatico();
	}

	public Som montarSom() {
		return new SomMultiMediaBT();
	}

}
