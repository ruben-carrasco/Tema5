package comparator.ejer1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class NumerosOrdenados {
	public static void main(String[] args) {
		Integer[] numeros = new Integer[20];
		Random rand = new Random();
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(1,101);
		}
		
		System.out.println(Arrays.toString(numeros));
		
		// Ordenado de forma decreciente con un objeto Comparator
		//Arrays.sort(numeros, new ComparaNumeros());
		
		// Ordenado de forma decreciente con expresion lambda
		Arrays.sort(numeros, (a,b) -> b - a);
		
		System.out.println(Arrays.toString(numeros));
	}

}
