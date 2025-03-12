package boletin1.ejer2;

public class Tecnico extends Operario {
	
	/**
	 * Constructor con el nombre
	 * @param nombre
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	/**
	 * Metodo toString
	 */
	public String toString() {
		return super.toString() + " -> Tecnico";
	}

}
