package boletin1.ejer5;

import java.util.Scanner;

public class MainPoligono {
	
	/**
	 * Objeto Scanner
	 */
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		// variable que almacena el tamaño del lado 1
		double lado1;
		// variable que almacena el tamaño del lado 2
		double lado2;
		// variable que almacena el tamaño del lado 3
		double lado3;
		// variable que almacena la opcion del menu
		int opt;
		// objeto poligono
		Poligono p;
		
		// mostramos el menu y pedimos al usuario una opcion
		do {
			menu();
			// Almacenamos la opcion en opt
			opt = reader.nextInt();
			
			// Switch con las opciones
			switch(opt) {
			case 1 -> {
				System.out.println("Introduzca el tamaño del lado 1: ");
				lado1 = reader.nextDouble();
				System.out.println("Introduzca el tamaño del lado 2: ");
				lado2 = reader.nextDouble();
				System.out.println("Introduzca el tamaño del lado 3: ");
				lado3 = reader.nextDouble();
				// Creamos el objeto
				p = new Triangulo(lado1, lado2, lado3);
				// Lo añadimos
				System.out.println(PoligonoCrud.añadirTriangulo(p) ? "Añadido" : "No añadido");
			}
			case 2 -> {
				System.out.println("Introduzca el tamaño del lado 1: ");
				lado1 = reader.nextDouble();
				System.out.println("Introduzca el tamaño del lado 2: ");
				lado2 = reader.nextDouble();
				// Creamos el objeto
				p = new Rectangulo(lado1, lado2);
				// Lo añadimos
				System.out.println(PoligonoCrud.añadirRectangulo(p) ? "Añadido" : "No añadido");
			}
			case 3 -> {
				PoligonoCrud.listarPoligonos();
			}
			case 0 -> {
				System.out.println("Saliendo");
			}
			default -> {
				System.out.println("opcion incorrecta");
			}
			}
		} while(opt != 0);
	}
	
	/**
	 * Metodo que imprime menu
	 */
	public static void menu() {
		System.out.println();
		System.out.println("1.Añadir triangulo.");
		System.out.println("2.Añadir rectangulo.");
		System.out.println("3.Mostrar poligonos.");
		System.out.println("0.Salir.");
		System.out.println("Introducir opcion:");
	}

}
