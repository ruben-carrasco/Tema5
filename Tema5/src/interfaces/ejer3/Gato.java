package interfaces.ejer3;

import java.util.Random;

public class Gato extends AnimalDomestico {

	@Override
	public void hacerRuido() {
		System.out.println("Miauu");
	}

	@Override
	public boolean hacerCaso() {
		Random rand = new Random();
		return rand.nextInt(1, 101) <= 5;
	}

}
