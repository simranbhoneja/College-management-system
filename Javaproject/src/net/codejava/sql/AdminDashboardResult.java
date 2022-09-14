package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminDashboardResult {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboardResult window = new AdminDashboardResult();
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
	public AdminDashboardResult() {
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
		lblAdminDashboard.setBounds(84, 11, 267, 31);
		frame.getContentPane().add(lblAdminDashboard);
		
		JButton btnAddTeacher = new JButton("Add Student Result");
		btnAddTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminAddResult window = new AdminAddResult();
				window.frame.setVisible(true);
			}
		});
		
		
		btnAddTeacher.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnAddTeacher.setBounds(114, 53, 166, 31);
		frame.getContentPane().add(btnAddTeacher);
		
		JButton btnAddTeacher_1 = new JButton("View Student Results");
		btnAddTeacher_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminViewResult window = new AdminViewResult();
				window.frame.setVisible(true);
			}
		});
		btnAddTeacher_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnAddTeacher_1.setBounds(114, 121, 166, 31);
		frame.getContentPane().add(btnAddTeacher_1);
		
		JButton btnAddTeacher_2 = new JButton("Back");
		btnAddTeacher_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboard window = new AdminDashboard();
				window.frame.setVisible(true);
			}
		});
		btnAddTeacher_2.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnAddTeacher_2.setBounds(114, 191, 166, 31);
		frame.getContentPane().add(btnAddTeacher_2);
	}

}
