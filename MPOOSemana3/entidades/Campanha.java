package entidades;

import javax.swing.JOptionPane;

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
	
	public Produto indicarProduto(Cliente cliente) {
		
		//observação: ==apenas para dados numericos / null
		if(cliente.getSexo().equalsIgnoreCase("masculino")) {
			//indica produto masculino!
			//Mas o que é essa indicação?
		
		}
		if(cliente.getSexo().equalsIgnoreCase("feminino")) {
			
		}
		else {
			JOptionPane.showMessageDialog(null, Mensagem.exibirMensagem());
			return null;
		}
//		return null;
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
