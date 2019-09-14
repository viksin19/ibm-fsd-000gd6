package FIRSTswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Commonframe extends JFrame {

	private JPanel contentPane;
	private JTable table;
RS2XMLConfig config =null;
	/**
	 * Launch the application.
	 */
	
	
	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Commonframe() throws SQLException {
		config = new RS2XMLConfig();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 11, 414, 170);
		contentPane.add(table);
		
		JButton btnShowMergeTable = new JButton("SHow merge table");
		btnShowMergeTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					ResultSet rs;
					rs = config.getalltable();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			}
		});
		setVisible(true);
		btnShowMergeTable.setBounds(161, 206, 89, 23);
		contentPane.add(btnShowMergeTable);
	}

}
