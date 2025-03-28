package analisis.ejer1;

public class mainVehiculo {
	public static void main(String[] args) {
		Vehiculo v = new Vehiculo("Seat", "Ibiza", "Rojo", "23124Z");
		
		v.arrancar();
		v.isEstadoMotor();
		v.acelerar(100);
		System.out.println(v.getVelocidadActual());
		System.out.println(v.getMarchaActual());
		v.frenar(40);
		System.out.println(v.getVelocidadActual());
		System.out.println(v.getMarchaActual());
	}

}
