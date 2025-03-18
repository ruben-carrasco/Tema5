package boletin1.ejer5;

import java.util.ArrayList;

public class PoligonoCrud {
	/**
	 * Atributo que almacena los poligonos en una lista
	 */
	private static ArrayList<Poligono> poligonos = new ArrayList<>();
	
	/**
	 * Metodo para añadir triangulos a la lista
	 * @param t Objeto poligono a añadir
	 * @return true si se añade correctamente
	 */
	public static boolean añadirTriangulo(Poligono t) {
		return poligonos.add(t);
	}
	
	/**
	 * Metodo para añadir rectangulos a la lista
	 * @param r Objeto poligono a añadir
	 * @return true si lo añade correctamente
	 */
	public static boolean añadirRectangulo(Poligono r) {
		return poligonos.add(r);
	}
	
	/**
	 * Metodo para listar poligonos
	 */
	public static void listarPoligonos() {
		for (Poligono p : poligonos) {
			System.out.println(p);
			System.out.println("Area: " + p.area());
			System.out.println("------------------------");
		}
	}

}
