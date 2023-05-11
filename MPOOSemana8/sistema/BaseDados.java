package sistema;

import java.util.ArrayList;
import java.util.Date;

public class BaseDados {
	//todos os dados que se queria armazenar do sistema:
	//Pessoas, Funcion�rios, Produtos, Compras, etc...
	//M�todos de manuten��o:
	
	public static ArrayList<Compra> compras;
	public static ArrayList<Pessoa> pessoas;
	//RAM - ArrayList
	
	public static void createBase() {
		//criar o banco de dados
		compras = new ArrayList<Compra>();
		pessoas = new ArrayList<Pessoa>();
		inicializarBase();
	}
	
	private static void inicializarBase() {
		//estabelecer conexão com BD
		
		//1º caso de polimorfismo de objetos
		//Adicionando instâncias
		pessoas.add(new Cliente("Jose Silva",
				new Telefone(87, 999992222),
				new Endereco("Rua", null, null, null, null, 0),
				new Email("zesilva@gmail.com"),
				"masculino",
				true,
				"000.000.000-00"));
		
		pessoas.add(new Funcionario("Godofredo Silva",
				new Telefone(81, 999990000),
				new Endereco("Rua Cactus",
						"Cactolândia",
						"CactoCity",
						"PE",
						"56970-000",
						10),
				new Email("godo@gmail.com"),
				"masculino",
				"111.111.111-11",
				new Date(1970, 12, 5),
				0.0,
				1200,
				1));
		compras = new ArrayList<Compra>();
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
	
	//cuidado: falha de seguran�a! Acesso a informa��es pessoais de Pessoa
	private static Pessoa buscarPessoa(Pessoa pessoa) { //cuidado com o tamanho do objeto
		for (Pessoa pessoaCurrent:pessoas)
			if(pessoaCurrent.getCpf().equalsIgnoreCase(pessoa.getCpf()))
				return pessoaCurrent;//pessoaCurrent;
			//FAZ DIFEREN�AS
		return null;
	}
	
//	private static Pessoa buscarPessoa(Pessoa pessoa, Adm adm) {
//		if(isAdm(adm))
//			for (Pessoa pessoaCurrent:pessoas)
//				if(pessoaCurrent.getCpf().equalsIgnoreCase(pessoa.getCpf()))
//					return pessoaCurrent;//pessoaCurrent;
//				//FAZ DIFEREN�AS
//			return null;
//	}
	
	private static Pessoa buscarPessoa(String cpf) {
		for (Pessoa pessoaCurrent:pessoas)
			if(pessoaCurrent.getCpf().equalsIgnoreCase(cpf)) {
				return pessoaCurrent;
			}
		return null;
	}
	
	public static boolean isPessoa(Pessoa pessoa) {
		return pessoas.contains(buscarPessoa(pessoa));
//		return pessoas.contains(pessoa);
	}
	
	public static boolean isPessoa(String cpf) {
		return pessoas.contains(buscarPessoa(cpf));
	}
	
	public static boolean adicionarPessoa(Pessoa pessoa) {
		//para adicionar foreach bara buscar? N�O
		//evitar toda e qualquer duplicidade de c�digo!
		
		if(pessoa!=null)
			if(!isPessoa(pessoa))
				return pessoas.add(pessoa);
		
		return false;
	}
	
	//Questionamento: EST� PRESTANDO ATEN��O:
		//A app sabe qual � a tecnologia de armazenamento de dados?
	
	public static boolean removerPessoa (Pessoa pessoa) {
		if(pessoa!=null)
			return pessoas.remove(buscarPessoa(pessoa));
		
		return false;
	}
	
	public static boolean atualizarPessoa(Pessoa pessoaOld, Pessoa pessoaNew) {
		if(pessoaNew!=null && pessoaOld!=null)
			if(!isPessoa(pessoaNew)) { 
				pessoas.set(pessoas.indexOf(buscarPessoa(pessoaOld)), pessoaNew);
				return true;
			}
		return false;
		
		//Questionamento: Como achar esse index de pessoaOld? R: indexOf();
	}
	
}
