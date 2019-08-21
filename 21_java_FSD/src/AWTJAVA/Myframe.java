package AWTJAVA;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Myframe extends JFrame {
	
	private JLabel label1;
	private TextField textfield1;
	private JButton button1;
	
	public Myframe() {
		super();
		label1=new JLabel();
		label1.setText("Enter your name : ");
		textfield1 = new TextField(25);
		button1 = new JButton();
		button1.setText("Say hello");
		this.setTitle("My Frame");
		this.setSize(400, 350);
		this.setLayout(new FlowLayout());
		
		this.add(label1);
		this.add(textfield1);
		this.add(button1);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}

}
