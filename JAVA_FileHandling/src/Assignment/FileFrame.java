package Assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class FileFrame extends JFrame {

	private JPanel contentPane;
    
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileFrame frame = new FileFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FileFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextArea txtrEnterTextHere = new JTextArea();
		txtrEnterTextHere.setText("Enter Text here");
		txtrEnterTextHere.setBounds(25, 11, 399, 170);
		contentPane.add(txtrEnterTextHere);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileWriter out;
				try {
					 out = new FileWriter(new File("swingFile.txt"));
					String x = txtrEnterTextHere.getText(); 
					PrintWriter output = new PrintWriter(out);
					output.println(x);
					out.close();
					txtrEnterTextHere.setText(" ");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnSave.setBounds(47, 211, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnRead = new JButton("Read");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileReader in;
				String str="";
				try {
					in = new FileReader("swingFile.txt");
					
					BufferedReader input = new BufferedReader(in);
					String s;
					while((s=input.readLine())!=null) {
					//	txtrEnterTextHere.setText(s);
						str = str + s + "\n";
					}
					txtrEnterTextHere.setText(str);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnRead.setBounds(292, 211, 89, 23);
		contentPane.add(btnRead);
		
		
	}
}
