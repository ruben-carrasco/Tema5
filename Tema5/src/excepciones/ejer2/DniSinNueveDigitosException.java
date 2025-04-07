package excepciones.ejer2;

public class DniSinNueveDigitosException extends Exception {
	public String toString() {
		return "El dni debe tener 9 digitos";
	}

}
