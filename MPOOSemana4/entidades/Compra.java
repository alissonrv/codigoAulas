package entidades;

public class Compra {
	// public final static int numero=2;
	
	//Questionamento: Como representar um atr final no UML?
	//Questionamento: Como representar um atr static no UML?
	
	private static int numero;
	
	private int id;
	private double valor;
	Cliente cliente;
	Produto produto;
	
	public Compra(int id, double valor, Cliente cliente, Produto produto) {
		numero++;
		this.id = id;
		if(produto!=null) //solução de quem não aprendeu Except
			this.valor = produto.getPreco(); // futuramente aplicar RN(regra de negócio) de desconto!
		else
			this.valor = 0;
		//obs.: relação 1..1 - futuramente relação 1..N
		this.cliente = cliente;
		this.produto = produto;
	}

//	public static int getNumero() {
//		return numero;
//	}
//
//	public static void setNumero(int numero) {
//		Compra.numero = numero;
//	}

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
