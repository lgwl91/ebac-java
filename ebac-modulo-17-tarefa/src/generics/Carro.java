package generics;

public class Carro extends Veiculo{

	private String volante;

	public Carro(String motor, String escapamento, String volante) {
		super(motor, escapamento);
		this.volante = volante;
	}

	public String getVolante() {
		return volante;
	}

	public void setVolante(String volante) {
		this.volante = volante;
	}

	@Override
	public void ligarMotor() {
		System.out.println("Motor do Carro ligado...");
	}

	public String toString() {
		return "Carro: " + super.getMotor() + " " + super.getEscapamento() + " " + this.volante;
	}
}
