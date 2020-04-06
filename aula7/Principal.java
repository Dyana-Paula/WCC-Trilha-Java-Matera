package Aula7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
	
		
		String cor = "Azul";
		String modelo = "Fiat Uno";
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Carro  " + cor + " Modelo " + modelo);
		
			
				carro.liga();
				System.out.println("Digite a velocidade Atual: ");
				double velocidadeAtual = entrada.nextDouble();
				
				
				carro.pegaMarcha(velocidadeAtual);
				
				
			
				
				entrada.close();
		

	}
		
		
	
	}


