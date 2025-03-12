package boletin1.ejer2;

public class Directivo extends Empleado {
	
	/**
	 * Constructor con el nombre
	 * @param nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
	}
	
	/**
	 * Metodo toString
	 */
	public String toString() {
		return super.toString() + " -> Directivo";
	}

}
