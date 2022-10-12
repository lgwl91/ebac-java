package generics;

public abstract class Veiculo {

	private String motor;
	private String escapamento;
	
	public Veiculo(String motor, String escapamento) {
		super();
		this.motor = motor;
		this.escapamento = escapamento;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getEscapamento() {
		return escapamento;
	}

	public void setEscapamento(String escapamento) {
		this.escapamento = escapamento;
	}

	public void ligarMotor() {
		System.out.println("Motor ligado...");
	}
}
