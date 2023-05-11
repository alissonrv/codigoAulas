package model;

import java.util.ArrayList;

public class BaseDados {
	
	ArrayList<Produto> produtos;
	
	public void createBase() {
		produtos = new ArrayList<Produto>();
	}
	
	//buscarProduto isProduto
	public boolean adicionarProduto(Produto produto) {
		boolean status=false;
		for(Produto produtoCurrent:produtos)
			if(!produtoCurrent.getCodBarras().equalsIgnoreCase(produto.getCodBarras()))
				status=true;
		if(!status)
			return produtos.add(produto);
			
		return false;
	}
}
