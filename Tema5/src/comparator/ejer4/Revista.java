package comparator.ejer4;

public class Revista extends Ficha {
	private String infoNumero;
	private long añoPublicacion;

	public Revista(int id, String titulo, String infoNumero, long añoPublicacion) {
		super(id, titulo);
		if (infoNumero != null && !infoNumero.isBlank()) {
			this.infoNumero = infoNumero;
		}
		if (añoPublicacion > 0) {
			this.añoPublicacion = añoPublicacion;
		}
	}

	public String getInfoNumero() {
		return infoNumero;
	}

	public long getAñoPublicacion() {
		return añoPublicacion;
	}

	@Override
	public int tiempoPrestado() {
		return 10;
	}

}
