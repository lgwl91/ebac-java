package generics;

public class Moto extends Veiculo{

	public String guidom;

	public Moto(String motor, String escapamento, String guidom) {
		super(motor, escapamento);
		this.guidom = guidom;
	}
	
	public String getGuidom() {
		return guidom;
	}

	public void setGuidom(String guidom) {
		this.guidom = guidom;
	}
	
	@Override
	public void ligarMotor() {
		System.out.println("Motor da Moto ligado...");
	}

	public String toString() {
		return "Moto: " + super.getMotor() + " " + super.getEscapamento() + " " + this.guidom;
	}
}
