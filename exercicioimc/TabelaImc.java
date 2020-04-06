package exercicioimc;

public class TabelaImc {
	
	private Float peso;
	private Float altura;
	private Float imc;

	public void setPeso(Float peso){
	this.peso = peso;
	}

	public float getPeso(){
	return this.peso;
	}

	public void setAltura(Float altura){
	this.altura = altura;
	}

	public float getAltura(){
	return this.altura;
	}

	public void setImc(Float imc){
	this.imc = imc;
	}

	public float getImc(){
	return this.imc;
	}
	
	
	public void CalculoImc(){

		setImc((float) (getPeso() / Math.pow(getAltura(), 2)));
	
	}
	
	public void tabelaImc() {
		
		if(getImc() < 18.5) {
			System.out.println("Sua massa corporal é: " + getImc() + ". Você está com baixo peso.");
				
		}
		else if(getImc() >= 18.5 || getImc() < 25.0) {
			
			System.out.println("Sua massa corporal é: " + getImc() + ". Você está com peso adequado.");
		}
		else if(getImc() >= 25.0 || getImc() < 30.0) {
			
			System.out.println("Sua massa corporal é: " + getImc() + ". Você está com sobrepeso.");
		}
		else if(getImc() >= 18.5 || getImc() < 25.0) {
			
			System.out.println("Sua ssmassa corporal é: " + getImc() + ". Você está com obesidade.");
		}
		
	}

}
