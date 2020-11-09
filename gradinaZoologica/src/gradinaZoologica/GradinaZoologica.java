package gradinaZoologica;

public class GradinaZoologica {
	private int nr_animale;
	private String numeGradina;
	private Animal[] animale;
	public GradinaZoologica(int nr_animale,String numeGradina) {
		this.nr_animale = nr_animale;
		this.numeGradina = numeGradina;
		animale = new Animal[nr_animale];
	}
	public int getNr_animale() {
		return nr_animale;
	}
	public void setNr_animale(int nr_animale) {
		this.nr_animale = nr_animale;
	}
	public String getNumeGradina() {
		return numeGradina;
	}
	public void setNumeGradina(String numeGradina) {
		this.numeGradina = numeGradina;
	}
	public Animal[] getAnimale() {
		return animale;
	}
	public void setAnimale(Animal[] animale) {
		this.animale = animale;
	}
	
}
