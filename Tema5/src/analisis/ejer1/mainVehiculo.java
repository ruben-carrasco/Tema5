package analisis.ejer1;

public class mainVehiculo {
	public static void main(String[] args) {
		Vehiculo v = new Vehiculo("Seat", "Ibiza", "Rojo", "23124Z");
		
		v.arrancar();
		v.isEstadoMotor();
		v.acelerar(150);
		System.out.println(v.getVelocidadActual());
		System.out.println(v.getMarchaActual());
		v.frenar(70);
		System.out.println(v.getVelocidadActual());
		System.out.println(v.getMarchaActual());
	}

}
