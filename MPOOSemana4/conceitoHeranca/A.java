package conceitoHeranca;

public class A {
	private int atr;
	
	protected void metodo() {}
	public abstract void metodoAbstrato(); //
	
	//se não tiver construtor, herdeiros também não precisam declarar construtores
	//se houver ao menos um construtor não defaut, herdeiros precisar ter ao menos um construtor não defaut
	
	public A(int atr) {
		this.atr = atr;
	}
	
	public A(int atr, int atr2) {
		this.atr = atr;
		this.atr = atr2;
	}
}
