package entidades;

public class Cliente {
	public String nome;
	protected String telefone;	//obs cardinalidade 1..1, sem uso de telefone
	private String endereco;	//obs cardinalidade 1..1, sem uso de endereco
	private String email;
	private Boolean aceitaReceberPromocao;
	private String sexo;
	
	
	private class Telefone{
		
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Boolean getAceitaReceberPromocao() {
		return aceitaReceberPromocao;
	}


	public void setAceitaReceberPromocao(Boolean aceitaReceberPromocao) {
		this.aceitaReceberPromocao = aceitaReceberPromocao;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
