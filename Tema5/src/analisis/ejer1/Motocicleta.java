package analisis.ejer1;

public class Motocicleta extends Vehiculo {
	private int cilindrada;

	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		if (cilindrada > 50) {
			this.cilindrada = cilindrada;
		}
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public boolean requiereCarnet(int cilindrada) {
		return cilindrada >= 125;
	}

}
