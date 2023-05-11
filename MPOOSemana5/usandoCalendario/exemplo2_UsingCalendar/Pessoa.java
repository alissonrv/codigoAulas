package exemplo2_UsingCalendar;

import java.util.Calendar;

public class Pessoa {
	private String name;
	private Calendar dataNascimento;
	
	public Pessoa(String name, Calendar dataNascimento) {
		super();
		this.name = name;
		this.dataNascimento = dataNascimento;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
