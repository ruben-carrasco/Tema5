package boletin1.ejer3;

public class MainProducto {
	public static void main(String[] args) {
		Producto P1 = new Producto("Leche",20);
		NoPerecedero P2 = new NoPerecedero("Lapiz",9,"Escolar");
		Perecedero P3 = new Perecedero("Huevo",9,3);
		System.out.println(P1);
		System.out.println(P2);
		System.out.println(P3);
		
		P1.setPrecio(9.1);
		System.out.println(P1.calcular(5));
		System.out.println(P2.calcular(3));
		System.out.println(P3.calcular(3));
	}
}
