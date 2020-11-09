package gradinaZoologica;

public class Ingrijitor {
	private String nume;
	private int varsta;
	private int nr_animale;
	private Animal[] animale;
	public Ingrijitor(String nume,int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	}
	public Ingrijitor(String nume,int varsta,Animal[] animale,int nr_animale) {
		this.nume = nume;
		this.varsta = varsta;
		this.animale = animale;
		this.nr_animale = nr_animale;
	}
	public void addAnimal(Animal animal) {
		animale[nr_animale++] = animal;
	}
	public void hraneste(int i,Animal animal) {
		String aux = animal.mananca(i);
		if(aux == null)
			System.out.println("Nu exista felul de mancare");
		else
			System.out.println(aux + " de la " + nume);
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public Animal[] getAnimale() {
		return animale;
	}
	public void setAnimale(Animal[] animale) {
		this.animale = animale;
	}
	public int getNr_animale() {
		return nr_animale;
	}
	public void setNr_animale(int nr_animale) {
		this.nr_animale = nr_animale;
	}
	
}
