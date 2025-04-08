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

		Arrays.sort(futbolistas, new ComparaEdad());

		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}

		System.out.println();

		Arrays.sort(futbolistas, new ComparaGoles());

		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}
	}

}
