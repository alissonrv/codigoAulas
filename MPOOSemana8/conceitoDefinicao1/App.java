package conceitoDefinicao1;

public class App {
	public static void main(String[] args) {
		//Definição: A parte só existe se o todo existir:
		Porta porta = new Porta("rosa");
		System.out.println(porta.cor);	//Quebra definição 1
		
		Carro carro = new Carro("rosa", 1.0);
		System.out.println(carro.porta.cor);
		System.out.println(carro.motor.potencia);
		
		carro = null;
		System.out.println(porta.cor);
		//Quebra de definição 2: Se o todo deixa de existir, as partes deixam de existir
	}
}
