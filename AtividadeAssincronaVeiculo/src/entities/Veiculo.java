package entities;

public class Veiculo {
	//Quantidade de pneus, motor (potencia ou cilindrada), quantidadede passageiros, tipo de combustível.
	
	protected String tipo;
	private String combustivel;
	private int pneus , passageiros;
	private double motor;
	
	public Veiculo() {
		
	}
	public Veiculo(String combustivel , String tipo , int pneus , int passageiros , double motor) {
		this.combustivel = combustivel;
		this.tipo = tipo;
		this.pneus = pneus;
		this.passageiros = passageiros;
		this.motor = motor;
	}
	public double getMotor() {
		return motor;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPneus() {
		return pneus;
	}
	public void setPneus(int pneus) {
		this.pneus = pneus;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	
	@Override
	public String toString() {

		return "\nTipo de veículo cadastrado: " + tipo
				+ "\nPotência ou cilindradas do motor: " + motor
				+ "\nQuantidade de pneus instalados no veículo: " + pneus
				+ "\nQuantidade de passageiros que o veículo transporta: " + passageiros
				+"\nPode ser abastecido com: " + combustivel;
	}
}
