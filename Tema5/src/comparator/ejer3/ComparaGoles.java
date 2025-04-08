package comparator.ejer3;

import java.util.Comparator;

public class ComparaGoles implements Comparator<Futbolista>{

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o2.getNumGoles() - o1.getNumGoles();
	}

}
