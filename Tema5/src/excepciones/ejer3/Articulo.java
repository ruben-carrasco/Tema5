package excepciones.ejer3;

public class Articulo {
	// atributos: nombre, precio (sin IVA), iva (siempre será 21) y
	// cuantosQuedan (representa cuántos quedan en el almacén).
	private String nombre = "Por defecto";
	private double precio = 0;
	public final int IVA = 21;
	private int cuantosQuedan = 0;

	/**
	 * 
	 * @param nombre  Nombre del articulo
	 * @param precio  Precio del articulo
	 * @param cuantos Quedan stock del aritulo
	 */
	Articulo(String nombre, int precio, int cuantosQuedan)
			throws NombreVacioException, PrecioNegativoException, StockNegativoException {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		} else {
			throw new NombreVacioException();
		}

		if (precio >= 0) {
			this.precio = precio;
		} else {
			throw new PrecioNegativoException();
		}

		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			throw new StockNegativoException();
		}

	}

	/**
	 * Obtiene el nombre del producto.
	 * 
	 * @return Nombre del producto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre del producto.
	 * 
	 * @param nombre Nuevo nombre del producto.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el precio del producto.
	 * 
	 * @return Precio del producto.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Modifica el precio del producto.
	 * 
	 * @param precio Nuevo precio del producto.
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * Obtiene la cantidad disponible del producto.
	 * 
	 * @return Cantidad disponible del producto.
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Modifica la cantidad disponible del producto.
	 * 
	 * @param cuantosQuedan Nueva cantidad disponible del producto.
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * Método getPVP que devuelva el precio de venta al público (PVP) con iva //
	 * incluido.
	 * 
	 * @return Devuelve el pvp cpn iva incluido
	 */
	public double getPVP() {
		// almacena el pvp
		double pvp;
		// Calculamos el pvp y almacenamos
		pvp = (precio * IVA / 100) + precio;
		// Devolvemos pvp
		return pvp;
	}

	/**
	 * Método getPVPDescuento que devuelva el PVP con un descuento pasado como
	 * argumento.
	 * 
	 * @param descuento Descuento introducido como parametro
	 * @return pvpDescuento Devuelve el precio con descuento aplicado
	 */
	public double getPVPDescuento(int descuento) {
		// Almacena PVP con descuento
		double pvpDescuento;
		// Almacena precio descontado
		double descontado;
		// Almacena pvp
		double pvp;
		// Calcula pvp
		pvp = ((double) precio * IVA / 100) + precio;
		// Calcula precio a descontar
		descontado = pvp * descuento / 100;
		// Calcula el precio con descuento aplicado
		pvpDescuento = pvp - descontado;
		return pvpDescuento;
	}

	/**
	 * Método vender que actualiza los atributos del objeto tras vender una
	 * cantidad‘x’ (si esposible). Devolverá true si ha sido posible (false en caso
	 * 
	 * @param cantidad
	 * @return
	 */
	public boolean vender(int cantidad) {
		boolean exito = false;
		if (cuantosQuedan - cantidad >= 0) {
			cuantosQuedan -= cantidad;
			exito = true;
		}
		return exito;
	}

	// Método almacenar que actualiza los atributos del objeto tras almacenar una
	// cantidad ‘x’.
	public void almacenar(int cantidad) {
		cuantosQuedan += cantidad;
	}

	/**
	 * Método toString() que devuelva la información del artículo por pantalla.
	 */
	public String toString() {
		// Almacena la informacion del articulo
		String info;
		// Añadimos la informacion
		info = "Nombre: " + nombre + " Precio: " + precio + " IVA: " + IVA + "%" + " Stock: " + cuantosQuedan;
		return info;
	}

}
