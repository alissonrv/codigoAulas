package entidades;

import java.util.Date;

public class Campanha {
	private String nome;
	private int ano;
	private int numero;
	
	public Campanha(String nome, int ano, int numero) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.numero = numero;
	}
	
	public static Produto indicarProduto(Cliente cliente) {
		
		//observa��o: ==apenas para dados numericos / null
		//compara��o de string usa equals ou equalsIgnoreCase
		
		if(cliente.getSexo().equalsIgnoreCase("masculino")) {
			//indica produto masculino!
			//Mas o que é essa indicação?
			return new Produto("Creme de barbear",
					50.00,
					50.00,
					"CD003",
					100, "masculino",
					new Date(2020, 12, 1));
		
		}
		else {
			
			if(cliente.getSexo().equalsIgnoreCase("feminino")) {
			return new Produto("Lixa de unha",
					50.00,
					50.00,
					"CD004",
					100, "feminino",
					new Date(2020, 12, 1));
			}
			
			else{
				return null;
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
