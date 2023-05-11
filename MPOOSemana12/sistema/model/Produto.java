package model;

public class Produto {
	String codBarras;
	String nome;
	
	public Produto(String codBarras, String nome) {
		this.codBarras = codBarras;
		this.nome = nome;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
