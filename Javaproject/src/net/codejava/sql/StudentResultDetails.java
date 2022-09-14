package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class StudentResultDetails {

	JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentResultDetails window = new StudentResultDetails();
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
	public StudentResultDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your Id:-");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel.setBounds(34, 21, 109, 33);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(180, 25, 200, 30);
		frame.getContentPane().add(textField);
		
		JButton btnNewButton = new JButton("Display Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";
				String id = textField.getText();
		        try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Select * from Gives where Stud_id=?");) {
		        	st.setString(1, id);
		        	ResultSet rs = st.executeQuery();
		           
			        
			        table.setModel(DbUtils.resultSetToTableModel(rs));
			         
			    } 
			   
			 
			catch (Exception e1) { 
				//JOptionPane.showMessageDialog(btnNewButton, "Wrong Id entered");
				e1.printStackTrace();
			}
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnNewButton.setBounds(132, 83, 138, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StudentSection window = new StudentSection();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnNewButton_1.setBounds(148, 213, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		table = new JTable();
		table.setEnabled(false);
        JScrollPane scrollPane = new JScrollPane();
        
		scrollPane.setBounds(10, 121, 414, 83);
        frame.getContentPane().add(scrollPane);
		scrollPane.setViewportView(table);
		
		
		
		
	}

}
