package definicaoInterface;

public abstract class Conta implements Operacao{
	
	double saldo;
	public default boolean depositar(double valor) {
		return false;
	}
	
	public abstract boolean sacar(double valor);
}
