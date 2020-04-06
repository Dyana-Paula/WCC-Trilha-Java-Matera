package aula13;

import java.util.Scanner;
import java.util.Random;
import java.util.LinkedHashSet;

public class Megasena1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gerador = new Random();
		
		LinkedHashSet<Integer> numeros = new LinkedHashSet<Integer>();
		
		Scanner entrada = new Scanner(System.in);
		
		int quantjogos = 0;
		int i = 0;
		
		
		do {
			
		System.out.println("Quantos jogos você quer? ");
		
		quantjogos = entrada.nextInt();
		
		if(quantjogos < 1) {
			System.out.println("Número invalido. Digite um valor maior que 0(zero)!");
		}
		
		}while(quantjogos < 1);
		
		entrada.close();
		
		for(i = 0; i < quantjogos; i++) {
		while(numeros.size() < 6) {
			
			numeros.add(gerador.nextInt(60));
			
		}
		
		System.out.println("Cartela " + (i+1) +": " + numeros);
		numeros.clear();
		
		}
		
		
		

	}

}
