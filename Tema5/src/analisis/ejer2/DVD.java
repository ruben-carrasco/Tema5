package analisis.ejer2;

public class DVD extends Ficha {
	enum Tipo {
		PELICULA, DOCUMENTAL, SERIE
	}

	private String director;
	private long año;
	private Tipo tipoDvd;

	public DVD(int id, String titulo, String director, long año, String tipoDvd) {
		super(id, titulo);
		if (director != null && !director.isBlank()) {
			this.director = director;
		}
		if (año > 0) {
			this.año = año;
		}
		tipoDvd = tipoDvd.toUpperCase();
		switch (tipoDvd) {
		case "PELICULA", "DOCUMENTAL", "SERIE" -> {
			this.tipoDvd = Tipo.valueOf(tipoDvd);
		}
		}
	}

	public String getDirector() {
		return director;
	}

	public long getAño() {
		return año;
	}

	public String getTipoDvd() {
		return tipoDvd.toString();
	}

	@Override
	public int tiempoPrestado() {
		return 5;
	}

}
