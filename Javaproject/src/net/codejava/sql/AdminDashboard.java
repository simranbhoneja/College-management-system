package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminDashboard {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard window = new AdminDashboard();
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
	public AdminDashboard() {
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
		lblAdminDashboard.setBounds(87, 11, 267, 31);
		frame.getContentPane().add(lblAdminDashboard);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboardStudent window = new AdminDashboardStudent();
				window.frame.setVisible(true);
			}
		});
		btnStudent.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnStudent.setBounds(111, 53, 166, 31);
		frame.getContentPane().add(btnStudent);
		
		JButton btnTeacher = new JButton("Teacher");
		btnTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboardTeacher window = new AdminDashboardTeacher();
				window.frame.setVisible(true);
			}
		});
		btnTeacher.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnTeacher.setBounds(111, 95, 166, 31);
		frame.getContentPane().add(btnTeacher);
		
		JButton btnExamination = new JButton("Examination");
		btnExamination.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboardExam window = new AdminDashboardExam();
				window.frame.setVisible(true);
			}
		});
		btnExamination.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnExamination.setBounds(111, 137, 166, 31);
		frame.getContentPane().add(btnExamination);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboardResult window = new AdminDashboardResult();
				window.frame.setVisible(true);
			}
		});
		btnResult.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnResult.setBounds(111, 179, 166, 31);
		frame.getContentPane().add(btnResult);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminSection window = new AdminSection();
				window.frame.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnBack.setBounds(111, 221, 166, 31);
		frame.getContentPane().add(btnBack);
	}

}
