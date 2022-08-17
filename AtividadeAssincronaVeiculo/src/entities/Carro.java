package entities;

public class Carro extends Veiculo {
	
	protected String arCondicionado;
	protected int portas;
	
	public Carro (){
		
	}
	public Carro(String arCondicionado, int portas , String combustivel, String tipo, int pneus,
			int passageiros, double motor) {
		super(combustivel, tipo, pneus, passageiros, motor);
		this.arCondicionado = arCondicionado;
		this.portas = portas;
	}
	public String getArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(String arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	
	@Override
	public String toString() {

		return super.toString() + "O carro " + arCondicionado + " ar condicionado."
				+ "\nQuantidade de portas: " + portas;
	}


}
