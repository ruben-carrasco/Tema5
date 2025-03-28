package analisis.ejer1;

public class Turismo extends Vehiculo {
	enum Uso {
		PROFESIONAL, PARTICULAR
	};

	private int numPlazas;

	private Uso tipoUso;

	public Turismo(String marca, String modelo, String color, String matricula, int numPlazas, String tipoUso) {
		super(marca, modelo, color, matricula);
		if (numPlazas >= 1) {
			this.numPlazas = numPlazas;
		}
		tipoUso = tipoUso.toUpperCase();
		switch (tipoUso) {
		case "PROFESIONAL", "PARTICULAR" -> {
			this.tipoUso = Uso.valueOf(tipoUso);
		}
		}
	}

	public String getTipoUso() {
		return tipoUso.toString();
	}

	public void setTipoUso(String tipoUso) {
		tipoUso = tipoUso.toUpperCase();
		switch (tipoUso) {
		case "PROFESIONAL", "PARTICULAR" -> {
			this.tipoUso = Uso.valueOf(tipoUso);
		}
		}
	}

	public int getNumPlazas() {
		return numPlazas;
	}
}
