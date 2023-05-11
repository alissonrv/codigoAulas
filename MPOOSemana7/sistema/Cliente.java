package sistema;

import java.util.Date;

public class Cliente extends Pessoa{
	
	private Boolean aceitaReceberPromocao;
	
	//permitiu que as antigas instâncias pudessem continuar com a definição antiga
	public Cliente(String nome, Telefone telefone, Endereco endereco, Email email,
			String sexo, boolean aceitaReceberPromocao, String cpf) {
		super(nome, telefone, endereco, email, sexo, cpf, null, 0);
		this.aceitaReceberPromocao = aceitaReceberPromocao;
	}
	
	//atualização do sistema! Novos clientes terão de informar data e voucher
	public Cliente(String nome, Telefone telefone, Endereco endereco,
			Email email, String sexo, boolean aceitaReceberPromocao, String cpf, Date dataNascimento,
			double voucher) {
		super(nome, telefone, endereco, email, sexo, cpf, dataNascimento,
				voucher);
		this.aceitaReceberPromocao = aceitaReceberPromocao;
	}
	
	public boolean isAceitaReceberPromocao() {
		return aceitaReceberPromocao;
	}

	public void setAceitaReceberPromocao(Boolean aceitaReceberPromocao) {
		this.aceitaReceberPromocao = aceitaReceberPromocao;
	}

	
//	public boolean isAceitaReceberPromocao{
//		
//	}
	
	@Override
	public String toString() {
		return "Cliente [aceitaReceberPromocao=" + aceitaReceberPromocao
				+ ", toString()=" + super.toString() + "]";
	}
}	
	