package entidades;

public class Email {
	private String email;
	
	private Email (String email) {	//deixa de ser um problema de composição
		this.email = email;
	}
	
	public Email(Cliente cliente, String email) { //throws EmailError{
		if (validarEmail(email))
//			this.email = email;
		cliente.setEmail(new Email(email)); 
	}
	
	private boolean validarEmail(String email){
		//Questionamento: Pesquisar logica de valida��o de email?
		return true;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
//	public static boolean validarEmail(String email){
//		//Questionamento: Pesquisar logica de valida��o de email?
//		return true;
//	}
}