package Aula9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		List<Integer> lista = new ArrayList<Integer>();
		
		System.out.println("Digite um primeiro n�mero: ");
		lista.add(entrada.nextInt());
		System.out.println("Digite um segundo n�mero: ");
		lista.add(entrada.nextInt());
		System.out.println("Digite um terceiro n�mero: ");
		lista.add(entrada.nextInt());
		
	    System.out.println(lista);
	    Collections.sort(lista);
	    System.out.println(lista);
	    
	    System.out.println("O menor valor �: " + lista.get(0));
	    System.out.println("O maior valor �: " + lista.get(2));
	    
	    
	    entrada.close();

	}

}
