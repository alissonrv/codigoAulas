package exemplo1_UsingDateDeprecated;

import java.util.Date;

public class Pessoa {
	private String name;
	private Date dataNascimento;
	
	public Pessoa(String name, Date dataNascimento) {
		this.name = name;
		this.dataNascimento = dataNascimento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
