package conceitoHeranca;

public class B extends A{
	double atr; //sobreposição de tipo - não recomendável

	public B(int atr) {
		super(atr);
	}
	
	public B(int atr, int atr2) {
		super(atr, atr2);
	}
	
	public B(int atr, int atr2, int atr3) {
		super(atr, atr2);
		this.atr3 = atr3;
	}
	
	//boa prática de programação: 
}
