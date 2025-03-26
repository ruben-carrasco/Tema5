package interfaces.ejer3;

import java.util.Random;

public class Perro extends AnimalDomestico {

	@Override
	public void hacerRuido() {
		System.out.println("Guau");
	}

	@Override
	public boolean hacerCaso() {
		Random rand = new Random();
		return rand.nextInt(1, 101) <= 90;
	}

}
