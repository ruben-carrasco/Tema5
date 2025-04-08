package analisis.ejer2;

public class MainFicha {
	public static void main(String[] args) {
		Libro l1 = new Libro(10,"Berserk","wdwd","Panini");
		
		System.out.println(l1.getAutor());
		System.out.println(l1.tiempoPrestado());
	}

}
