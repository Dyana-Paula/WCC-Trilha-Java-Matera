package Aula11;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Escola {

	public static void main(String[] args) throws ParseException {
		
	
		
		Scanner entrada = new Scanner(System.in);
		
		Alunos aluno = new Alunos(null, null, null);
		Curso curso = new Curso();
		Professor professor = new Professor(null, null, null);
		Funcionarios funcionario = new Funcionarios(null, null, null);
		
		
		System.out.println("**Cadastro do Aluno**");
		System.out.println("Digite o nome do Aluno: ");
		aluno.nome = entrada.next();
		
		System.out.println("Digite o ra do Aluno: ");
		aluno.ra = entrada.nextInt();
		
		System.out.println("Digite o cpf do Aluno: ");
		aluno.cpf = entrada.next();
		
		System.out.println("Digite a data de nascimento do aluno: ");
		String datanasc = entrada.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		Date data = dateformat.parse(datanasc);
		aluno.datanascimento = data;
		
		System.out.println("Data de nascimento do aluno: " + dateformat.format(aluno.getDate()));
		
		System.out.println("Digite o nivel que o aluno está: ");
		curso.setNivel(entrada.next());
		
		System.out.println("Digite o periodo do aluno: ");
		curso.setPeriodo(entrada.next());
		
		System.out.println("**Informações sobre o professor**");
		System.out.println("Digite o nome do Professor: ");
		professor.nome = entrada.next();
		
		System.out.println("Digite o cpf do professor: ");
		professor.cpf = entrada.next();
		
		System.out.println("Digite a data de nascimento do professor: ");
		String datanascProfessor = entrada.next();
		SimpleDateFormat dateformatProfessor = new SimpleDateFormat("dd/MM/yyyy");
		Date dataProfessor = dateformatProfessor.parse(datanascProfessor);
		professor.datanascimento = dataProfessor;
		System.out.println("Data de nascimento do aluno: " + dateformatProfessor.format(aluno.getDate()));
		
		System.out.println("Digite o salário do professor: ");
		professor.cpf = entrada.next();
		
		
		
		System.out.println("**Cadastro de funcionário**");
		System.out.println("Digite o nome do funcionário: ");
		funcionario.nome = entrada.next();
		
		System.out.println("Digite o cpf do funcionário: ");
		funcionario.cpf = entrada.next();
		
		System.out.println("Digite a data de nascimento do funcionário: ");
		String datanascFuncionario = entrada.next();
		SimpleDateFormat dateformatFuncionario = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFuncionario = dateformatFuncionario.parse(datanascFuncionario);
		funcionario.datanascimento = dataFuncionario;
		
		
		System.out.println("Digite o cargo do funcionário: ");
		funcionario.cargo = entrada.next();
		
		System.out.println("Digite o salário do funcionário: ");
		funcionario.salario = entrada.nextDouble();
		
		
		System.out.println("Dados digitados sobre o(a) Aluno(a): ");
		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println("Ra: " + aluno.ra);
		System.out.println("CPF: " + aluno.getCpf());
		System.out.println("Data de nascimento: " + dateformat.format(aluno.getDate()));
		
		System.out.println("Dados digitados sobre o(a) Professor(a): ");
		System.out.println("Nome do Professor: " + professor.getNome());
    	System.out.println("CPF: " + professor.getCpf());
		System.out.println("Data de nascimento: " + dateformat.format(professor.getDate()));
		System.out.printf("Salário: R$ %2.d",  professor.salario);
		
		System.out.println("Dados digitados sobre o Funcionário: ");
		System.out.println("Nome : " + funcionario.getNome());
    	System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Data de nascimento: " + dateformat.format(funcionario.getDate()));
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.printf("Salário: R$ %2d",  funcionario.salario);
		
		entrada.close();
		
		
		
	

	}
	
	

}
