package boletin1.ejer1;

public class HoraExacta extends Hora {
	private int segundos;
	
	/**
	 * Constructor con todos los atributos
	 * @param hora Hora de la hora
	 * @param minutos Minutos de la hora
	 * @param segundos Segundos de la hora
	 */
	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		if (segundos < 60) {
			this.segundos = segundos;
		}
	}
	
	/**
	 * Setter para cambiar los segundos
	 * @param segundos Nuevos segundos
	 * @return Devuelve true si se cambian
	 */
	public boolean setSegundos(int segundos) {
		boolean res = false;
		if (segundos < 60) {
			this.segundos = segundos;
			res = true;
		}
		return res;
	}
	
	/**
	 * Metodo que incrementa los segundos de una hora
	 */
	@Override
	public void inc() {
		if(++segundos == 60) {
			segundos = 0;
			super.inc();
		}
	}
	
	/**
	 * Metodo para imprimir la hora
	 */
	@Override
	public String toString() {
		return super.toString() + ":" + this.segundos;
	}

}
