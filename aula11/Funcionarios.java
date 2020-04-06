package Aula11;

import java.util.Date;

public class Funcionarios extends Pessoas{

	public Funcionarios(String nome, String cpf, Date datanascimento) {
		super(nome, cpf, datanascimento);
		    
	}
	
	double salario;
	String cargo;
}
