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

public class Tela extends JFrame{
	JButton addButton;
	
	public Tela() {
		super("Título");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());	//mudar na maioria das aplicações
		addButton = new JButton("Adicionar");
		
		add(addButton);	
		setVisible(true);
	}
}
