package analisis.ejer1;

public class Camion extends Vehiculo {
	private double pesoMax;
	private boolean transportaPeligro;

	public Camion(String marca, String modelo, String color, String matricula, double pesoMax, boolean transportaPeligro) {
		super(marca, modelo, color, matricula);
		if (pesoMax > 0) {
			this.pesoMax = pesoMax;
		}
		this.transportaPeligro = transportaPeligro;
	}

	public boolean isTransportaPeligro() {
		return transportaPeligro;
	}

	public void setTransportaPeligro(boolean transportaPeligro) {
		this.transportaPeligro = transportaPeligro;
	}

	public double getPesoMax() {
		return pesoMax;
	}

}
