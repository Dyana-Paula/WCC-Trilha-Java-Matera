package aula11_exercicio_tarde;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente(null, null, 0);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do Funcion�rio:");
		gerente.setNome(entrada.next());
		System.out.println("Digite o CPF: ");
		gerente.setCpf(entrada.next());
		System.out.println("Digite o sal�rio: ");
		gerente.setSalario(entrada.nextDouble());
		
		System.out.println("Cadastro de Gerente!");
		System.out.println("Digite o nome do Gerente:");
		gerente.setNome(entrada.next());
		System.out.println("Digite o CPF: ");
		gerente.setCpf(entrada.next());
		System.out.println("Digite o sal�rio: ");
		gerente.setSalario(entrada.nextDouble());
		
		System.out.println("Digite uma senha: ");
		gerente.setSenha(entrada.nextInt());
		
		System.out.println("Cadastro realizado com sucesso! Para entrar no sistema digite a senha: ");
		if(gerente.autentica(entrada.nextInt()) == true) {
			System.out.println("Voc� entrou!");
			
		}else {
			System.out.println("Senha incorreta!");
		}
		
		
		
		entrada.close();
		

	}

}
