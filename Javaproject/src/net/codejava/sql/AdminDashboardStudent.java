package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminDashboardStudent {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboardStudent window = new AdminDashboardStudent();
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
	public AdminDashboardStudent() {
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
		
		JLabel lblAdminDashboard = new JLabel("Admin Dashboard");
		lblAdminDashboard.setFont(new Font("Calibri", Font.BOLD, 30));
		lblAdminDashboard.setBounds(77, 11, 267, 31);
		frame.getContentPane().add(lblAdminDashboard);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminAddStudent window = new AdminAddStudent();
				window.frame.setVisible(true);
			}
		});
		
		btnAddStudent.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnAddStudent.setBounds(117, 53, 166, 31);
		frame.getContentPane().add(btnAddStudent);
		
		JButton btnViewStudents = new JButton("Update Student");
		btnViewStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminStudentUpdate window = new AdminStudentUpdate();
				window.frame.setVisible(true);
			}
		});
		btnViewStudents.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnViewStudents.setBounds(117, 107, 166, 31);
		frame.getContentPane().add(btnViewStudents);
		
		JButton btnSearchStudents = new JButton("View Students");
		btnSearchStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminViewStudent window = new AdminViewStudent();
				window.frame.setVisible(true);
				
			}
		});
		btnSearchStudents.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnSearchStudents.setBounds(117, 162, 166, 31);
		frame.getContentPane().add(btnSearchStudents);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboard window = new AdminDashboard();
				window.frame.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnBack.setBounds(117, 219, 166, 31);
		frame.getContentPane().add(btnBack);
	}

}
