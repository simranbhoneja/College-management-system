package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AminLogin {

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
					AminLogin window = new AminLogin();
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
	public AminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 667, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter User Id :-");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(267, 79, 137, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password :-");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(267, 129, 107, 41);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(426, 80, 150, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(426, 135, 150, 34);
		frame.getContentPane().add(textField_1);
		
		final JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = textField.getText();
                String password = textField_1.getText();
                String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";

		        try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Select Admin_id, Admin_pass from Admin_login where Admin_id=? and Admin_pass=?");) {
		            st.setString(1, userName);
                    st.setString(2, password);
		            ResultSet rs = st.executeQuery();

		            // Iterate through the data in the result set and display it.
		            if (rs.next()) {
		            	frame.dispose();
						AdminSection window = new AdminSection();
						window.frame.setVisible(true);
		            }
		            else
		            {
		            	JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
		            }
		        }
		        // Handle any errors that may have occurred.
		        catch (SQLException e1) {
		            e1.printStackTrace();
		        }
				
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnNewButton.setBounds(311, 217, 107, 34);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon (img));
		lblNewLabel_2.setBounds(37, 79, 174, 243);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblAdminLogin = new JLabel("Admin Login ");
		lblAdminLogin.setFont(new Font("Calibri", Font.BOLD, 30));
		lblAdminLogin.setBounds(261, 27, 201, 41);
		frame.getContentPane().add(lblAdminLogin);
	}
}
