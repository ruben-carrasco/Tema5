package excepciones.ejer3;

public class PrecioNegativoException extends Exception {
	public String toString() {
		return "El precio no puede ser negativo";
	}

}
