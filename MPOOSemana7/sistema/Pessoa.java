package sistema;

import java.util.Date;

public class Pessoa {
	
	public String nome;
	private Telefone telefone;
	private Endereco endereco;
	private Email email;
	private String sexo;
	private String cpf;
	private Date dataNascimento;
	private double voucher;

	public Pessoa(String nome, Telefone telefone, Endereco endereco, Email email, String sexo, String cpf,
			Date dataNascimento, double voucher) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.sexo = sexo;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.voucher = voucher;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getVoucher() {
		return voucher;
	}

	public void setVoucher(double voucher) {
		this.voucher = voucher;
	}

	@Override
	public String toString() {
		return "Pessoa [telefone=" + telefone + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco
				+ ", sexo=" + sexo + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", voucher=" + voucher
				+ "]";
	}

	

	
}
