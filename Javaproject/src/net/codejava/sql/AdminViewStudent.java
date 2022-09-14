package net.codejava.sql;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminViewStudent {

	JFrame frame;
	private JTable table;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminViewStudent window = new AdminViewStudent();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminViewStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 532, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 11, 516, 297);
		frame.getContentPane().add(scrollPane);
		String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";
		
        try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Select * from Student;");) {
        	
        	ResultSet rs = st.executeQuery();
        	table = new JTable();
    		table.setModel(DbUtils.resultSetToTableModel(rs));
    		scrollPane.setViewportView(table);
    		
    		btnNewButton = new JButton("Back");
    		btnNewButton.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				frame.dispose();
    				AdminDashboardStudent window = new AdminDashboardStudent();
					window.frame.setVisible(true);
    			}
    		});
    		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 15));
    		btnNewButton.setBounds(196, 332, 89, 23);
    		frame.getContentPane().add(btnNewButton);
	    } 
	   catch (Exception e1) { 
		 e1.printStackTrace(); 
	}
		
	}
}

