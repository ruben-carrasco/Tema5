package comparator.ejer2;

/**
 * Clase que representa el socio de una empresa
 */
public class Socio implements Comparable<Socio> {
	/**
	 * Atributo que almacena la id del socio
	 */
	private int id;

	/**
	 * Atributo que almacena el nombre de un socio
	 */
	private String nombre;

	/**
	 * Almacena la edad de un socio
	 */
	private int edad;

	/**
	 * Constructor con todos los atributos
	 */
	public Socio(int id, String nombre, int edad) {
		if (id >= 0) {
			this.id = id;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (edad >= 0) {
			this.edad = edad;
		}
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	/**
	 * Metodo compareTo implementado de la interfaz Comparable
	 * 
	 * @param Socio con el que comparamos
	 * @return 0 si son iguales los socios, 1 si la id del socio es mayor que la del
	 *         introducido por entrada, -1 si es menor
	 */
	@Override
	public int compareTo(Socio s) {
		int res;
		if (this.id < s.id) {
			res = -1;
		} else if (this.id > s.id) {
			res = 1;
		} else {
			res = 0;
		}
		return res;
	}

	/**
	 * Metodo toString que muestra la informacion del objeto por pantalla
	 * 
	 * @return String con la informacion del objeto
	 */
	@Override
	public String toString() {
		return "Empleado ID: " + this.id + ". Nombre: " + this.nombre + ". Edad: " + this.edad;
	}
}
