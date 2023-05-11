package app;

import java.util.Date;

import sistema.BaseDados;
import sistema.Cliente;
import sistema.Compra;
import sistema.Email;
import sistema.Endereco;
import sistema.Produto;
import sistema.Telefone;

public class App {
	
	public static void main(String[] args) {
		
		//Telefone telefone = new Telefone(87,999990000);// Quando criamos uma variavel isto se chama objeto concreto
		//System.out.println(telefone.getNumero());
							
		//new Telefone(87,999991111);// Objeto anonimo;
		//System.out.println();//N�o tem como 
			
		//System.out.println(telefone.getNumero());
			
		//Questionamento: Se estou trabalhando com objetos anonimos como fazer para liberar memoria ?
		// Como fazer o  doc do construtor de  cliente como o desenvolvedor  saber como � o cpf
			
		/*Cliente cliente = new Cliente("Jose silva",	
										new Telefone(87,999992222),
										new Endereco("Rua Uast","Universitario","Serra Talhada","PE","57970-000",0),
										new Email("zesilva@gmail.com"),
										"masculino",
										true,
										"000.000.000-00");
				
		Cliente cliente2 = new Cliente("Maria silva",
										new Telefone(87,999992222),
										new Endereco("Rua Uast","Universitario","Serra Talhada","PE","57970-000",0),
										new Email("mariasilva@gmail.com"),
										"feminino",
										true,
										"111.111.111-11");	
				
		Produto produto1 = new Produto("Barbeador tira pelos",
										100.00,100.00,
										"CD001",
										1,
										"Unissex",
										new Date(2021,12,01));
				
		Produto produto2 = new Produto("Esmalte Viva Verao",
										20.00,
										10.00,
										"CD002",
										20,
										"Feminino",
										new Date(20222,06,13));
			
		Compra compra = new Compra(cliente,produto1);
		Compra compra2 = new Compra(cliente,produto1);
		Compra compra3 = new Compra(cliente,Campanha.indicarProduto(cliente));
		Compra compra4 = new Compra(cliente2,Campanha.indicarProduto(cliente2));
		
		Compra 4 n�o esta podendo ser instanciada pois a indica��o � nula.
		Solu��o1: Exece��o;
		Solu��o 2: quebra galho;
		Obs: compra3 � um exemplo de garantia de aplicar o pre�o promocional (Cenas dos proximos capitulos)
			
		*/
		
		BaseDados.createBase();
		
		Cliente cliente = new Cliente("Jose Silva", 
							new Telefone(87, 999992222),
							new Endereco("Rua UAST", "Universitario", "Serra Talhada", "PE", "57970-000", 0), 
							new Email("zesilva@gmail.com"), 
							"masculino",
							true, 
							"000.000.000-00");
		
//		BaseDados.clientes.add(cliente);
//		BaseDados.getClientes().add(cliente);
		System.out.println(BaseDados.isCliente(cliente));
		BaseDados.adicionarCliente(cliente);
		
		Cliente cliente2 = new Cliente("Maria Silva", 
							new Telefone(87, 999992222),
							new Endereco("Rua UAST", "Universitario", "Serra Talhada", "PE", "57970-000", 0), 
							new Email("mariasilva@gmail.com"), 
							"feminino",
							false, 
							"111.111.111-11");

		Compra compra = new Compra(0, 0, cliente2);
		Produto produto1 = new Produto("Barbeador Tira Pelos", 
										100.00, 
										90.00, 
										"CD001", 
										1, 
										"unissex", 
										new Date(2021, 12, 1));
		compra.adicionarProduto(produto1);
//		compra.adicionarProduto(BaseDados.buscarProduto("codBarras"));
		System.out.println(compra.getValor());
		compra.adicionarProduto(produto1);
		System.out.println(compra.getValor());
		
		//D�vida: produto1 precisar existir no meu sistema?
//		produto1=null;
//		System.gc();
		
		BaseDados.adicionarCompra(compra);
						
		//varredura de ArrayList
		
		//1� FORMA - ainda sou principiante JAVA
				
		for (int i=0; i<compra.getProdutos().size();i++)
			//get
			System.out.println(compra.getProdutos().get(i).getNome());
				 
		//2� FORMA: foreach	 
		for (Produto produtoCurrent:compra.getProdutos())
			System.out.println(produtoCurrent.getNome());
			
		//3� Forma: E Java evolui? Programa��o lambda [Pesquisar]
	}
}