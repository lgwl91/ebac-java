package abstractFactory;

public class Carro {
	
	Roda roda;
	Vidro vidro;
	Direcao direcao;
	Cambio cambio;
	Som som;
	
	public Roda getRoda() {
		return roda;
	}
	public void setRoda(Roda roda) {
		this.roda = roda;
	}
	public Vidro getVidro() {
		return vidro;
	}
	public void setVidro(Vidro vidro) {
		this.vidro = vidro;
	}
	public Direcao getDirecao() {
		return direcao;
	}
	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}
	public Cambio getCambio() {
		return cambio;
	}
	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}
	public Som getSom() {
		return som;
	}
	public void setSom(Som som) {
		this.som = som;
	}
	
	public String toString() {
		return "Carro [roda=" + roda + ", vidro=" + vidro + ", direcao=" + direcao + ", cambio=" + cambio + ", som="
				+ som + "]";
	}
	
}
