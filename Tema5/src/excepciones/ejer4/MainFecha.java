package excepciones.ejer4;

public class MainFecha {
	public static void main(String[] args) {
		Fecha fecha1 = null;

		try {
			fecha1 = new Fecha(10, 12, 2024);
		} catch (AñoNegativoException e) {
			System.out.println(e);
		} catch (MesIncorrectoException e) {
			System.out.println(e);
		} catch (DiaIncorrectoException e) {
			System.out.println(e);
		} finally {
		}

		System.out.println(fecha1.esBisiesto());

		fecha1.diaSiguiente();

		System.out.println(fecha1);
	}

}
