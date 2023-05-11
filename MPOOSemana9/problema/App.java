package problema;

public class App {
	
	public static void main(String[] args) {
		
		Animal homem = new SerHumano();
		SerHumano homem2 = new SerHumano();
		Racional homem3 = new SerHumano();
		
		if(homem instanceof SerHumano)	//V
			System.out.println("é SerHumano");
		
		if(homem instanceof Animal)	//V
			System.out.println("é Animal");
		
		if(homem instanceof Racional)	//V
			System.out.println("é Racional");
		
		if(homem instanceof Irracional)	//F
			System.out.println("é Irracional");
	}
}
