package excepciones.ejer4;

public class MesIncorrectoException extends Exception {
	public String toString() {
		return "El mes debe ser mayor o igual a 1";
	}

}
