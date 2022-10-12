package abstractFactory;

public abstract class CarroFactory {

	public abstract Roda montarRoda();
	public abstract Vidro montarVidro();
	public abstract Direcao montarDirecao();
	public abstract Cambio montarCambio();
	public abstract Som montarSom();
}
