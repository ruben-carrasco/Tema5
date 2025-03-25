package interfaces.ejer2;

import java.util.Arrays;

public class MainFutbolista {
	public static void main(String[] args) {
		Futbolista[] futbolistas = new Futbolista[5];
		futbolistas[0] = new Futbolista(1,"Ruben",18,10);
		futbolistas[1] = new Futbolista(1,"pepe",18,10);
		futbolistas[2] = new Futbolista(3,"Paco",18,10);
		futbolistas[3] = new Futbolista(1,"Pepe",18,10);
		futbolistas[4] = new Futbolista(4,"Luis",18,10);
		
		Arrays.sort(futbolistas);
		
		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}
	}

}
