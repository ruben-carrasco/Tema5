package boletin1.ejer5;

public class Triangulo extends Poligono {
	/**
	 * Atributo que alamaceana el tamaño del lado 1
	 */
	private double lado1 = 1;
	
	/**
	 * Atributo que almacena el tamaño del lado 2
	 */
	private double lado2 = 1;
	
	/**
	 * Atributo que almacena el tamaño del lado 3
	 */
	private double lado3 = 1;

	public Triangulo() {
		super(3);
	}

	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double area() {
		double s = (this.lado1 + this.lado2 + this.lado3) / 2;
		return Math.sqrt(s*(s - this.lado1)*(s - this.lado1)*(s - this.lado3));
	}

	public String toString() {
		return "TRIANGULO: Lado 1 -> " + lado1 + ". Lado 2 -> " + lado2 + ". Lado 3 -> " + lado3;
	}
}
