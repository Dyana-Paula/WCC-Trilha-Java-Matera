package Aula10;

public class Percorrendo_Arrays_For_Aprimorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayNum = {87,68,52,5,49,83,45,12,64};
		
		int somaArray = 0;
		
		for(int i: arrayNum){
			somaArray += i;
			
			System.out.printf("Total de elementos arrayNum: %d\n", somaArray);
		}
 
	}

}
