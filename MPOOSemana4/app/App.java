package app;

import java.util.Date;

import entidades.Cliente;
import entidades.Compra;
import entidades.Email;
import entidades.Endereco;
import entidades.Produto;
import entidades.Telefone;

public class App {
	public static void main(String[] args) {
		
		int a=0;
		Telefone telefone = new Telefone(87, 999990000); //objeto concreto
		System.out.println(telefone.getNumero());
		telefone=null;
		System.gc();
		
		new Telefone(87, 99991111); //objeto anônimo
		System.out.println(); //não tem como!
		
		//Questionamento: Se estou trabalhando com objetos anônimos, como fazer para liberar memória??
		
		//Questionamento: como um desenvolvedor saberá a representação de um dado?
		//Resposta: Documentação. Como fazê-la? Pesquisar...
		//Atv.: como fazer o doc do Construtor de Cliente de maneira ao desenvolvedor saber como é o CPF!!
		
		Cliente cliente = new Cliente(new Telefone(87, 99992222),
									"José Silva",
									new Email("zesilva@gmail.com"),
									new Endereco("Rua UAST", "Universitário",
										"Serra Talhada", "PE", "57970-000", 0), 
										"masculino", 
										true, 
										"000.546.456-67"
									);
		
		Produto produto1 = new Produto("Barbeador tira pelos",
										100.00,
										100.00,
										"CD001",
										1,
										"unissex",
										new Date(2021, 12, 1));
		
		Produto produto2 = new Produto("Esmalte viva verão",
				20.00,
				10.00,
				"CD002",
				20,
				"feminino",
				new Date(2022, 06, 13));
		
		
		Compra compra = new Compra(12212,23,cliente, produto1);
		Compra compra2 = new Compra(12212,23,cliente, produto1);
		Compra compra3 = new Compra(12212,23,cliente, produto1);
		
		Compra compra4 = new Compra(12212,23,cliente, produto1);
		
	}

}
