package comparator.ejer4;

import java.util.ArrayList;
import java.util.Collections;

public class MainFicha {
	public static void main(String[] args) {
		Libro l1 = new Libro(10, "berserk", "wdwd", "Panini");
		Libro l2 = new Libro(12, "Albion", "wdwd", "Panini");
		Libro l3 = new Libro(15, "Ñerserk", "wdwd", "Panini");
		Libro l4 = new Libro(20, "Cerserk", "wdwd", "Panini");
		Libro l5 = new Libro(21, "Perserk", "wdwd", "Panini");

		ArrayList<Ficha> fichas = new ArrayList<>();

		fichas.add(l1);
		fichas.add(l2);
		fichas.add(l3);
		fichas.add(l4);
		fichas.add(l5);
		
		// Ordena de forma alfabetica una ficha por su titulo
		//fichas.sort(new ComparaTitulo());
		// Con lambda
		fichas.sort((a,b) -> a.getTitulo().compareTo(b.getTitulo()));
		
		
		for (Ficha f : fichas) {
			System.out.println(f);
		}

		System.out.println();
		
		// Ordena las fichas por su identificador de forma ascendente
		//Collections.sort(fichas);
		// Con lambda
		Collections.sort(fichas, (a,b) -> a.getId() - b.getId());
			
		for (Ficha f : fichas) {
			System.out.println(f);
		}
	}

}
