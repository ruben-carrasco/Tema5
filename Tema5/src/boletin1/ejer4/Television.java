package boletin1.ejer4;

public class Television extends Electrodomestico {
	private int resolucion = 20;
	
	private boolean sintonizadorTDT;

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		
	}

	public Television(double precioBase, double peso, char consumo, String color, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso, consumo, color);
		if (resolucion > 0) {
			this.resolucion = resolucion;
		}
		this.sintonizadorTDT = sintonizadorTDT;
	}

	/**
	 * @return the resolucion
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * @return the sintonizadorTDT
	 */
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if (resolucion > 40) {
			this.precioBase += (this.precioBase * 0.3);
		}
		if (sintonizadorTDT) {
			this.precioBase += 50;
		}
	}
	

}
