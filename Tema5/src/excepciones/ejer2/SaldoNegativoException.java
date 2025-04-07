package excepciones.ejer2;

public class SaldoNegativoException extends Exception {
	public String toString() {
		return "El saldo no puede ser negativo";
	}

}
