package Aula2;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "Dyana";
		String endereco = "Rua das Amoras, 120 - Parque das Árvores.";
		byte idade = 24;
		char estado_civil = 'S';
		double salario = 1000.00d;
		
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Idade: " + idade);
		System.out.printf("Estado civil: %c%n", estado_civil);
		System.out.printf("Salário: R$ %.2f%n", salario);

	}

}
