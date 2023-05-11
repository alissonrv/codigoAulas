package entidades;

public class Cliente {
	private String telefone;
	public String nome;
	private String email;
	private Endereco endereco;
	private String sexo;
	private Boolean aceitaProdutoPromocional;
	
	public Cliente(String telefone, String nome, String email, Endereco endereco, String sexo,
			Boolean aceitaProdutoPromocional) {
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.sexo = sexo;
		this.aceitaProdutoPromocional = aceitaProdutoPromocional;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
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

	public Boolean getAceitaProdutoPromocional() {
		return aceitaProdutoPromocional;
	}

	public void setAceitaProdutoPromocional(Boolean aceitaProdutoPromocional) {
		this.aceitaProdutoPromocional = aceitaProdutoPromocional;
	}

	@Override
	public String toString() {
		return "Cliente [telefone=" + telefone + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco
				+ ", sexo=" + sexo + ", aceitaProdutoPromocional=" + aceitaProdutoPromocional + "]";
	}
	
	
}	
	