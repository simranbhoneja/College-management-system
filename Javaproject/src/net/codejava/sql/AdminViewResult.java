package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminViewResult {

	JFrame frame;
	private final JTable table = new JTable();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminViewResult window = new AdminViewResult();
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
	public AdminViewResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 656, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 22, 620, 304);
		frame.getContentPane().add(scrollPane);
		scrollPane.setViewportView(table);
		String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";
		
        try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Select * from Gives;");) {
        	
        	ResultSet rs = st.executeQuery();
        	table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e1) { 
   		 e1.printStackTrace(); 
   	}
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboardResult window = new AdminDashboardResult();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnNewButton.setBounds(252, 344, 132, 29);
		frame.getContentPane().add(btnNewButton);
	}

}
