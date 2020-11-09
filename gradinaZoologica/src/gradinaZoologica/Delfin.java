package gradinaZoologica;

public class Delfin extends Animal{
	private int km_inotati;
	public Delfin(String nume,int varsta,String culoare,Mancare[] mancare,int nr_feluri_mancare) {
		super(nume,varsta,culoare,mancare,nr_feluri_mancare);
	}
	public Delfin(String nume,int varsta,String culoare,Mancare[] mancare,int nr_feluri_mancare,int km_inotati) {
		this(nume,varsta,culoare,mancare,nr_feluri_mancare);
		this.km_inotati = km_inotati;
	}
	@Override
	public String mananca(int i) {
		if(i >= this.getNr_feluri_mancare())
			return null;
		else
			return "Delfinul " + this.getNume() + " a primit " + this.getMancare()[i].getNume();
	}
	@Override
	public void activitatePreferata() {
		System.out.println("Delfinul " + this.getNume() + " a alergat " + km_inotati +" km");
	}
	public int getKm_inotati() {
		return km_inotati;
	}
	public void setKm_inotati(int km_inotati) {
		this.km_inotati = km_inotati;
	}
}
