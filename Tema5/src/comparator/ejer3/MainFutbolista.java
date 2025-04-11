package comparator.ejer3;

import java.util.Arrays;

public class MainFutbolista {
	public static void main(String[] args) {
		Futbolista[] futbolistas = new Futbolista[5];
		futbolistas[0] = new Futbolista(1, "Ruben", 18, 10);
		futbolistas[1] = new Futbolista(1, "pepe", 18, 13);
		futbolistas[2] = new Futbolista(3, "Paco", 20, 10);
		futbolistas[3] = new Futbolista(1, "Pepe", 76, 9);
		futbolistas[4] = new Futbolista(4, "Luis", 27, 19);
		
		// edad ascendente
		//Arrays.sort(futbolistas, new ComparaEdad());
		// con lambda
		Arrays.sort(futbolistas, (a,b) -> a.getEdad() - b.getEdad());

		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}

		System.out.println();
		
		// de mas goles a menos goles
		//Arrays.sort(futbolistas, new ComparaGoles());
		// Con lambda
		Arrays.sort(futbolistas, (a,b) -> b.getNumGoles() - a.getNumGoles());

		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}
	}

}
