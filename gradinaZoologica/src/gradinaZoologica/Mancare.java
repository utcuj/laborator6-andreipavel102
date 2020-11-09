package gradinaZoologica;

public class Mancare {
	private String nume;
	private int ora;
	private int cantitate;
	public Mancare(String nume,int ora,int cantitate) {
		this.nume = nume;
		this.ora = ora;
		this.cantitate = cantitate;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getOra() {
		return ora;
	}
	public void setOra(int ora) {
		this.ora = ora;
	}
	public int getCantitate() {
		return cantitate;
	}
	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}
	@Override
	public String toString() {
		return "Mancare [nume=" + nume + ", ora=" + ora + ", cantitate=" + cantitate + "]";
	}
	
}
