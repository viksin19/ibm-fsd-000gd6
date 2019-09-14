package NotePad;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OpenFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	String filename;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public OpenFrame(Note note) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFileName = new JLabel("File Name");
		lblFileName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFileName.setBounds(21, 71, 100, 20);
		contentPane.add(lblFileName);
		
		textField = new JTextField();
		textField.setBounds(131, 71, 181, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filename = textField.getText();
				note.setSource(filename);
				setVisible(false);
			}
		});
		setVisible(true);
		btnOpen.setBackground(Color.GREEN);
		btnOpen.setBounds(163, 121, 89, 23);
		contentPane.add(btnOpen);
	}
	
	

}
