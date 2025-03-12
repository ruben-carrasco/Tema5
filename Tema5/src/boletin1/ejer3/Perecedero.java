package boletin1.ejer3;

public class Perecedero extends Producto {
	private int diasACaducar;

	/**
	 * Constructor con los atributos
	 * 
	 * @param nombre       Nombre del producto
	 * @param precio       Precio del producto
	 * @param diasACaducar Dias que quedan para que caduque
	 */
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		if (diasACaducar >= 0) {
			this.diasACaducar = diasACaducar;
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
	 * Getter para saber cuantos dias quedan para que caduque
	 * 
	 * @return devuelve los dias quedan para que caduque
	 */
	public int getDiasACaducar() {
		return diasACaducar;
	}

	/**
	 * Metodo que calcula precio por cantidad y reduce según los diasACaducar
	 * 
	 * @param cantidad Cantidad de productos
	 * @return Devuelve el resultado de la operacion
	 */
	public double calcular(int cantidad) {
		double res = super.calcular(cantidad);
		if (this.diasACaducar == 1) {
			res /= 4;
		} else if (this.diasACaducar == 2) {
			res /= 3;
		} else if (this.diasACaducar == 3) {
			res /= 2;
		}
		return res;
	}

	/**
	 * Metodo toString, imprime el objeto
	 */
	public String toString() {
		return super.toString() + "-> Perecedero Dias para caducar: " + diasACaducar;
	}

}
