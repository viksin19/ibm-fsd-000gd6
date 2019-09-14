package NotePad;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SaveFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	
	String filename;
	public SaveFrame() {
		
	}
	
	

	public Note save(Note note) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFileName = new JLabel("File Name");
		lblFileName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFileName.setBackground(Color.BLUE);
		lblFileName.setBounds(24, 92, 115, 14);
		contentPane.add(lblFileName);
		
		textField = new JTextField();
		textField.setBounds(149, 87, 178, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filename = textField.getText();
				note.setDestination(filename);
				System.out.println(note.getDestination());
				setVisible(false);
				
				//System.out.println(filename);
			}
		});
		return note;
		setVisible(true);
		btnSave.setBackground(Color.MAGENTA);
		btnSave.setBounds(200, 143, 89, 23);
		contentPane.add(btnSave);
	}

}
