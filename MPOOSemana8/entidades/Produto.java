package entidades;

import java.util.Date;

public class Produto {
	private String nome;
	private double preco;
	private double precoPromocional;
	private String codBarras;
	private int quantidade;
	private String tipo;
	private Date dataValidade; //CUIDADO!
	
private Produto(String nome, double preco, double precoPromocional,
		String codBarras, int quantidade, String tipo, Date dataValidade) {
		this.nome = nome;
		this.preco = preco;
		this.precoPromocional = precoPromocional;
		this.codBarras = codBarras;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.dataValidade = dataValidade;
	}

//	public Produto(String nome, double preco, double precoPromocional,
//			String codBarras, int quantidade, String tipo, Date dataValidade, Compra compra) {
//		super();
//		this.nome = nome;
//		this.preco = preco;
//		this.precoPromocional = precoPromocional;
//		this.codBarras = codBarras;
//		this.quantidade = quantidade;
//		this.tipo = tipo;
//		this.dataValidade = dataValidade; //
//		//Questionamento: como n�o permitir que o produto vencidoo seja cadastrado!
//	}
	
	
	
	public Produto(String nome, double preco, double precoPromocional,
			String codBarras, int quantidade, String tipo, Date dataValidade, Compra compra) {
		compra.produtos.add(new Produto(nome,
										preco, precoPromocional,
										codBarras, quantidade,
										tipo, dataValidade));
		//Questionamento: como n�o permitir que o produto vencidoo seja cadastrado!
	}
	
	//Questionamento: Como e onde indicar os produtos que est�o a 1 m�s de vencer!
	//public Produto indicarPromocao(Produto produto){}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPrecoPromocional() {
		return precoPromocional;
	}
	public void setPrecoPromocional(double precoPromocional) {
		this.precoPromocional = precoPromocional;
	}
	public String getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	
	
	
}
