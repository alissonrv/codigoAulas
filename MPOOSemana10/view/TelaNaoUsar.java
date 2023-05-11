package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaNaoUsar{
	JFrame jFrame;
	JButton button1, button2;
	
	public TelaNaoUsar() {
		jFrame = new JFrame("Título");
		jFrame.setSize(300, 300);
//		jFrame.setResizable(false);
//		jFrame.setUndecorated(true);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		
		jFrame.setLayout(new FlowLayout());
		button1 = new JButton("OK");	
		button2 = new JButton("Cancel");	
		jFrame.add(button1);
		jFrame.add(button2);
		
		jFrame.setVisible(true);
	}
	
	
}
