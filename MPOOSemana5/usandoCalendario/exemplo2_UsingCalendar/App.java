package exemplo2_UsingCalendar;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class App {
	public static void main(String[] args) {
		
		//Dica para criar inst�ncia de Calendar
		
//		new Date (1990, 12, 31)
		Calendar calendarTemp1 = Calendar.getInstance();
		calendarTemp1.set(1990, Calendar.DECEMBER, 31);
		Pessoa pessoa = new Pessoa("Jose",calendarTemp1);
		
//		new Date (1985, 7, 25) = objeto anonimo
		Calendar calendarTemp2 = Calendar.getInstance();
		calendarTemp2.set(1985, Calendar.JULY, 25);
		Pessoa pessoa2 = new Pessoa("Maria", calendarTemp2);
		
//		se eu fizesse isso:
//		calendarTemp1.set(1985, Calendar.JULY, 25); //Erro de sem�ntica, mudaria o niver de Jos�
//		Pessoa pessoa2 = new Pessoa("Maria",calendarTemp1);
		
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
