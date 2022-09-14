package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminSection {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSection window = new AdminSection();
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
	public AdminSection() {
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
		
		JLabel lblAdminSection = new JLabel("Admin Section");
		lblAdminSection.setFont(new Font("Calibri", Font.BOLD, 30));
		lblAdminSection.setBounds(111, 11, 201, 41);
		frame.getContentPane().add(lblAdminSection);
		
		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboard window = new AdminDashboard();
				window.frame.setVisible(true);
			}
		});
		btnDashboard.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnDashboard.setBounds(121, 84, 166, 43);
		frame.getContentPane().add(btnDashboard);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Miniproject window = new Miniproject();
				window.frame.setVisible(true);
			}
		});
		btnLogout.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnLogout.setBounds(121, 156, 166, 43);
		frame.getContentPane().add(btnLogout);
	}

}
