package conceitoDefinicao2;

public class Carro {
	Motor motor;

	public Carro(double potencia) {
		this.motor = new Motor(potencia);
	}
	
	private class Motor{	//antes private
		double potencia;
		
		public Motor(double potencia) {
			this.potencia = potencia;
		}
	}
}
