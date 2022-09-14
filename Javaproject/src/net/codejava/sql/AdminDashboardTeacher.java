package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminDashboardTeacher {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboardTeacher window = new AdminDashboardTeacher();
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
	public AdminDashboardTeacher() {
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
		lblAdminDashboard.setBounds(85, 11, 267, 31);
		frame.getContentPane().add(lblAdminDashboard);
		
		JButton btnAddTeacher = new JButton("Add Teacher");
		btnAddTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminAddTeacher window = new AdminAddTeacher();
				window.frame.setVisible(true);
			}
		});
		btnAddTeacher.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnAddTeacher.setBounds(113, 53, 166, 31);
		frame.getContentPane().add(btnAddTeacher);
		
		JButton btnEditTeacher = new JButton("Update Teacher");
		btnEditTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminTeacherUpdate window = new AdminTeacherUpdate();
				window.frame.setVisible(true);
			}
		});
		btnEditTeacher.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnEditTeacher.setBounds(113, 109, 166, 31);
		frame.getContentPane().add(btnEditTeacher);
		
		JButton btnViewTeachers = new JButton("View Teachers");
		btnViewTeachers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminViewTeacher window = new AdminViewTeacher();
				window.frame.setVisible(true);
			}
		});
		btnViewTeachers.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnViewTeachers.setBounds(113, 161, 166, 31);
		frame.getContentPane().add(btnViewTeachers);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboard window = new AdminDashboard();
				window.frame.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnBack.setBounds(113, 219, 166, 31);
		frame.getContentPane().add(btnBack);
	}

}
