package excepciones.ejer4;

public class Fecha {
	/**
	 * Atributo que almacena el día de la fecha
	 */
	private int dia;

	/**
	 * Atributo que almacena el mes de la fecha
	 */
	private int mes;

	/**
	 * Atributo que almacena el año de la fecha
	 */
	private int año;

	/**
	 * Constructor con los atributos
	 * 
	 * @param dia dia de la fecha
	 * @param mes mes de la fecha
	 * @param año año de la fecha
	 */
	public Fecha(int dia, int mes, int año)
			throws AñoNegativoException, DiaIncorrectoException, MesIncorrectoException {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		if (!this.fechaCorrecta()) {
			if (año < 0) {
				throw new AñoNegativoException();
			} else if (mes < 1) {
				throw new DiaIncorrectoException();
			} else if (dia < 1) {
				throw new MesIncorrectoException();
			}
			this.dia = 1;
			this.mes = 1;
			this.año = 0;

		}
	}

	/**
	 * Getter para leer el día
	 * 
	 * @return el dia de la fecha
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Setter para cambiar el dia
	 * 
	 * @param dia el dia de la fecha
	 */
	public void setDia(int dia) {
		if (dia <= 31) {
			this.dia = dia;
		}
	}

	/**
	 * 
	 * @return El mes de la fecha
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Setter para cambiar el mes de la fecha
	 * 
	 * @param mes el mes de la fecha
	 */
	public void setMes(int mes) {
		if (mes <= 12) {
			this.mes = mes;
		}
	}

	/**
	 * 
	 * @return el año de la fecha
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Setter para cambiar el año de la fecha
	 * 
	 * @param año año de la fecha
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * Metodo para saber si un año es bisiesto
	 * 
	 * @return booleano que es true si el año es bisiesto o false si no lo es
	 */
	public boolean esBisiesto() {
		return this.año % 4 == 0 && this.año % 100 != 0 || this.año % 400 == 0;
	}

	/**
	 * Metodo que comprueba si la fecha es correcta
	 * 
	 * @return booleano true si la fecha es correcta
	 */
	public boolean fechaCorrecta() {
		boolean res = false;

		if (this.año >= 0 && (this.mes <= 12 && this.mes >= 1) && this.dia >= 1) {
			switch (this.mes) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				if (this.dia <= 31)
					res = true;
			}
			case 4, 6, 9, 11 -> {
				if (this.dia <= 30)
					res = true;
			}
			case 2 -> {
				if (this.esBisiesto()) {
					if (this.dia <= 29) {
						res = true;
					}
				} else {
					if (this.dia <= 28) {
						res = true;
					}
				}
			}
			}
		}

		return res;
	}

	/**
	 * Metodo que cambia la fecha por la del día siguiente
	 */
	public void diaSiguiente() {
		this.dia++;
		if (!this.fechaCorrecta()) {
			this.dia = 1;
			this.mes++;
			if (!this.fechaCorrecta()) {
				this.mes = 1;
				this.año++;
			}
		}
	}

	public String toString() {
		String res = "";

		if (this.dia < 10) {
			res += "0" + this.dia + "-";
		} else {
			res += this.dia + "-";
		}

		if (this.mes < 10) {
			res += "0" + this.mes + "-";
		} else {
			res += this.mes + "-";
		}

		res += this.año;

		return res;
	}
}
