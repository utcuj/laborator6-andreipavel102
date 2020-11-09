package gradinaZoologica;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		//2
		Scanner scanner = new Scanner(System.in);
		String nume_gradina = scanner.nextLine();
		int nr_animale = scanner.nextInt();
		System.out.println("Gradina se numeste " + nume_gradina + " si are "+nr_animale + " animale");
		
		//3
		GradinaZoologica gradina = new GradinaZoologica(nr_animale,nume_gradina);
		Animal animale[] = new Animal[3];
		//delfin
		Mancare[] manDelfin = new Mancare[2];
		manDelfin[0] = new Mancare("peste",4,10);
		manDelfin[1] = new Mancare("pui",2,13);
		animale[0] = new Delfin("Marcel",4,"albastru",manDelfin,5,10);
		//urs panda
		Mancare[] manUrs = new Mancare[3];
		manUrs[0] = new Mancare("iarba",10,10);
		manUrs[1] = new Mancare("alune",15,13);
		manUrs[2] = new Mancare("nuci",15,17);
		animale[1] = new UrsPanda("Mircea",7,"Alb",manUrs,3,5);
		//pinguin
		Mancare[] manPinguin = new Mancare[2];
		manPinguin[0] = new Mancare("scoici",3,9);
		manPinguin[1] = new Mancare("peste",6,15);
		animale[2] = new Pinguin("Gigi",8,"Negru",manPinguin,2,1000);
		
		for(Animal x : animale) {
			System.out.println(x);
		}
		//4
		Ingrijitor ingrijitor = new Ingrijitor("George",26,animale,3);
		for(Animal x : ingrijitor.getAnimale()) {
			ingrijitor.hraneste(0, x);
		}
		//5
		for(Animal x : animale) {
			x.activitatePreferata();
		}
		scanner.close();
	}

}
