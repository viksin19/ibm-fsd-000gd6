package FIRSTswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import JDBV_20.Employeeservice;
import JDBV_20.Employeeserviceimpl;
import employee.Employee;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class MyEmployeeFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblLastName;
	private JTextField textField_2;
	private JLabel lblEmail;
	private JTextField textField_3;
	private JButton btnSubmit;
	private JLabel lblDeleteById;
	private JTextField textField_4;
	private JButton btnDelete;
	private JLabel lblFindById;
	private JTextField textField_5;
	private JButton btnSearch;
	private JButton btnDisplay;
	private JButton btnCommomnTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyEmployeeFrame frame = new MyEmployeeFrame();
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
	public MyEmployeeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(10, 24, 65, 14);
		contentPane.add(lblEmployeeId);
		
		textField = new JTextField();
		textField.setBounds(97, 21, 118, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(10, 49, 55, 20);
		contentPane.add(lblFirstName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 49, 118, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 72, 65, 20);
		contentPane.add(lblLastName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 72, 118, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 108, 46, 14);
		contentPane.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(97, 103, 118, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					 Employeeservice service = new Employeeserviceimpl();
					 service.createEmployee(new Employee(Integer.parseInt(textField.getText()),textField_1.getText(),textField_2.getText(),textField_3.getText()));
				      JOptionPane.showMessageDialog(contentPane, "ADDED..");
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		});
		btnSubmit.setBounds(126, 151, 89, 23);
		contentPane.add(btnSubmit);
		
		lblDeleteById = new JLabel("Delete by ID");
		lblDeleteById.setBounds(10, 196, 76, 23);
		contentPane.add(lblDeleteById);
		
		textField_4 = new JTextField();
		textField_4.setBounds(97, 199, 118, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					 Employeeservice service = new Employeeserviceimpl();
					 service.deleteEmployee(Integer.parseInt(textField_4.getText()));
					 JOptionPane.showMessageDialog(contentPane, " HaHa Deleted");
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		});
		btnDelete.setBounds(255, 196, 89, 23);
		contentPane.add(btnDelete);
		
		lblFindById = new JLabel("Find by ID");
		lblFindById.setBounds(10, 230, 76, 14);
		contentPane.add(lblFindById);
		
		textField_5 = new JTextField();
		textField_5.setBounds(95, 230, 120, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 Employeeservice service = new Employeeserviceimpl();
					boolean sres = service.searchemployee(Integer.parseInt(textField_5.getText()));
					 if(sres) {JOptionPane.showMessageDialog(contentPane, "Employee Found");
					 }else {
						 JOptionPane.showMessageDialog(contentPane, "Not Found");
					 }
					
				}catch(SQLException p) {
					
					
				}
			}
		});
		btnSearch.setBounds(255, 229, 89, 23);
		contentPane.add(btnSearch);
		
		btnDisplay = new JButton("Display ");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new Myframe2();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDisplay.setBounds(300, 48, 89, 23);
		contentPane.add(btnDisplay);
		
		btnCommomnTable = new JButton("Commomn Table");
		btnCommomnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					new Commonframe();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCommomnTable.setBounds(300, 99, 89, 23);
		contentPane.add(btnCommomnTable);
	}

}
