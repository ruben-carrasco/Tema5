package excepciones.ejer3;

public class StockNegativoException extends Exception {
	public String toString() {
		return "El stock no puede ser negativo";
	}

}
