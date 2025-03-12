package boletin1.ejer4;

import java.util.ArrayList;

public class MainElectrodomestico {
	public static void main(String[] args) {
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
		Electrodomestico e1 = new Electrodomestico(10,50,'C',"Rojo");
		Electrodomestico e2 = new Lavadora(100,45,'F',"Azul",50);
		Electrodomestico e3 = new Television(300,2,'A',"Verde",200,true);
		
		electrodomesticos.add(e1);
		electrodomesticos.add(e2);
		electrodomesticos.add(e3);
		
		for(Electrodomestico e : electrodomesticos) {
			e.precioFinal();
			System.out.println(e.getPrecioBase());
		}
		

	}
}
