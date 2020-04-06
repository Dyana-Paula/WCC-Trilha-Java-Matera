package exercicioimc;

import java.util.Scanner;

public class PrincipalImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TabelaImc tabelaimc = new TabelaImc();
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Bem vindo(a) ao sistema de Índice de massa corporal!\n Digite abaixo o seu peso: \n ");
		tabelaimc.setPeso(entrada.nextFloat());
		
		System.out.println("Digite sua altura: ");
		tabelaimc.setAltura(entrada.nextFloat());
		
		tabelaimc.CalculoImc();
		
		tabelaimc.tabelaImc();
		
		entrada.close();
	}

}
