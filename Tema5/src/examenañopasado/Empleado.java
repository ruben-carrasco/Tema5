package examenañopasado;

import java.util.Objects;

public class Empleado {
	private String dni;

	private String nombre;

	private double sueldoBase;

	private int horasExtra;

	private static double IMPORTE_HORA_EXTRA;

	public Empleado(String dni) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
	}

	public Empleado(String dni, String nombre, double sueldoBase, int horasExtra) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (sueldoBase >= 0) {
			this.sueldoBase = sueldoBase;
		}
		if (horasExtra >= 0) {
			this.horasExtra = horasExtra;
		}
	}

	/**
	 * @return the sueldoBase
	 */
	public double getSueldoBase() {
		return sueldoBase;
	}

	/**
	 * @param sueldoBase the sueldoBase to set
	 */
	public void setSueldoBase(double sueldoBase) {
		if (sueldoBase >= 0) {
			this.sueldoBase = sueldoBase;
		}
	}

	/**
	 * @return the horasExtra
	 */
	public int getHorasExtra() {
		return horasExtra;
	}

	/**
	 * @param horasExtra the horasExtra to set
	 */
	public void setHorasExtra(int horasExtra) {
		if (horasExtra >= 0) {
			this.horasExtra = horasExtra;
		}
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the iMPORTE_HORA_EXTRA
	 */
	public double getIMPORTE_HORA_EXTRA() {
		return IMPORTE_HORA_EXTRA;
	}
	
	/**
	 * @param iMPORTE_HORA_EXTRA the iMPORTE_HORA_EXTRA to set
	 */
	public static void setIMPORTE_HORA_EXTRA(double importe) {
		if (importe >= 0) {
			IMPORTE_HORA_EXTRA = importe;
		}
	}

	public double calcularComplemento() {
		double res;
		res = this.horasExtra * IMPORTE_HORA_EXTRA;
		return res;
	}
	
	public double sueldoBruto() {
		double res;
		double complemento = calcularComplemento();
		res = this.sueldoBase + complemento;
		return res;
	}
	
	public String toString() {
		return this.dni + " " + this.nombre + "\n" + "Horas extras: " + this.horasExtra + "\n" + "Sueldo bruto: " + this.sueldoBruto();
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		Empleado otroEmpleado = (Empleado) obj;
		return this.dni.equals(otroEmpleado.dni);
	}
	
	

}
