package gradinaZoologica;

import java.util.Arrays;

public abstract class Animal {
	private String nume;
	private String culoare;
	private int varsta;
	private Mancare[] mancare;
	private int nr_feluri_mancare;
	public Animal(String nume,int varsta,String culoare,Mancare[] mancare,int nr_feluri_mancare) {
		this.nume = nume;
		this.culoare = culoare;
		this.varsta = varsta;
		this.mancare = mancare;
		this.nr_feluri_mancare = nr_feluri_mancare;
	}
	
	public abstract String mananca(int i);
	public abstract void activitatePreferata();

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public Mancare[] getMancare() {
		return mancare;
	}

	public void setMancare(Mancare[] mancare) {
		this.mancare = mancare;
	}

	public int getNr_feluri_mancare() {
		return nr_feluri_mancare;
	}

	public void setNr_feluri_mancare(int nr_feluri_mancare) {
		this.nr_feluri_mancare = nr_feluri_mancare;
	}

	@Override
	public String toString() {
		return "Animal [nume=" + nume + ", culoare=" + culoare + ", varsta=" + varsta + ", mancare="
				+ Arrays.toString(mancare) + "]";
	}
	
}
