package boletin1.ejer1;

public class Hora {
	/**
	 * Atributo que almacena la hora
	 */
	private int hora;
	
	/**
	 * Atributo que almacena los minutos
	 */
	private int minutos;
	
	/**
	 * Constructor con la hora y los minutos
	 * @param hora Hora de la hora
	 * @param minutos Minutos de la hora
	 */
	public Hora(int hora, int minutos) {
		if (hora < 24) {
			this.hora = hora;
		}
		if (minutos < 60) {
			this.minutos = minutos;
		}
	}
	
	/**
	 * Metodo que incrementa un segundo la hora
	 */
	public void inc() {
		if (++minutos == 60) {
			minutos = 0;
			if(++hora == 24) {
				hora = 0;
			}
		}
		
	}
	
	/**
	 * Setter para cambiar los minutos
	 * @param minutos Nuevos minutos
	 * @return Devuelve true si se realiza el cambio
	 */
	public boolean setMinutos(int minutos) {
		boolean res = false;
		if (minutos < 60) {
			this.minutos = minutos;
			res = true;
		}
		return res;
	}
	
	/**
	 * Setter para cambiar la hora
	 * @param hora Nueva hora
	 * @return Devuelve true si se realiza el cambio
	 */
	public boolean setHora(int hora) {
		boolean res = false;
		if (hora < 24) {
			this.hora = hora;
			res = true;
		}
		return res;
	}
	
	/**
	 * Metodo para imprimir la hora por pantalla
	 */
	@Override
	public String toString() {
		return hora + ":" + minutos;
	}

}
