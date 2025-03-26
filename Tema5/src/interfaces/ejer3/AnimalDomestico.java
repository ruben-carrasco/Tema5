package interfaces.ejer3;

import java.util.Random;

public abstract class AnimalDomestico implements Animal {

	private String nombre;

	private String raza;

	private double peso;

	private String color;

	public void vacunar() {
		System.out.println("Vacunado");
	}

	public abstract boolean hacerCaso();

	@Override
	public void comer() {
		System.out.println("Come");
	}

	@Override
	public void dormir() {
		System.out.println("Duerme");
	}

	@Override
	public abstract void hacerRuido();
}
