package gradinaZoologica;

public class UrsPanda extends Animal{
	private int nr_ore_dormite;
	public UrsPanda(String nume,int varsta,String culoare,Mancare[] mancare,int nr_feluri_mancare) {
		super(nume,varsta,culoare,mancare,nr_feluri_mancare);
	}
	public UrsPanda(String nume,int varsta,String culoare,Mancare[] mancare,int nr_feluri_mancare,int nr_ore_dormite) {
		this(nume,varsta,culoare,mancare,nr_feluri_mancare);
		this.nr_ore_dormite = nr_ore_dormite;
	}
	@Override
	public String mananca(int i) {
		if(i >= this.getNr_feluri_mancare())
			return null;
		else
			return "Ursul panda " + this.getNume() + " a primit " + this.getMancare()[i].getNume();
	}

	@Override
	public void activitatePreferata() {
		System.out.println("Ursul panda "+ this.getNume() + " a dormit " + nr_ore_dormite + " ore");
	}

}
