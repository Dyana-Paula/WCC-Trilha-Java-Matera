package Aula5;

import java.util.Scanner;
public class Testando_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String opcao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Qual linguagem você escolhe? /n Digite 1 para Java. /n Digite 2 para C: ");
		
		opcao = entrada.next();
		
		switch(opcao){
			
			case "Java":
				System.out.println("Melhor escolha! Esta linguagem é orientada a objetos.");
				//break;
			
			case "C":
				System.out.println("Esta linguagem é estruturada.");
				//break;
				
			default:
				System.out.println("Linguagem desconhecida.");
				
			
				
		}
		
		entrada.close();
		

	}

}
