package excepciones.ejer1;

public class Hora {
	/**
	 * Atributo que almacena la hora
	 */
	private int hora;

	/**
	 * Atributo que almacena el minuto
	 */
	private int minuto;

	/**
	 * Atributo que almacena el segundo
	 */
	private int segundo;
	
	/**
	 * Constructor con todos los atributos
	 * 
	 * @param hora    hora de la hora
	 * @param minuto  minuto de la hora
	 * @param segundo segundo de la hora
	 */
	public Hora(int hora, int minuto, int segundo)
			throws NegativeSecondException, NegativeMinuteException, NegativeHourException {
		if (hora < 24 && hora > 0) {
			this.hora = hora;
		} else if (hora < 0) {
			throw new NegativeHourException();
		}
		if (minuto < 60 && minuto > 0) {
			this.minuto = minuto;
		} else if (minuto < 0) {
			throw new NegativeMinuteException();
		}
		if (segundo < 60 && segundo > 0) {
			this.segundo = segundo;
		} else if (segundo < 0) {
			throw new NegativeSecondException();
		}
	}

	/**
	 * @return Devuelve la hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * @param hora La hora que se va a establecer
	 */
	public void setHora(int hora) throws NegativeHourException {
		if (hora < 24 && hora > 0) {
			this.hora = hora;
		} else if (hora < 0) {
			throw new NegativeHourException();
		}
	}

	/**
	 * @return Devuelve el minuto
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * @param minuto el minuto que se va a establecer
	 */
	public void setMinuto(int minuto) throws NegativeMinuteException {
		if (minuto < 60 && minuto > 0) {
			this.minuto = minuto;
		} else if (minuto < 0) {
			throw new NegativeMinuteException();
		}
	}

	/**
	 * @return devuelve el segundo
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * @param segundo el segundo que se va a establecer
	 */
	public void setSegundo(int segundo) throws NegativeSecondException {
		if (segundo < 60 && segundo > 0) {
			this.segundo = segundo;
		} else if (segundo < 0) {
			throw new NegativeSecondException();
		}
	}

	/**
	 * Metodo para incrementar un segundo
	 */
	public void incrementaSegundo() {
		this.segundo++;

		if (this.segundo == 60) {
			this.segundo = 0;
			this.minuto++;
			if (this.minuto == 60) {
				this.minuto = 0;
				this.hora++;
				if (this.hora == 24) {
					this.hora = 0;
				}
			}
		}

	}

}
