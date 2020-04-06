package Aula9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		List<Integer> lista = new ArrayList<Integer>();
		
		System.out.println("Digite um primeiro número: ");
		lista.add(entrada.nextInt());
		System.out.println("Digite um segundo número: ");
		lista.add(entrada.nextInt());
		System.out.println("Digite um terceiro número: ");
		lista.add(entrada.nextInt());
		
	    System.out.println(lista);
	    Collections.sort(lista);
	    System.out.println(lista);
	    
	    System.out.println("O menor valor é: " + lista.get(0));
	    System.out.println("O maior valor é: " + lista.get(2));
	    
	    
	    entrada.close();

	}

}
