package excepciones.ejer1;

public class MainHora {
	public static void main(String[] args) {
		// Creo un objeto hora
		Hora hora1 = null;
		
		try {
			hora1 = new Hora(2,24,34);
			hora1.setHora(-1);
			hora1.setMinuto(-2);
			hora1.setSegundo(-2);
		} catch (NegativeSecondException e) {
			System.out.println(e);
		} catch (NegativeMinuteException e) {
			System.out.println(e);
		} catch (NegativeHourException e) {
			System.out.println(e);
		} finally {
		}

		
		// Incremento la hora
		hora1.incrementaSegundo();
		
		// Muestro la hora
		System.out.print(hora1.getHora() + ":");;
		System.out.print(hora1.getMinuto() + ":");
		System.out.print(hora1.getSegundo());
	}

}
