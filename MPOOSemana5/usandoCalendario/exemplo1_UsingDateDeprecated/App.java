package exemplo1_UsingDateDeprecated;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class App {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Jose", new Date(1990, 12, 31));
		Pessoa pessoa2 = new Pessoa("Maria", new Date(1985, 07, 25));
		System.out.println(pessoa2.getDataNascimento().getMonth());
		
		if(VerificarAniversario.isAniversario_Solucao1(pessoa))
			System.out.println("Parab�ns para voc�, Jos�");
		
		if(VerificarAniversario.isAniversario_Solucao1(pessoa2))
			System.out.println("Parab�ns para voc�, Maria");
	
		//Usando Calendar:
		System.out.println(LocalDateTime.now().getDayOfMonth());
		System.out.println(LocalDateTime.now().getMonthValue());
		
		System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		System.out.println(Calendar.getInstance().get(Calendar.MONTH));
		
		if (VerificarAniversario.isAniversario_Solucao2(pessoa))
			System.out.println("Parab�ns para voc�, Jos�!");
		
		if (VerificarAniversario.isAniversario_Solucao2(pessoa2))
			System.out.println("Parab�ns para voc�, Maria!");
	}
}
