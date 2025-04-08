package comparator.ejer3;

import java.util.Comparator;

public class ComparaEdad implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o1.getEdad() - o2.getEdad();
	}

}
