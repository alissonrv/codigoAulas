package entidades;

import java.util.Date;

public class Cliente extends Pessoa{
	
	private Boolean aceitaReceberPromocao;

	public Cliente(Telefone telefone, String nome, Email email,
			Endereco endereco, String sexo, String cpf, Date dataNascimento, double voucher,
			boolean aceitaReceberPromocao) {
		
		super(nome, telefone, endereco, email, sexo, cpf, dataNascimento, voucher);
//		this.telefone = telefone;
//		this.nome = nome;
//		this.email = email;
//		this.endereco = endereco;
//		this.sexo = sexo;
		this.aceitaReceberPromocao = aceitaReceberPromocao;
	}

	public Boolean getAceitaReceberPromocao() {
		return aceitaReceberPromocao;
	}
	public void setAceitaReceberPromocao(Boolean aceitaReceberPromocao) {
		this.aceitaReceberPromocao = aceitaReceberPromocao;
	}
}	
	