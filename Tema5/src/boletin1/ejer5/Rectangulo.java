package boletin1.ejer5;

public class Rectangulo extends Poligono {
	/**
	 * Atributo que almacena el tamaño del lado1
	 */
	private double lado1 = 1;
	
	/**
	 * Atributo que almacena el tamaño del lado2
	 */
	private double lado2 = 1;
	
	/**
	 * Constructor vacio
	 */
	public Rectangulo() {
		super(4);
	}
	
	/**
	 * Constructor con los atributos
	 * @param lado1 tamaño del lado1
	 * @param lado2 tamaño del lado2
	 */
	public Rectangulo(double lado1, double lado2) {
		super(4);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}
	
	/**
	 * Getter con el lado1
	 * @return devuelve el tamaño del lado1
	 */
	public double getLado1() {
		return lado1;
	}
	
	/**
	 * Setter para cambiar el tamaño del lado1
	 * @param lado1 nuevo tamaño del lado 1
	 */
	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}
	
	/**
	 * getter que devuelve el lado 2
	 * @return devuelve el tamaño del lado2
	 */
	public double getLado2() {
		return lado2;
	}
	
	/**
	 * Setter para cambiar el tamaño del lado 2
	 * @param lado2 nuevo tamaño del lado 2
	 */
	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}
	
	/**
	 * Metodo que calcula el area
	 * @return devuelve el area
	 */
	public double area() {
		return this.lado1 * this.lado1;
	}
	
	/**
	 * Imprime un rectangulo
	 */
	@Override
	public String toString() {
		return "RECTANGULO: Lado 1 -> " + lado1 + ". Lado 2 -> " + lado2;
	}
}
