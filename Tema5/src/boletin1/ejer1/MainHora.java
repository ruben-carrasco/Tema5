package boletin1.ejer1;

public class MainHora {
	public static void main(String[] args) {
		Hora h1 = new Hora(21,58);
		h1.inc();
		System.out.println(h1);
		
		HoraExacta h2 = new HoraExacta(22,59,59);
		h2.inc();
		System.out.println(h2);
	}

}
