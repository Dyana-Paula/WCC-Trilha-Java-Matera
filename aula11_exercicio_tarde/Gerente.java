package aula11_exercicio_tarde;

public class Gerente extends Funcionario{

	private int senha;
	
	public Gerente(String nome, String cpf, double salario){
		super(nome, cpf, salario);
		setNome(nome); 
		setCpf(cpf);
		setSalario(salario);
	}


	


	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public boolean autentica(int senha) {
		
		if(getSenha() == senha) {
			return true;
			
		}else {
			return false;
		}
	}
}
