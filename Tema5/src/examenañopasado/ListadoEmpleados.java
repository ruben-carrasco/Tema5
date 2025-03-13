package examenañopasado;

import java.util.HashSet;

public class ListadoEmpleados {
	private static HashSet<Empleado> empleados = new HashSet<>();

	public static boolean añadirEmpleado(Empleado e) {
		return empleados.add(e);
	}

	public static void listarEmpleados() {
		for (Empleado e : empleados) {
			System.out.println(e);
			System.out.println("------------");
		}
	}

	public static Empleado buscarEmpleado(String dni) {
		Empleado otroEmpleado = null;
		for (Empleado e : empleados) {
			if (e.getDni().equals(dni)) {
				otroEmpleado = e;
			}
		}
		return otroEmpleado;
	}

	public static boolean modificarHorasExtra(String dni, int horasExtra) {
		boolean res = false;
		Empleado e = buscarEmpleado(dni);
		if (e != null) {
			e.setHorasExtra(horasExtra);
			res = true;
		}
		return res;
	}
	
	public static boolean modificarImporte(double importe) {
		boolean res = false;
		if (importe >= 0) {
			Empleado.setIMPORTE_HORA_EXTRA(importe);
			res = true;
		}
		return res;
	}
	
	public static boolean eliminarEmpleado(Empleado e) {
		return empleados.remove(e);
	}

}
