package exemplo1_UsingDateDeprecated;

import java.time.LocalDateTime;
import java.util.Calendar;

//Date com LocalDateTime e Calendar
public class VerificarAniversario {
	
	//LocalDateTime
	public static boolean isAniversario_Solucao1(Pessoa pessoa) {
		if(pessoa.getDataNascimento().getDate()==LocalDateTime.now().getDayOfMonth()
			&&
			pessoa.getDataNascimento().getMonth()==LocalDateTime.now().getMonthValue()
			)
				return true;	
		
		else
			return false;
	}
	
	//Calendar
	public static boolean isAniversario_Solucao2(Pessoa pessoa) {
		int diaPessoa, mesPessoa;	//inf da Pessoa
		int diaAtual, mesAtual;		//inf do sistema
		
		diaPessoa = pessoa.getDataNascimento().getDate();
		mesPessoa = pessoa.getDataNascimento().getMonth();
		
		//ao inv�s de LocalDateTime.now().
		
		diaAtual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH); //LocalDateTime.now().getDayOfMonth()
		mesAtual = Calendar.getInstance().get(Calendar.MONTH);	// LocalDateTime.now().getMonthValue()
		mesAtual++;
		
		if(diaPessoa == diaAtual && mesPessoa == mesAtual)
			return true;
		
		else
			return false;
		
	}
	
}
