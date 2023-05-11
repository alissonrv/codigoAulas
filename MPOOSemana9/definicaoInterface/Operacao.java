package definicaoInterface;

public interface Operacao {
	
	public default boolean depositar(double valorDepositar, double valorOriginal) {
		valorOriginal+=valorDepositar;
		return true;
	}
	
	public abstract boolean depositar(double valor);
	public boolean sacar(double valor);
}
