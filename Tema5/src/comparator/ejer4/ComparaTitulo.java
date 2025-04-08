package comparator.ejer4;

import java.util.Comparator;

public class ComparaTitulo implements Comparator<Ficha> {

	@Override
	public int compare(Ficha o1, Ficha o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
	}

}
