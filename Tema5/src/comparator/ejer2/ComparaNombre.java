package comparator.ejer2;

import java.util.Comparator;

public class ComparaNombre implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
