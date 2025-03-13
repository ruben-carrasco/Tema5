package examenañopasado;

import java.util.Scanner;

public class MainEmpleado {
	static 	Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opt;
		Empleado e;
		String dni;
		String nombre;
		double importe;
		double sueldoBase;
		int horas;
		
		do {
			menu();
			opt = reader.nextInt();
			reader.nextLine();
			
			switch(opt) {
			case 1 -> {
				dni = pedirDni();
				System.out.println("Introduzca el nombre: ");
				nombre = reader.nextLine();
				System.out.println("Introduzca las horas extras: ");
				horas = reader.nextInt();
				System.out.println("Introduzca el sueldo base: ");
				sueldoBase = reader.nextDouble();
				e = new Empleado(dni,nombre,sueldoBase,horas);
				System.out.println(ListadoEmpleados.añadirEmpleado(e) ? "Añadido" : "No añadido");
			}
			case 2 -> {
				ListadoEmpleados.listarEmpleados();
			}
			case 3 -> {
				dni = pedirDni();
				System.out.println("Introduzca las horas extras: ");
				horas = reader.nextInt();
				System.out.println(ListadoEmpleados.modificarHorasExtra(dni, horas) ? "Modificado" : "No modificado");
			}
			case 4 -> {
				System.out.println("Nuevo importe de horas extra: ");
				importe = reader.nextDouble();
				System.out.println(ListadoEmpleados.modificarImporte(importe) ? "Modificado" : "No modificado");
			}
			case 5 -> {
				dni = pedirDni();
				e = new Empleado(dni);
				System.out.println(ListadoEmpleados.eliminarEmpleado(e) ? "Eliminado" : "No eliminado");
			}
			case 0 -> {
				System.out.println("Saliendo del sistema...");
			}
			}
		} while (opt != 0);
		
		reader.close();
		
	}
	
	public static void menu() {
		System.out.println("1. Añadir Empleado");
		System.out.println("2. Listar empleados");
		System.out.println("3. Modificar horas extra");
		System.out.println("4. Modificar importe horas extra");
		System.out.println("5. Eliminar empleado");
		System.out.println("0. Salir");
		System.out.println("Elije una opcion: ");
	}
	
	public static String pedirDni() {
		String dni;
		System.out.println("Introduzca el dni: ");
		dni = reader.nextLine();
		return dni;
	}

}
