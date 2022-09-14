package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class AdminAddStudent {

	JFrame frame;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	protected Component btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddStudent window = new AdminAddStudent();
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
	public AdminAddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 574, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterStudentId = new JLabel("Enter Student Id :-");
		lblEnterStudentId.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterStudentId.setBounds(20, 21, 129, 33);
		frame.getContentPane().add(lblEnterStudentId);
		
		JLabel lblEnterStudentName = new JLabel("Enter Student Name :-");
		lblEnterStudentName.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterStudentName.setBounds(20, 65, 144, 33);
		frame.getContentPane().add(lblEnterStudentName);
		
		JLabel lblEnterStudentId_1 = new JLabel("Enter Student Gender :-");
		lblEnterStudentId_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterStudentId_1.setBounds(20, 109, 164, 33);
		frame.getContentPane().add(lblEnterStudentId_1);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Student Class :-");
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(20, 153, 144, 33);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Student Sem:-");
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(20, 197, 144, 33);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("EnterStudent Branch:-");
		lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(20, 239, 144, 33);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Enter Student Course :-");
		lblNewLabel_6.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(20, 283, 144, 33);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(214, 25, 184, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(214, 69, 184, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(214, 113, 184, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(214, 157, 184, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(214, 201, 184, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(214, 243, 184, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(214, 287, 184, 20);
		frame.getContentPane().add(textField_6);
		
		final JButton btnNewButton_1 = new JButton("Add Student");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";
				
		        try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Insert into Student values(?,?,?,?,?,?,?)");) {
		        	st.setString(1,textField.getText());
		        	st.setString(2,textField_1.getText());
		        	st.setString(3,textField_2.getText());
		        	st.setString(4,textField_3.getText());
		        	st.setString(5,textField_4.getText());
		        	st.setString(6,textField_5.getText());
		        	st.setString(7,textField_6.getText());
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
		btnNewButton_1.setBounds(179, 328, 129, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboardStudent window = new AdminDashboardStudent();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(446, 328, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
	}
	
	
		
	}

