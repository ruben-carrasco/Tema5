package excepciones.ejer1;

public class NegativeHourException extends Exception {
	public String toString() {
		return "La hora no pueden ser negativos";
	}
}
