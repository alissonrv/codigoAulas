 package sistema;

import java.util.ArrayList;

public class Compra {
	
	private static int numero;
	
	private int id;
	private double valor;
	Cliente cliente;
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public Compra(int id, double valor, Cliente cliente) {
		numero++;
		this.id = numero;
		this.cliente = cliente;
	}

	public void adicionarProduto(Produto produto) {
		//Aten��o as RN
		
		//Aten��o Collection ArrayList: add, get, size, ...
		if(produto!=null) {
			produtos.add(produto);	//em FBD vai substituir essa linha por ROM
			//ROM: xml, txt, BD
		}
		valorCompra();
	}
	
	private void valorCompra() {
//		this.valor = produto.getPreco();
		
		//Assumir rela��o 1..N: 
//		valor+=produtos.get(produtos.size()-1).getPreco();
		
		//Aten��o para exist�ncia de RN de outra classe que seja respons�vel por aplicar descontos!
		if (cliente.isAceitaReceberPromocao())
			valor+=produtos.get(produtos.size()-1).getPrecoPromocional();
		else
			valor+=produtos.get(produtos.size()-1).getPreco();
		
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

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}	
}
