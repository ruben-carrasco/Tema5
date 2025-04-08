package comparator.ejer4;

import comparator.ejer2.Socio;

public abstract class Ficha implements Comparable<Ficha> {
	private int id;
	private String titulo;

	public Ficha(int id, String titulo) {
		if (id > 0) {
			this.id = id;
		}
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public abstract int tiempoPrestado();

	public int compareTo(Ficha s) {
		return this.id - s.id;
	}

	public String toString() {
		return id + " Titulo: " + titulo;
	}
}
