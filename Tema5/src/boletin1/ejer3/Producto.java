package boletin1.ejer3;

public class Producto {
	/**
	 * Atributo que almacena el nombre del producto
	 */
	private String nombre;

	/**
	 * Atributo que almacena el precio del producto
	 */
	private double precio;

	/**
	 * Contructor con los atributos
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 */
	public Producto(String nombre, double precio) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Getter para obtener el precio
	 * 
	 * @return devuelve el precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Setter para cambiar el precio del producto
	 * 
	 * @param precio Nuevo precio
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Getter para obtener el nombre del producto
	 * 
	 * @return Devuelve el nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo toString, imprime los atributos
	 */
	public String toString() {
		return "Producto: " + nombre + " Precio: " + precio;
	}
	
	/**
	 * Metodo que calcula precio por cantidad
	 * @param cantidad Cantidad de productos
	 * @return Devuelve el resultado de la operacion 
	 */
	public double calcular(int cantidad) {
		double res;
		res = precio * cantidad;
		return res;
	}

}
