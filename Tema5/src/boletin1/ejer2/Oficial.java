package boletin1.ejer2;

public class Oficial extends Operario {
	
	/**
	 * Constructor con el nombre
	 * @param nombre
	 */
	public Oficial(String nombre) {
		super(nombre);
	}
	
	/**
	 * Metodo toString
	 */
	public String toString() {
		return super.toString() + " -> Oficial";
	}

}
