package aula11_exercicio_tarde;

public class Funcionario {
	private String nome = null;
	private String cpf = null;
	private double salario = 0;
	
	

	public Funcionario(String nome2, String cpf2, double salario2) {
		this.nome = nome2;
		this.cpf = cpf2;
		this.salario = salario2;
	}

	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}

}
