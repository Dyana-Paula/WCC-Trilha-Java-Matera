package Aula11;


import java.util.Date;

public class Pessoas {
    
	Date datanascimento = null;
	String cpf = null;
	String nome = null;
	
	public Pessoas(String nome, String cpf, Date datanascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.datanascimento = datanascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}

	public Date getDate() {
		
		return datanascimento;
	}
	
	}
