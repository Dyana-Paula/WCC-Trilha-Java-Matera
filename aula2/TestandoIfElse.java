package Aula2;

public class TestandoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer idade = 18;
		boolean amigododono = true;
		
		
		if(idade < 18 && !amigododono) {
			System.out.println("Não pode entrar! Você é menor de idade e não é amigo do dono.");
			
		}else if(idade < 18){
			System.out.println("Você não pode entrar!");
		}else if(idade < 18 && amigododono){
			System.out.println("Você não pode entrar!");
		}else {
			System.out.println("Entrada liberada!");
		}
		
		

	}
	
	

}
