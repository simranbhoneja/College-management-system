package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class StudentLogin {

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
					StudentLogin window = new StudentLogin();
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
	public StudentLogin() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 663, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStudentLogin = new JLabel("Student Login ");
		lblStudentLogin.setFont(new Font("Calibri", Font.BOLD, 30));
		lblStudentLogin.setBounds(243, 21, 201, 41);
		frame.getContentPane().add(lblStudentLogin);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name :-");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(243, 83, 89, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password :-");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(243, 137, 113, 41);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(435, 85, 150, 34);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(435, 138, 150, 34);
		frame.getContentPane().add(textField_1);
		
		final JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = textField.getText();
                String password = textField_1.getText();
                String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";

		        try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Select Stud_id, Stud_pass from Student_login where Stud_id=? and Stud_pass=?");) {
		            st.setString(1, userName);
                    st.setString(2, password);
		            ResultSet rs = st.executeQuery();

		            // Iterate through the data in the result set and display it.
		            if (rs.next()) {
		            	frame.dispose();
						StudentSection window = new StudentSection();
						window.frame.setVisible(true);
						
		            }
		            else
		            {
		            	JOptionPane.showMessageDialog(btnNewButton, "Wrong Username or Password");
		            }
		        }
		        // Handle any errors that may have occurred.
		        catch (SQLException e1) {
		            e1.printStackTrace();
		        }
		       
			}
			
		});
		
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnNewButton.setBounds(308, 220, 107, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon (img));
		lblNewLabel.setBounds(45, 68, 174, 243);
		frame.getContentPane().add(lblNewLabel);
	}

}
