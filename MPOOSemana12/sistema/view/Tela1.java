package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.text.MaskFormatter;

public class Tela1 extends JFrame{
	JButton addButton, sairButton;
	
	public Tela1() {
		super("Título");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());	//mudar na maioria das aplicações
		addButton = new JButton("Adicionar");
		sairButton = new JButton("Sair");
		
		add(addButton);	
		add(sairButton);	
		setVisible(true);
	}

	public JButton getAddButton() {
		return addButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
}
