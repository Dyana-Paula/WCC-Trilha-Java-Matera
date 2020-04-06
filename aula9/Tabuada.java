package Aula9;

import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int numerodigitado;
		int[] lista = new int[10];
		lista[0] = 1;
		lista[1] = 2;
		lista[2] = 3;
		lista[3] = 4;
		lista[4] = 5;
		lista[5] = 6;
		lista[6] = 7;
		lista[7] = 8;
		lista[8] = 9;
		lista[9] = 10;
		
		
		System.out.println("Digite o valor que você quer saber a tabuada: ");
		numerodigitado = entrada.nextInt();
		
		for(int i = 0; i < 10; i++) {
			
			System.out.printf("Resultado: " + numerodigitado + " * " + lista[i] + " = " + numerodigitado*lista[i] + "\n" );
			
		}
		
		entrada.close();
		
		
		

	}

}
