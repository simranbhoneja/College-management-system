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

public class AdminAddExam {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAddExam window = new AdminAddExam();
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
	public AdminAddExam() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 499, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterExamId = new JLabel("Enter Exam Id :-");
		lblEnterExamId.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterExamId.setBounds(24, 26, 129, 33);
		frame.getContentPane().add(lblEnterExamId);
		
		JLabel lblEnterExamDate = new JLabel("Enter Exam Date :-");
		lblEnterExamDate.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterExamDate.setBounds(24, 91, 129, 33);
		frame.getContentPane().add(lblEnterExamDate);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(184, 26, 184, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(184, 95, 184, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton_1 = new JButton("Add Exam");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";
				
		        try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Insert into Examination values(?,?)");) {
		        	
		        	st.setString(1,textField.getText());
		        	st.setString(2,textField_1.getText());
		        int a = st.executeUpdate();
		        if(textField.getText() == null)	
		        {
		        	JOptionPane.showMessageDialog(frame, "Error!!");
		        }
		        if(a == 1) {
		        	JOptionPane.showMessageDialog(frame,"Added Successfully");
		        	}
		        	else
		        	{
		        		
						JOptionPane.showMessageDialog(frame, "Error!!");
		        	}
		        	if(textField.getText() == null)
		        	{
		        		JOptionPane.showMessageDialog(frame, "Error!!Please input Data");
		        	}
		        	}
		        
		        catch (Exception e1) { 
		        	JOptionPane.showMessageDialog(frame, "Error!!Please insert Data");
		   	}
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnNewButton_1.setBounds(122, 188, 129, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Back");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboardExam window = new AdminDashboardExam();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(333, 186, 129, 23);
		frame.getContentPane().add(btnNewButton_1_1);
	}

}
