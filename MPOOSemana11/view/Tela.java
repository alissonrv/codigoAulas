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
	JPanel panel;
	JLabel label;
	JTextField field;
	JTextField dataField, cpfField;//recomenda-se o uso de máscara
	JPasswordField senhaField;
	JButton button1, button2;
	JCheckBox checkBox;
	JRadioButton opcao1RadioButton, opcao2RadioButton, opcao3RadioButton;
	ButtonGroup bg; //agrupa os RadiosButton
	JTextArea area;
	JList list;
	
	public Tela() {
		super("Título");
		setSize(300, 300);
//		setResizable(false);
//		setUndecorated(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		panel = new JPanel();
		panel.setSize(300, 300);
//		panel.setBackground(Color.BLUE);
		//componentes gráficos:
		label = new JLabel("Label");
		//Tratamento de Exceção:Próxima aula
		
		area = new JTextArea(6, 10);
		try {
			dataField = new JFormattedTextField(new MaskFormatter("##/##/####"));
			dataField.setColumns(6);
			cpfField = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpfField.setColumns(9);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		senhaField = new JPasswordField(10);
		
		field = new JTextField(10);
		
		button1 = new JButton("OK");	
		button2 = new JButton("Cancel");
		
		checkBox = new JCheckBox();
		checkBox.setSelected(true);
		
		opcao1RadioButton = new JRadioButton("opcao1", true);
		opcao2RadioButton = new JRadioButton("opcao2", false);
		opcao3RadioButton = new JRadioButton("opcao3", false);
		bg = new ButtonGroup();
		bg.add(opcao1RadioButton);
		bg.add(opcao2RadioButton);
		bg.add(opcao3RadioButton);
		
		//adicionados na Janela
//		panel.add(button1);
//		panel.add(button2);
//		add(panel);
		
		String opcoes [] = {"opcao1", "opcao2", "opcao3", "opcao4", "opcao5"};
		list = new JList(opcoes);
		list.setSelectedIndex(0);
		list.setVisibleRowCount(2);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(list);
		add(opcao1RadioButton);
		add(opcao2RadioButton);
		add(opcao3RadioButton);
		add(senhaField);
		add(label);
		add(field);
		add(dataField);
		add(cpfField);
		add(button1);
		add(button2);
		add(checkBox);
		add(area); //como colocar uma barra de rolagem em JTextArea?
		
		setVisible(true);
	}
}
