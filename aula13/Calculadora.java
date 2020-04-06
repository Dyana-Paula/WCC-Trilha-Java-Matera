

public class Calculadora {
	
	private double n1;
	private double n2;
	
	
	public void setNumeros(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
		
	}
	
	public double getN1(){
		return this.n1;
	}
	
	public double getN2() {
		return this.n2;
	}
	

	public double getSoma() {
		double resultado = this.n1 + this.n2;
		return resultado;
	}
	
	public double getSubtracao(double n1, double n2) {
		double resultado = n1 - n2;
		return resultado;
	}
	
	public double getMultiplicacao(double n1, double n2) {
		double resultado = n1 * n2;
		return resultado;
	}
	
	public double getDivisao(double n1, double n2) {
		
		
		if(n2 == 0) {
			return -1;
		}else {
			double resultado = n1/n2;
			return resultado;
		}
		
	}
	
	
	
}
