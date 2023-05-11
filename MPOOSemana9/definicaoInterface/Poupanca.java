package definicaoInterface;

public class Poupanca extends Conta{

	@Override
	public boolean depositar(double valor) {
		this.saldo+=valor;
		return true;
	}

	@Override
	public boolean sacar(double valor) {
		if(saldo+limite>=valor) {
			this.saldo-=valor;
			return true;
		}
		return false;
	}

}
