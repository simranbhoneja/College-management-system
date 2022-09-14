package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class StudentSubjectDetails {

	JFrame frame;
	private JTextField textField;
	
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSubjectDetails window = new StudentSubjectDetails();
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
	public StudentSubjectDetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your Id:-");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNewLabel.setBounds(22, 25, 109, 33);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(171, 24, 200, 30);
		frame.getContentPane().add(textField);
		
		final JButton btnNewButton = new JButton("Display Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";
				String id = textField.getText();
		        try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Select * from Subject where Subj_id in(Select Subj_id from Contain where Course_id=(Select Course_id from Student where Stud_id=?));");) {
		        	st.setString(1, id);
		        	ResultSet rs = st.executeQuery();
		            
			         table = new JTable();
			 		scrollPane.setViewportView(table);
		        			 	table.setModel(DbUtils.resultSetToTableModel(rs));
			   
		        }
			catch (Exception e1) { 
				//JOptionPane.showMessageDialog(btnNewButton, "Wrong Id entered");
				e1.printStackTrace();
			}
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 11));
		btnNewButton.setBounds(145, 83, 129, 23);
		frame.getContentPane().add(btnNewButton);
		
	
		
		
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 126, 414, 75);
		frame.getContentPane().add(scrollPane);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StudentSection window = new StudentSection();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnNewButton_1.setBounds(172, 212, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
