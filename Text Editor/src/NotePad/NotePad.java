package NotePad;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class NotePad extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * 
	 * 
	 */
	
	 
	
	Note note = new Note();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotePad frame = new NotePad();
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
	public NotePad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JEditorPane dtrpnWelcomeToText = new JEditorPane();
		dtrpnWelcomeToText.setText("Welcome to Text Editor");
		dtrpnWelcomeToText.setBounds(10, 29, 414, 221);
		contentPane.add(dtrpnWelcomeToText);
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dtrpnWelcomeToText.setText(" "); 
			}
		});
		btnNew.setBounds(10, 0, 64, 23);
		contentPane.add(btnNew);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				  SaveFrame st=  new SaveFrame();
				Note nt =st.save(note);
				  String str = dtrpnWelcomeToText.getText();
				 String dest = note.getDestination();
				//System.out.println(destination);
				 FileWriter out;
				 File file = new File(dest);
				try {
					out = new FileWriter(file);
					PrintWriter output = new PrintWriter(out);
					output.println(str);
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			} 
		});
		btnSave.setBounds(73, 0, 64, 23);
		contentPane.add(btnSave);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new OpenFrame(note);
				String src = note.getSource();
				FileReader reader;
				String s="";
				try {
				    reader = new FileReader(new File(src));
				    BufferedReader in = new BufferedReader(reader);
				    String outputstring;
				    while((outputstring = in.readLine())!=null) {
				    	s = s+outputstring+"\n";
				    }
				    dtrpnWelcomeToText.setText(s);
				    
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnOpen.setBounds(139, 0, 64, 23);
		contentPane.add(btnOpen);
		
		
	}
}
