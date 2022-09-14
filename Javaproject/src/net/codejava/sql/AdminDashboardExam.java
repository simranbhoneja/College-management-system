package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminDashboardExam {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboardExam window = new AdminDashboardExam();
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
	public AdminDashboardExam() {
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
		lblAdminDashboard.setBounds(83, 11, 267, 31);
		frame.getContentPane().add(lblAdminDashboard);
		
		JButton btnAddExamDetails = new JButton("Add Exam Details");
		btnAddExamDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminAddExam window = new AdminAddExam();
				window.frame.setVisible(true);
			}
		});
		btnAddExamDetails.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnAddExamDetails.setBounds(116, 56, 166, 31);
		frame.getContentPane().add(btnAddExamDetails);
		
		JButton btnViewExamDetails = new JButton("View Exam Details");
		btnViewExamDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminViewExamDetails window = new AdminViewExamDetails();
				window.frame.setVisible(true);
			}
		});
		btnViewExamDetails.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnViewExamDetails.setBounds(116, 119, 166, 31);
		frame.getContentPane().add(btnViewExamDetails);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboard window = new AdminDashboard();
				window.frame.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnBack.setBounds(116, 184, 166, 31);
		frame.getContentPane().add(btnBack);
	}

}
