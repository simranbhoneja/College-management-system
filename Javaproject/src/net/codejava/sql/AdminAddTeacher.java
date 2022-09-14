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
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class AdminAddTeacher {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddTeacher window = new AdminAddTeacher();
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
	public AdminAddTeacher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 564, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterProfId_1 = new JLabel("Enter Prof Id :-");
		lblEnterProfId_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterProfId_1.setBounds(22, 27, 129, 33);
		frame.getContentPane().add(lblEnterProfId_1);
		
		JLabel lblEnterProfName = new JLabel("Enter Prof Name  :-");
		lblEnterProfName.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterProfName.setBounds(22, 84, 129, 33);
		frame.getContentPane().add(lblEnterProfName);
		
		JLabel lblEnterProfGender = new JLabel("Enter Prof Gender :-");
		lblEnterProfGender.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterProfGender.setBounds(22, 145, 129, 33);
		frame.getContentPane().add(lblEnterProfGender);
		
		JLabel lblEnter = new JLabel("Enter Prof Education  :-");
		lblEnter.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnter.setBounds(22, 201, 153, 33);
		frame.getContentPane().add(lblEnter);
		
		JLabel lblEnterProfId = new JLabel("Enter Prof Teaching Exp :-");
		lblEnterProfId.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterProfId.setBounds(22, 263, 169, 33);
		frame.getContentPane().add(lblEnterProfId);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(244, 267, 184, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(244, 205, 184, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(244, 149, 184, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(244, 88, 184, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(244, 31, 184, 20);
		frame.getContentPane().add(textField_4);
		
		final JButton btnNewButton_1 = new JButton("Add Teacher");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";
				
		        try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Insert into Teacher values(?,?,?,?,?)");) {
		        	st.setString(1,textField_4.getText());
		        	st.setString(2,textField_3.getText());
		        	st.setString(3,textField_2.getText());
		        	st.setString(4,textField_1.getText());
		        	st.setString(5,textField.getText());
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
		btnNewButton_1.setBounds(166, 323, 129, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboardTeacher window = new AdminDashboardTeacher();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(409, 323, 129, 23);
		frame.getContentPane().add(btnNewButton_1_1);
	}

}
