package boletin1.ejer2;

public class Empleado {
	/**
	 * Atributo que almacena el nombre
	 */
	private String nombre;
	
	/**
	 * Constructor con el nombre
	 * @param nombre Nombre del empleado
	 */
	public Empleado(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Getter del nombre
	 * @return devuelve el nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Setter para cambiar el nombre
	 * @param nombre Nuevo nombre
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Metodo toString
	 */
	public String toString() {
		return "Empleado " + this.nombre;
	}
	
	

}
