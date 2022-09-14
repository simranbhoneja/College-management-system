package net.codejava.sql;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class AdminViewTeacher {

	JFrame frame;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminViewTeacher window = new AdminViewTeacher();
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
	public AdminViewTeacher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 629, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";
		
        try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Select * from Teacher;");) {
        	
        	ResultSet rs = st.executeQuery();
        	
        	scrollPane = new JScrollPane();
        	scrollPane.setBounds(10, 11, 593, 300);
        	frame.getContentPane().add(scrollPane);
        	table = new JTable();
        	scrollPane.setViewportView(table);
        	table.setModel(DbUtils.resultSetToTableModel(rs));
    		
    		JButton btnNewButton = new JButton("Back");
    		btnNewButton.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				frame.dispose();
    				AdminDashboardTeacher window = new AdminDashboardTeacher();
					window.frame.setVisible(true);
    			}
    		});
    		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 15));
    		btnNewButton.setBounds(239, 329, 114, 34);
    		frame.getContentPane().add(btnNewButton);
        }
        catch(Exception e1) { 
   		 e1.printStackTrace(); 
    	}
		
	}

}
