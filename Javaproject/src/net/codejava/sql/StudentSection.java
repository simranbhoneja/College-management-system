package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class StudentSection {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSection window = new StudentSection();
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
	public StudentSection() {
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
		
		JLabel lblStudentSection = new JLabel("Student Section");
		lblStudentSection.setFont(new Font("Calibri", Font.BOLD, 30));
		lblStudentSection.setBounds(114, 11, 201, 41);
		frame.getContentPane().add(lblStudentSection);
		
		JButton btnViewCourseDetails = new JButton("View Course Details");
		btnViewCourseDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StudentCourseDetails window = new StudentCourseDetails();
				window.frame.setVisible(true);
			}
		});
		btnViewCourseDetails.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnViewCourseDetails.setBounds(28, 63, 166, 43);
		frame.getContentPane().add(btnViewCourseDetails);
		
		JButton btnViewSubjectDetails = new JButton("View Subject Details");
		btnViewSubjectDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StudentSubjectDetails window = new StudentSubjectDetails();
				window.frame.setVisible(true);
			}
		});
		btnViewSubjectDetails.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnViewSubjectDetails.setBounds(28, 124, 166, 43);
		frame.getContentPane().add(btnViewSubjectDetails);
		
		JButton btnViewExamDetails = new JButton("View Exam Details");
		btnViewExamDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StudentExamDetails window = new StudentExamDetails();
				window.frame.setVisible(true);
			}
		});
		btnViewExamDetails.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnViewExamDetails.setBounds(234, 57, 166, 43);
		frame.getContentPane().add(btnViewExamDetails);
		
		JButton btnViewSubjectDetails_1 = new JButton("View Result");
		btnViewSubjectDetails_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StudentResultDetails window = new StudentResultDetails();
				window.frame.setVisible(true);
			}
		});
		btnViewSubjectDetails_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnViewSubjectDetails_1.setBounds(234, 124, 166, 43);
		frame.getContentPane().add(btnViewSubjectDetails_1);
		
		JButton btnViewSubjectDetails_1_1 = new JButton("Logout");
		btnViewSubjectDetails_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Miniproject window = new Miniproject();
				window.frame.setVisible(true);
			}
		});
		btnViewSubjectDetails_1_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		btnViewSubjectDetails_1_1.setBounds(125, 188, 166, 43);
		frame.getContentPane().add(btnViewSubjectDetails_1_1);
	}

}
