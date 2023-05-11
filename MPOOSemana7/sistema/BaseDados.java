package sistema;

import java.util.ArrayList;

public class BaseDados {
	//todos os dados que se queria armazenar do sistema:
	//Clientes, Funcion�rios, Produtos, Compras, etc...
	//M�todos de manuten��o:
	
	public static ArrayList<Compra> compras;
	public static ArrayList<Produto> produtos;
	private static ArrayList<Cliente> clientes;
	//RAM - ArrayList
	
	public static void createBase() {
		//criar o banco de dados
		inicializarBase();
	}
	
	private static void inicializarBase() {
		compras = new ArrayList<Compra>();
		produtos = new ArrayList<Produto>();
		//estabelecer conex�o com o BD
	}
	
	public static boolean adicionarCompra(Compra compra) {
		if(compra!=null)
			return compras.add(compra); //comando de inserir compra em arquivo ou BD
		
		return false;
	}
	
	public static Compra buscarCompra(int id) {
		for (Compra compraCurrent:compras)
			if(compraCurrent.getId()==id)
				return compraCurrent; //pq esse cara?
		
		return null;
	}
	
	//cuidado: falha de seguran�a! Acesso a informa��es pessoais de Cliente
	private static Cliente buscarCliente(Cliente cliente) { //cuidado com o tamanho do objeto
		for (Cliente clienteCurrent:clientes)
			if(clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf()))
				return clienteCurrent;//clienteCurrent;
			//FAZ DIFEREN�AS
		return null;
	}
	
//	private static Cliente buscarCliente(Cliente cliente, Adm adm) {
//		if(isAdm(adm))
//			for (Cliente clienteCurrent:clientes)
//				if(clienteCurrent.getCpf().equalsIgnoreCase(cliente.getCpf()))
//					return clienteCurrent;//clienteCurrent;
//				//FAZ DIFEREN�AS
//			return null;
//	}
	
	private static Cliente buscarCliente(String cpf) {
		for (Cliente clienteCurrent:clientes)
			if(clienteCurrent.getCpf().equalsIgnoreCase(cpf))
				return clienteCurrent;//clienteCurrent;
			//FAZ DIFEREN�AS
		return null;
	}
	
	public static boolean isCliente(Cliente cliente) {
		return clientes.contains(buscarCliente(cliente));
//		return clientes.contains(cliente);
	}
	
	public static boolean isCliente(String cpf) {
		return clientes.contains(buscarCliente(cpf));
	}
	
	public static boolean adicionarCliente(Cliente cliente) {
		//para adicionar foreach bara buscar? N�O
		//evitar toda e qualquer duplicidade de c�digo!
		
		if(cliente!=null)
			if(!isCliente(cliente))
				return clientes.add(cliente);
		
		return false;
	}
	
	//Questionamento: EST� PRESTANDO ATEN��O:
		//A app sabe qual � a tecnologia de armazenamento de dados?
	
	public static boolean removerCliente (Cliente cliente) {
		if(cliente!=null)
			return clientes.remove(buscarCliente(cliente));
		
		return false;
	}
	
	public static boolean atualizarCliente(Cliente clienteOld, Cliente clienteNew) {
		if(clienteNew!=null && clienteOld!=null)
			if(!isCliente(clienteNew)) { 
				clientes.set(clientes.indexOf(buscarCliente(clienteOld)), clienteNew);
				return true;
			}
		return false;
		
		//Questionamento: Como achar esse index de clienteOld? R: indexOf();
	}
	
}
