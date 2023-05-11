package definicaoInterface;

public class Corrente extends Conta{

	public boolean depositar(double valor) {
		this.saldo+=valor;
		return true;
	}

	@Override
	public boolean sacar(double valor) {
		if(saldo>=valor) {
			this.saldo-=valor;
			return true;
		}
		return false;
	}
}
