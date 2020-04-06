package aula6;

import java.util.Scanner;


public class Saque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		Conta conta = new Conta();
		
		int opcao = 0;
		
		while(opcao != 4) {
			
			System.out.printf("Bem vindo(a)! /n Digite 1 para Consultar saldo. /n Digite 2 para Saque. /n Digite 3 para Depositar /n Digite 4 para sair.");
			
			opcao = entrada.nextInt();
			
			if(opcao == 1) {
				System.out.println("Seu saldo é: " + conta.consultarSaldo());
			}
			else if(opcao == 2) {
				System.out.println("Digite a quantidade que você quer sacar: ");
				int quantidade = entrada.nextInt();
				conta.sacar(quantidade);
			}else if(opcao == 3) {
				System.out.println("Digite a quantidade que você quer depositar: ");
				double novodeposito = entrada.nextDouble();
				conta.depositar(novodeposito);
			}else if(opcao < 4 || opcao > 4) {
				System.out.println("Opção inválida. Por favor escolha novamente.");
			}
			
		}
		
		System.out.println("Até logo!");
		
		entrada.close();

	}

}
