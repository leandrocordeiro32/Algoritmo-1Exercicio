package entities;

public class Moto extends Veiculo {
	
	protected String bau , aro;
	
	
	public Moto (){
		
	}
	public Moto(String bau , String aro , String combustivel , String tipo , int pneus , int passageiros , double motor) {
		super (combustivel , tipo , pneus , passageiros , motor); 
		this.bau = bau;
		this.aro = aro;
	}
	public String getBau() {
		return bau;
	}
	public void setBau(String bau) {
		this.bau = bau;
	}
	public String getAro() {
		return aro;
	}
	public void setAro(String aro) {
		this.aro = aro;
	}
	@Override
	public String toString() {

		return super.toString() + "Possui baú bagageiro: " + bau
				+ "\nAro: " + aro;
	}

}
