package boletin1.ejer4;

public class Electrodomestico {
	/**
	 * enumerado con todos los colores posibles
	 */
	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * Atributo que almacena el precioBase
	 */
	protected double precioBase = 100;

	/**
	 * Atributo que almacena el consumo
	 */
	private char consumo = 'F';

	/**
	 * Atributo que almacena el color
	 */
	private Color color = Color.BLANCO;

	/**
	 * Atributo que almacena el peso
	 */
	private double peso = 5;

	/**
	 * Constructor con el precioBase y el peso
	 * 
	 * @param precioBase Precio base del electrodomestico
	 * @param peso       Peso del electrodomestico
	 */
	public Electrodomestico(double precioBase, double peso) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor con todos los atributos
	 * 
	 * @param precioBase Precio base del electrodomestico
	 * @param peso       Peso del electrodomestico
	 * @param consumo    Consumo del electrodomestico
	 * @param color      Color del electrodomestico
	 */
	public Electrodomestico(double precioBase, double peso, char consumo, String color) {
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
		if (comprobarConsumoEnergetico(consumo)) {
			this.consumo = consumo;
		}
		color = color.toUpperCase();
		if (comprobarColor(color)) {
			this.color = Color.valueOf(color);
		}
	}

	/**
	 * @return devuelve el precio
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @param precioBase Nuevo precio base del electrodomestico
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * @return devuelve el consumo
	 */
	public char getConsumo() {
		return consumo;
	}

	/**
	 * @return devuelve el color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @return devuelve el peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Metodo que comprueba si es correcto el consumo
	 * 
	 * @param letra Letra del consumo
	 * @return devuelve true si es correcto false si no
	 */
	private boolean comprobarConsumoEnergetico(char letra) {
		return letra >= 'A' && letra <= 'F';
	}

	/**
	 * Metodo que comprueba si el color es correcto
	 * 
	 * @param color Color del electrodomestico
	 * @return true si es correcto, false si no
	 */
	private boolean comprobarColor(String color) {
		boolean res = false;
		if (color != null && !color.isBlank()) {
			switch (color) {
			case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> {
				res = true;
			}
			}
		}
		return res;
	}

	/**
	 * Metodo que aumenta el precioBase según consumo y peso
	 */
	public void precioFinal() {
		switch (this.consumo) {
		case 'A' -> {
			this.precioBase += 100;
		}
		case 'B' -> {
			this.precioBase += 80;
		}
		case 'C' -> {
			this.precioBase += 60;
		}
		case 'D' -> {
			this.precioBase += 50;
		}
		case 'E' -> {
			this.precioBase += 30;
		}
		case 'F' -> {
			this.precioBase += 10;
		}
		}

		if (this.peso > 0 && this.peso <= 19) {
			this.precioBase += 10;
		}
		if (this.peso >= 20 && this.peso <= 49) {
			this.precioBase += 50;
		}
		if (this.peso >= 50 && this.peso <= 79) {
			this.precioBase += 80;
		}
		if (this.peso >= 80) {
			this.precioBase += 100;
		}
	}
}
