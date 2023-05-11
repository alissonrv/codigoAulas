package entidades;

import java.util.ArrayList;

public class Compra {
//	public final static int numero=2;
	//Questionamento: Como representar um atr final no UML?
	//Questionamento: Como representar um atr static no UML?
	
	private static int numero;
	
	private int id;
	private double valor;
	Cliente cliente;
//	Produto produto;
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public Compra(Cliente cliente) {
		numero++;
		this.id = numero;
		
		//obs.: rela��o 1..1 - futuramente rela��o 1..N
		this.cliente = cliente;
		produtos = new ArrayList<Produto>();
	}
	
	public void adicionarProduto() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
