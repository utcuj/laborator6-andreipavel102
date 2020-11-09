package gradinaZoologica;

public class Pinguin extends Animal{
	private int nr_pasi;
	
	public Pinguin(String nume, int varsta, String culoare, Mancare[] mancare,int nr_feluri_mancare) {
		super(nume, varsta, culoare, mancare, nr_feluri_mancare);
	}
	public Pinguin(String nume, int varsta, String culoare, Mancare[] mancare,int nr_feluri_mancare,int nr_pasi) {
		this(nume, varsta, culoare, mancare, nr_feluri_mancare);
		this.nr_pasi = nr_pasi;
	}
	@Override
	public String mananca(int i) {
		if(i >= this.getNr_feluri_mancare())
			return null;
		else
			return "Pinguinul " + this.getNume() + " a primit " + this.getMancare()[i].getNume();
		
	}
	@Override
	public void activitatePreferata() {
		System.out.println("Pinguinul "+ this.getNume() + " a facut " + nr_pasi + " pasi");
	}
	public int getNr_pasi() {
		return nr_pasi;
	}
	public void setNr_pasi(int nr_pasi) {
		this.nr_pasi = nr_pasi;
	}

}
