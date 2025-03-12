package boletin1.ejer2;

public class Operario extends Empleado {
	
	/**
	 * Constructor con el nombre
	 * @param nombre
	 */
	public Operario(String nombre) {
		super(nombre);
	}
	
	/**
	 * Metodo toString
	 */
	public String toString() {
		return super.toString() + " -> Operario";
	}
}
