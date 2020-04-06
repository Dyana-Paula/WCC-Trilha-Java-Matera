package aula6;

public class Conta {
	
	String titular;
	int numeroConta;
	double saldo;
	
	public void sacar(double quantidade) {
		
		if(quantidade < saldo) {
			saldo = saldo - quantidade;
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	public void depositar(double valordeposito) {
		saldo = saldo + valordeposito;
		System.out.println("Seu novo saldo é: " + saldo);
	}

	public double consultarSaldo() {
		return saldo;
	}
}
