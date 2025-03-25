package interfaces.ejer2;

public class Futbolista implements Comparable<Futbolista> {

	private int numCamiseta;

	private String nombre;

	private int edad;

	private int numGoles;

	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (edad > 0) {
			this.edad = edad;
		}
		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
	}

	public String toString() {
		return "Nº " + numCamiseta + " Nombre: " + nombre + " Edad: " + edad + " Numero de goles: " + numGoles;
	}
	
	public boolean equals(Object o) {
		Futbolista otroFutbolista = (Futbolista) o;
		return this.numCamiseta == otroFutbolista.numCamiseta && this.nombre.equals(otroFutbolista.nombre);
	}

	@Override
	public int compareTo(Futbolista f) {
		int res = 0;
		if (this.numCamiseta > f.numCamiseta) {
			res = 1;
		} else if (this.numCamiseta < f.numCamiseta) {
			res = -1;
		} else {
			res = this.nombre.compareTo(f.nombre);
		}
		return res;
	}

}
