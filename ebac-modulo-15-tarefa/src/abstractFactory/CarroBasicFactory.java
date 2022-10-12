package abstractFactory;

public class CarroBasicFactory extends CarroFactory{

	public Roda montarRoda() {
		return new Roda14();
	}

	public Vidro montarVidro() {
		return new VidroDianteiro();
	}

	public Direcao montarDirecao() {
		return new DirecaoHidraulica();
	}

	public Cambio montarCambio() {
		return new CambioManual();
	}

	public Som montarSom() {
		return new SomCDPlayerBT();
	}

}
