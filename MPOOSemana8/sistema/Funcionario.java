package sistema;

import java.util.Date;

public class Funcionario extends Pessoa{
	
	private double salario;
	private int matricula;
	
	public Funcionario(String nome, Telefone telefone, Endereco endereco,
			Email email, String sexo, String cpf,
			Date dataNascimento, double voucher, double salario, int matricula) {
		
		super(nome, telefone, endereco, email, sexo, cpf, dataNascimento, voucher);
		this.salario = salario;
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
