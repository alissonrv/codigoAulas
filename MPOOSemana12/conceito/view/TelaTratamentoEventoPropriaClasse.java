package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaTratamentoEventoPropriaClasse extends JFrame implements ActionListener{
	
	JButton addButton, sairButton;
	
	public TelaTratamentoEventoPropriaClasse() {
		super("Título");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout()); //mudar na maioria das aplicações
		addButton = new JButton("Adicionar");
		sairButton = new JButton("Sair");
		
		addButton.addActionListener(this);//arg0=onde está o tratamento?
		sairButton.addActionListener(this);//arg0=onde está o tratamento?
//		addButton.addKeyListener(l);
		add(addButton);
		add(sairButton);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource()==addButton)
			JOptionPane.showMessageDialog(null, "botão Add pressionado");
		
		if(event.getSource()==sairButton)
			System.exit(0);
	}
}
