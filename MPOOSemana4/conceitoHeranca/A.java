package conceitoHeranca;

public class A {
	private int atr;
	
	protected void metodo() {}
	public abstract void metodoAbstrato(); //
	
	//se n�o tiver construtor, herdeiros tamb�m n�o precisam declarar construtores
	//se houver ao menos um construtor n�o defaut, herdeiros precisar ter ao menos um construtor n�o defaut
	
	public A(int atr) {
		this.atr = atr;
	}
	
	public A(int atr, int atr2) {
		this.atr = atr;
		this.atr = atr2;
	}
}
