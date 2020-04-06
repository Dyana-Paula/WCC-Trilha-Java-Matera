package aula4;

import java.util.Scanner;



public class ContaToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		/*
		String telefone = "";
		
		
		int i = 0;
		
		System.out.println("Digite um telefone: ");
		while(entrada.hasNext()) {
			
			i++;
			System.out.println("Telefone: " + entrada.next());
			
			
			
		} */
		
		
		
		int a = 0;
		
		System.out.println("Digite um texto: ");
		
		while(entrada.hasNext()) {
			
			a++;
			System.out.println("Texto: " + entrada.nextLine());
			System.out.println(a);
		}
		
		
		
		
		
		
		
		entrada.close();
		
		

	}

	

}
