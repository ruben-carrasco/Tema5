package boletin1.ejer3;

public class NoPerecedero extends Producto {
	private String tipo;

	/**
	 * Constructor con los atributos
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 * @param tipo   Tipo de producto
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		if (tipo != null && !tipo.isBlank()) {
			this.tipo = tipo;
		}
	}

	/**
	 * Getter que devuelve el nombre
	 */
	public String getNombre() {
		return super.getNombre();
	}

	/**
	 * Getter que devuelve el precio
	 */
	public double getPrecio() {
		return super.getPrecio();
	}

	/**
	 * Setter que establece el precio
	 */
	public void setPrecio(double precio) {
		super.setPrecio(precio);
	}

	/**
	 * Getter para obtener el tipo
	 * 
	 * @return devuelve el tipo de producto
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Metodo que calcula precio por cantidad
	 * 
	 * @param cantidad Cantidad de productos
	 * @return Devuelve el resultado de la operacion
	 */
	public double calcular(int cantidad) {
		return super.calcular(cantidad);
	}

	/**
	 * Metodo toString, imprime el objeto
	 */
	public String toString() {
		return super.toString() + "-> Perecedero Tipo: " + tipo;
	}

}
