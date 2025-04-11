package excepciones.ejer2;

public class MainCuentaCorriente {
	public static void main(String[] args) {
		// Creo dos cuentas
		try {
			CuentaCorriente c1 = new CuentaCorriente("52077975H", "Ruben", 20000);
		} catch (SaldoNegativoException e) {
			System.out.println(e);
		} catch (DniSinNueveDigitosException e) {
			System.out.println(e);
		} catch (NombreVacioException e) {
			System.out.println(e);
		} finally {
		}
	}

}
