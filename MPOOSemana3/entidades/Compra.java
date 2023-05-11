package entidades;

public class Compra {
	// public final static int numero=2;
	
	private static int numero;
	private int id;
	private double valor;
	Cliente cliente;
	Produto produto;
	
	public Compra(int id, double valor, Cliente cliente, Produto produto) {
		numero++;
		this.id = id;
		this.valor = valor;
		this.cliente = cliente;
		this.produto = produto;
	}
	
	
}
