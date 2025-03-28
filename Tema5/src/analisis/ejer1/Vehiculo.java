package analisis.ejer1;

public class Vehiculo {
	private String marca;

	private String modelo;

	private String color;

	private String matricula;

	private boolean estadoMotor = false;

	private int marchaActual = 0;

	private int velocidadActual = 0;

	public Vehiculo(String marca, String modelo, String color, String matricula) {
		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
		if (matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public boolean isEstadoMotor() {
		return estadoMotor;
	}

	public int getMarchaActual() {
		return marchaActual;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	};

	public boolean parar() {
		boolean res = false;
		if (velocidadActual == 0) {
			this.estadoMotor = false; // Parar motor
			this.marchaActual = 0; // Punto muerto
			res = true;
		}
		return res;
	}

	public void arrancar() {
		this.estadoMotor = true;
	}

	public void subirMarcha() {
		if (marchaActual != 5) {
			this.marchaActual++;
		}
	}

	public void bajarMarcha() {
		if (marchaActual != 0) {
			this.marchaActual--;
		}
	}

	public boolean acelerar(int velocidad) {
		boolean res = false;
		if (velocidad > this.velocidadActual) {
			res = true;
			
			while(velocidad > this.velocidadActual) {
				if(velocidadActual == 0 && marchaActual < 1) {
					subirMarcha();
					System.out.println("Cambio de marcha");
				} else if (velocidadActual == 30 && marchaActual < 2) {
					subirMarcha();
					System.out.println("Cambio de marcha");
				} else if (velocidadActual == 50 && marchaActual < 3) {
					subirMarcha();
					System.out.println("Cambio de marcha");
				} else if (velocidadActual == 70 && marchaActual < 4) {
					subirMarcha();
					System.out.println("Cambio de marcha");
				} else if (velocidadActual == 100 && marchaActual < 5) {
					subirMarcha();
					System.out.println("Cambio de marcha");
				}
				this.velocidadActual++;
			}
		}
		return res;
	}

	public boolean frenar(int velocidad) {
		boolean res = false;
		if (velocidad < this.velocidadActual) {
			res = true;
			
			while(velocidad < this.velocidadActual) {
				if(velocidadActual == 99 && marchaActual > 4) {
					bajarMarcha();
					System.out.println("Cambio de marcha");
				} else if (velocidadActual == 69 && marchaActual > 3) {
					bajarMarcha();
					System.out.println("Cambio de marcha");
				} else if (velocidadActual == 49 && marchaActual > 2) {
					bajarMarcha();
					System.out.println("Cambio de marcha");
				} else if (velocidadActual == 29 && marchaActual > 1) {
					bajarMarcha();
					System.out.println("Cambio de marcha");
				} else if (velocidadActual == 0 && marchaActual > 0) {
					bajarMarcha();
					System.out.println("Cambio de marcha");
				}
			}
			this.velocidadActual--;
		}
		return res;
	}
}
