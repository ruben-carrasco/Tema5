package boletin1.ejer4;

public class Lavadora extends Electrodomestico{
	private double carga = 5;

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		
	}

	public Lavadora(double precioBase, double peso, char consumo, String color, double carga) {
		super(precioBase, peso, consumo, color);
		if (carga > 0) {
			this.carga = carga;
		}
	}

	/**
	 * @return devuelve la carga
	 */
	public double getCarga() {
		return carga;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if (carga > 30) {
			this.precioBase += 50;
		}
	}
	
	
	

}
