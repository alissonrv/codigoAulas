package app;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import entidades.Cliente;
import entidades.Compra;

public class App {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("joao", null, null, null, null, null);
		Cliente cliente2 = new Cliente("jose", null, null, null, null, null);
		
		System.out.println(cliente1.getNome());
		System.out.println(cliente2.getNome());
		
//		Compra compra1 = new Compra(0, 0, null, null);
//		Compra compra2 = new Compra(0, 0, null, null);
//		
//		System.out.println(compra1.numero);
//		System.out.println(compra2.numero);
//		System.out.println(Compra.numero);
		
		Date dataValidade = new Date(2022, 06, 11);	
		//Questionamento: porque Date está  dreprecated? E o que utilizar no lugar??
		
	}
	
	//Resumo da Aula:
	//static, final, UML (AOP), rela��o de agrega��o (ter), Date;

}
