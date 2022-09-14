package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class AdminAddResult {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddResult window = new AdminAddResult();
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
	public AdminAddResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 577, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterStudentId = new JLabel("Enter Student Id :-");
		lblEnterStudentId.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterStudentId.setBounds(21, 21, 129, 33);
		frame.getContentPane().add(lblEnterStudentId);
		
		JLabel lblEnterExamId_1 = new JLabel("Enter Exam Id :-");
		lblEnterExamId_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterExamId_1.setBounds(21, 81, 129, 33);
		frame.getContentPane().add(lblEnterExamId_1);
		
		JLabel lblEnterResult = new JLabel("Enter Result :-");
		lblEnterResult.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterResult.setBounds(21, 139, 129, 33);
		frame.getContentPane().add(lblEnterResult);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(223, 25, 184, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(223, 85, 184, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(223, 143, 184, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton_1 = new JButton("Add Result");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";
				
		        try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Insert into Gives values(?,?,?)");) {
		        	st.setString(1,textField.getText());
		        	st.setString(2,textField_1.getText());
		        	st.setString(3,textField_2.getText());
		        int a = st.executeUpdate();
		        	if(a == 1) {
		        	JOptionPane.showMessageDialog(frame,"Added Successfully");
		        	}
		        	else
		        	{
		        		
						JOptionPane.showMessageDialog(frame, "Error!!");
		        	}
		        	}
		        
		        catch (Exception e1) { 
		        	JOptionPane.showMessageDialog(frame, "Error!!Please insert Data");
		   	}
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnNewButton_1.setBounds(148, 214, 129, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboardResult window = new AdminDashboardResult();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(409, 212, 129, 23);
		frame.getContentPane().add(btnNewButton_1_1);
	}

}
