package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Miniproject {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Miniproject window = new Miniproject();
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
	public Miniproject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Arial Black", Font.BOLD, 30));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("College Management");
		lblNewLabel.setBounds(199, 42, 295, 52);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Admin Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AminLogin window = new AminLogin();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(251, 127, 212, 52);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnStudentLogin = new JButton("Student Login");
		btnStudentLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StudentLogin window = new StudentLogin();
				window.frame.setVisible(true);
			}
		});
		btnStudentLogin.setBounds(251, 208, 207, 58);
		btnStudentLogin.setBackground(Color.WHITE);
		btnStudentLogin.setFont(new Font("Arial", Font.PLAIN, 15));
		frame.getContentPane().add(btnStudentLogin);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/ves.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon (img));
		lblNewLabel_1.setBounds(31, 11, 124, 189);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 656, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
