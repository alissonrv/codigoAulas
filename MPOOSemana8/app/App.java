package app;
import java.awt.image.BufferedImage;
import java.util.Date;

import javax.sound.midi.SysexMessage;
import javax.swing.JOptionPane;

import entidades.Campanha;
import entidades.Cliente;
import entidades.Compra;
import entidades.Email;
import entidades.Endereco;
import entidades.Produto;
import entidades.Telefone;

public class App {
	public static void main(String[] args) {
//		Telefone telefone = new Telefone(87, 999990000); //objeto concreto
//		System.out.println(telefone.getNumero());
//		telefone = null;
//		System.gc();
//		
//		new Telefone(87, 999991111); //objeto an�nimo
//		System.out.println();//n�otem como!
//		
//		//Questionamento: Se estou trabalhando com objetos an�nimos como fazer para liberar mem�ria?
//		
//		//Questionamento: Como um desenvolvedor saber� a repreta��o de um dado?
//		//Resposta:Documenta��o. Como faz�-la? Pesquisar
//		//Atv.: Como fazer o doc do Construtor de Cliente de maneira ao desenvolvedor saber como � o cpf!
//		Cliente cliente = new Cliente("Jose Silva", 
//									   new Telefone(87, 999992222),
//									   new Endereco("Rua UAST", "Universitario", "Serra Talhada", "PE", "57970-000", 0), 
//									   new Email("zesilva@gmail.com"), 
//									   "masculino",
//									   true, 
//									   "000.000.000-00");
//		Cliente cliente2 = new Cliente("Maria Silva", 
//				   				new Telefone(87, 999992222),
//				   				new Endereco("Rua UAST", "Universitario", "Serra Talhada", "PE", "57970-000", 0), 
//				   				new Email("mariasilva@gmail.com"), 
//				   				"feminino",
//				   				false, 
//				   				"111.111.111-11");
//		Produto produto1 = new Produto("Barbeador Tira Pelos", 
//									   100.00, 
//									   100.00, 
//									   "CD001", 
//									   1, 
//									   "unissex", 
//									   new Date(2021, 12, 1));
//		
//		Produto produto2 = new Produto("Esmalte Viva Verao", 
//				   20.00, 
//				   10.00, 
//				   "CD002", 
//				   20, 
//				   "feminino", 
//				   new Date(2022, 06, 13));
//		
////		Compra compra = new Compra(cliente, produto1);
////		Compra compra2 = new Compra(cliente, produto1);
//		
//		Compra compra3 = new Compra(cliente, Campanha.indicarProduto(cliente));
//		//obs.: compra3 � exemplo de garantia de aplicar o pre�o promocional (cenas dos pr�ximos cap�tulos)
//		
//		Compra compra4 = new Compra(cliente2, Campanha.indicarProduto(cliente2));
//		//obs.: compra4 n�o est� podendo ser instanciada: pois a indica��o � null, solu��o
//		//Solu��o1: Exce��o
//		//Solu��o2: Quebra-galho!
		
//Aula 22/08/2022
		
		Cliente cliente2 = new Cliente("Maria Silva",
				new Telefone(87,999992222),
				new Endereco("Rua UAST", "Universitário", "Serra Talhada", "PE", "57970-000", 0),
//				new Email(cliente2, "mariasilva@gmail.com"),
//				null, 	//gambiarra para quebrar a dependência
				"Feminino",
				false,
				"111.111.111-11");
		
		Email email = new Email(cliente2, "mariasilva@gmail.com");
		System.out.println(email);
		System.out.println(email.getEmail());
		email = null;
		System.out.println(cliente2.getEmail().getEmail());
		
		Compra compra = new Compra(cliente2);
		
		Produto produto1 = new Produto("Barbeador Tira Pelos", 
				   100.00, 
				   100.00, 
				   "CD001", 
				   1, 
				   "unissex", 
				   new Date(2021, 12, 1),
				   compra);
		
		System.out.println(produto1.getNome())
		System.out.println(produto1.);;
		
	}
}
