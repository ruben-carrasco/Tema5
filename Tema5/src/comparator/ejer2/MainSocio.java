package comparator.ejer2;

import java.util.ArrayList;
import java.util.Collections;

public class MainSocio {
	public static void main(String[] args) {
		Socio s = new Socio(1, "paco", 18);
		Socio s2 = new Socio(2, "frias", 21);
		Socio s3 = new Socio(1, "antonio", 20);
		Socio s4 = new Socio(3, "bartolo", 17);
		ArrayList<Socio> socios = new ArrayList<>();

		System.out.println(s.compareTo(s3));
		System.out.println(s2.compareTo(s));

		socios.add(s);
		socios.add(s2);
		socios.add(s3);
		socios.add(s4);
		Collections.sort(socios, new ComparaNombre());

		for (Socio so : socios) {
			System.out.println(so);
		}

		System.out.println();

		Collections.sort(socios, new ComparaEdad());

		for (Socio so : socios) {
			System.out.println(so);
		}

	}

}
