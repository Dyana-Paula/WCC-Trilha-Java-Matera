package Aula2;

public class TestandoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer idade = 18;
		boolean amigododono = true;
		
		
		if(idade < 18 && !amigododono) {
			System.out.println("N�o pode entrar! Voc� � menor de idade e n�o � amigo do dono.");
			
		}else if(idade < 18){
			System.out.println("Voc� n�o pode entrar!");
		}else if(idade < 18 && amigododono){
			System.out.println("Voc� n�o pode entrar!");
		}else {
			System.out.println("Entrada liberada!");
		}
		
		

	}
	
	

}
