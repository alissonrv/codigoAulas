package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Tela2;
import view.Tela1;
public class Controller implements ActionListener{
	
	Tela1 tela;
	Tela2 tela2;
	
	
	public Controller(Tela1 tela, Tela2 tela2) {
		this.tela = tela;
		this.tela2 = tela2;
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==tela.getAddButton()) {
			
		}

		if(event.getSource()==tela.getSairButton()) {
			
		}
			
		if(event.getSource()==tela2.getAddButton()) {
			
		}
			
	}

}
