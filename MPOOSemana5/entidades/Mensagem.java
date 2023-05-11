package entidades;

public class Mensagem {
	private static final String MENSAGEM_FALHA_RELACAO_PRODUTO_CLIENTE= "N�o foi possivel indicar um produto.";
	//frase o que dizer vem no setor de relações publicas!
	
	public static String exibirMensagem(){
		return MENSAGEM_FALHA_RELACAO_PRODUTO_CLIENTE;
	}
}
