package excepciones.ejer2;

public class CuentaCorriente {
	/**
	 * Enumerado que almacena las nacionalidades
	 */
	enum Nacionalidad {
		ESPAÑOLA, EXTRAJERA
	};

	/**
	 * Atributo que almacena el DNI
	 */
	private String dni = "DNI sin asignar";

	/**
	 * Atributo que almacena el nombre
	 */
	private String nombre = "Nombre sin asignar";

	/**
	 * Atributo que almacena el saldo de la cuenta
	 */
	private double saldo = 0;

	/**
	 * Atributo que almacena la nacionalidad
	 */
	private Nacionalidad nacionalidad;

	/**
	 * Constructor con el DNI del titular de la cuenta y un saldo inicial
	 * 
	 * @param dni   Dni del titular
	 * @param saldo Saldo inicial de la cuenta
	 */
	public CuentaCorriente(String dni, double saldo) throws DniSinNueveDigitosException, SaldoNegativoException {
		// Verificamos que no sea null, cadena vacía y que sea de longitud 9
		if (dni != null && !dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		} else if (dni.length() != 9) {
			throw new DniSinNueveDigitosException();
		}
		// Verificamos que sea mayor o igual a 0
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			throw new SaldoNegativoException();
		}
	}

	/**
	 * Constructor con el DNI, nombre y el saldo inicial.
	 * 
	 * @param dni    Dni del titular
	 * @param nombre Nombre de la cuenta
	 * @param saldo  Saldo inicial de la cuenta
	 */
	public CuentaCorriente(String dni, String nombre, double saldo)
			throws DniSinNueveDigitosException, NombreVacioException, SaldoNegativoException {
		// Verificamos que no sea null, cadena vacía y que sea de longitud 9
		if (dni != null && !dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		} else if (dni.length() != 9) {
			throw new DniSinNueveDigitosException();
		}
		// Verificamos que no sea null, cadena vacía
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		} else {
			throw new NombreVacioException();
		}
		// Verificamos que sea mayor o igual a 0
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			throw new SaldoNegativoException();
		}
	}

	/**
	 * Constructor con el DNI, nombre, el saldo inicial y la nacionalidad.
	 * 
	 * @param dni          Dni del titular
	 * @param nombre       Nombre de la cuenta
	 * @param saldo        Saldo inicial de la cuenta
	 * @param nacionalidad Nacionalidad de la cuenta
	 */
	public CuentaCorriente(String dni, String nombre, double saldo, String nacionalidad)
			throws DniSinNueveDigitosException, NombreVacioException, SaldoNegativoException {
		// Verificamos que no sea null, cadena vacía y que sea de longitud 9
		if (dni != null && !dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		} else if (dni.length() != 9) {
			throw new DniSinNueveDigitosException();
		}
		// Verificamos que no sea null, cadena vacía
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		} else {
			throw new NombreVacioException();
		}
		// Verificamos que sea mayor o igual a 0
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			throw new SaldoNegativoException();
		}

		// Comprobamos que sea ESPAÑOLA o EXTRANJERA
		if (nacionalidad.equals("ESPAÑOLA") || nacionalidad.equals("EXTRANJERA")) {
			this.nacionalidad = Nacionalidad.valueOf(nacionalidad);
		}
	}

	/**
	 * Get para consultar el dni
	 * 
	 * @return Devuelve el dni de la cuenta
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Set para cambiar el dni del titular
	 * 
	 * @param dni Dni del titutal nuevo
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Get para consultar el nombre
	 * 
	 * @return Devuelve el nombre de la cuenta
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Set para cambiar el nombre de la cuenta
	 * 
	 * @param nombre Nombre nuevo de la cuenta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Get para consultar el saldo
	 * 
	 * @return Devuelve el saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Set para cambiar el saldo de la cuenta
	 * 
	 * @param saldo Saldo nuevo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Get para consultar la nacionalidad
	 * 
	 * @return Devuelve la nacionalidad
	 */
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * Metodo que permite sacar dinero
	 * 
	 * @param cantidad Cantidad de dinero a sacar
	 * @return Devuelve true en caso de sacarlo y false en caso de no poderse
	 */
	public boolean sacarDinero(double cantidad) {
		boolean exito = false;

		// Se saca el saldo y al hacerlo este no queda negativo.
		if (this.saldo - cantidad >= 0) {
			this.saldo -= cantidad;
			exito = true;
		}

		return exito;
	}

	/**
	 * Metodo para añadir dinero a la cuenta
	 * 
	 * @param cantidad Cantidad de dinero a añadir
	 * @return Devuelve true si se añade y false si no es posible
	 */
	public boolean añadirDinero(double cantidad) {
		boolean exito = false;

		// Se añade al saldo la cantidad si es positiva
		if (cantidad >= 0) {
			this.saldo += cantidad;
			exito = true;
		}

		return exito;
	}

	/**
	 * Metodo toString para mostrar la información de la cuenta
	 */
	public String toString() {
		String res = "";

		res = "DNI del titular: " + dni + "\n";
		res += "Nombre: " + nombre + "\n";
		res += "Saldo: " + saldo + "\n";
		res += "Nacionalidad: " + nacionalidad;

		return res;
	}

	/**
	 * Metodo equals para saber si dos cuentas son iguales
	 */
	public boolean equals(Object obj) {
		// Creamos un objeto de tipo CuentaCorriente igual al objeto introducido como
		// parametro de entrada
		CuentaCorriente cuenta = (CuentaCorriente) obj;
		return dni == cuenta.dni && nombre.equals(cuenta.nombre);
	}

}
