package entidades;

import java.util.Date;

public class Cliente extends Pessoa{
	
	private boolean aceitarReceberPromocao;
	
	//permitiu que as antigas inst�ncias pudessem continuar com a defini��o antida
	public Cliente(String nome, Telefone telefone, Endereco endereco,
			Email email, String sexo, boolean aceitarReceberPromocao, String cpf) {
		super(nome, telefone, endereco, email, sexo, cpf, null,	0);
		this.aceitarReceberPromocao = aceitarReceberPromocao;
	}
	
	//atualiza��o do sistema!. Novos clientes ter�o de informar data e voucher
	//removido composição email
	public Cliente(String nome, Telefone telefone, Endereco endereco,
			String sexo, boolean aceitarReceberPromocao, String cpf, Date dataNascimento,
			double voucher) {
		super(nome, telefone, endereco, sexo, cpf, dataNascimento,
				voucher);
		this.aceitarReceberPromocao = aceitarReceberPromocao;
	}
	
	
	public boolean isAceitarReceberPromocao() {
		return aceitarReceberPromocao;
	}
	public void setAceitarReceberPromocao(boolean aceitarReceberPromocao) {
		this.aceitarReceberPromocao = aceitarReceberPromocao;
	}

	@Override
	public String toString() {
		return "Cliente [aceitarReceberPromocao=" + aceitarReceberPromocao
				+ ", toString()=" + super.toString() + "]";
	}
}

