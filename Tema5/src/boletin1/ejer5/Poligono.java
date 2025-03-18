package boletin1.ejer5;

/**
 * Clase Poligono abstracta que representa un poligono
 */
public abstract class Poligono {
	/**
	 * Atributo que almacena el numero de lados
	 */
	private int numeroLados;

	/**
	 * Constructor con el numero de lados
	 * 
	 * @param numeroLados Numero de lados del poligono
	 */
	public Poligono(int numeroLados) {
		if (numeroLados > 3)
			this.numeroLados = numeroLados;
	}

	/**
	 * Getter que devuelve el numero de lados
	 * 
	 * @return devuelve el numero de lados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Metodo abstracto para calcular el area
	 * 
	 * @return Devuelve el area
	 */
	public abstract double area();

	/**
	 * Imprime el numero de lados
	 */
	@Override
	public String toString() {
		return "Numero de lados: " + numeroLados;
	}

}
