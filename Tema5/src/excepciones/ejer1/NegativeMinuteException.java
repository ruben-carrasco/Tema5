package excepciones.ejer1;

public class NegativeMinuteException extends Exception {
	public String toString() {
		return "Los minutos no pueden ser negativos";
	}
}
