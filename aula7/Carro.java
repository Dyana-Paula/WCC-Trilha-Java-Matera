package Aula7;

public class Carro {
	
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	public void liga() {
		System.out.println("O carro está ligado!");
	}

	public void acelera(double quantidade) {
		velocidadeAtual = quantidade;
	}
	
	public void pegaMarcha(double velocidadeAtual) {
		if(velocidadeAtual < 0) {
			System.out.println("Velocidade: " + velocidadeAtual + " km/h -- Marcha = -1");
		}else if(velocidadeAtual >=0 && velocidadeAtual <40){
			System.out.println("Velocidade: " + velocidadeAtual + " km/h -- Marcha = 1");
			
		} else if(velocidadeAtual >= 40 && velocidadeAtual < 80) {
			System.out.println("Velocidade: " + velocidadeAtual + " km/h -- Marcha = 2");
		}else {
			System.out.println("Velocidade: " + velocidadeAtual + " km/h -- Marcha = 3");
		}
		
		
	}

	
}
