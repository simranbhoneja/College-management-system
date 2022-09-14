package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class AdminTeacherUpdate {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminTeacherUpdate window = new AdminTeacherUpdate();
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
	public AdminTeacherUpdate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 15));
		frame.setBounds(100, 100, 664, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblEnterId = new JLabel("Enter Id:-");
		lblEnterId.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEnterId.setBounds(6, 11, 82, 23);
		frame.getContentPane().add(lblEnterId);
		
		textField = new JTextField();
		textField.setBounds(121, 17, 144, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel lblNewLabel = new JLabel("Choose the details to be updated");
				lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
				lblNewLabel.setBounds(28, 48, 350, 33);
				frame.getContentPane().add(lblNewLabel);
				
				final JCheckBox chckbxProfName = new JCheckBox("Prof Name");
				chckbxProfName.setBounds(187, 94, 97, 23);
				frame.getContentPane().add(chckbxProfName);
				
				final JCheckBox chckbxGender = new JCheckBox("Gender");
				chckbxGender.setBounds(342, 94, 97, 23);
				frame.getContentPane().add(chckbxGender);
				
				
				final JCheckBox chckbxSemester = new JCheckBox("Education");
				chckbxSemester.setBounds(187, 120, 97, 23);
				frame.getContentPane().add(chckbxSemester);
				
				final JCheckBox chckbxBranch = new JCheckBox("Teaching Experience");
				chckbxBranch.setBounds(342, 120, 97, 23);
				frame.getContentPane().add(chckbxBranch);
				
				
				final JLabel lblEnterStudentName = new JLabel("Enter Prof Name :-");
				lblEnterStudentName.setFont(new Font("Calibri", Font.PLAIN, 15));
				lblEnterStudentName.setBounds(10, 176, 144, 33);
				frame.getContentPane().add(lblEnterStudentName);
				lblEnterStudentName.setVisible(false);
				
				final JLabel lblEnterStudentId_1 = new JLabel("Enter Prof Gender :-");
				lblEnterStudentId_1.setFont(new Font("Calibri", Font.PLAIN, 15));
				lblEnterStudentId_1.setBounds(10, 215, 164, 33);
				frame.getContentPane().add(lblEnterStudentId_1);
				lblEnterStudentId_1.setVisible(false);
				
				
				final JLabel lblNewLabel_4 = new JLabel("Enter Prof Education:-");
				lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 15));
				lblNewLabel_4.setBounds(319, 215, 144, 33);
				frame.getContentPane().add(lblNewLabel_4);
				lblNewLabel_4.setVisible(false);
				
				final JLabel lblNewLabel_5 = new JLabel("Enter Prof Teaching Exp :-");
				lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 15));
				lblNewLabel_5.setBounds(319, 250, 144, 33);
				frame.getContentPane().add(lblNewLabel_5);
				lblNewLabel_5.setVisible(false);
				
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(155, 180, 174, 20);
				frame.getContentPane().add(textField_1);
				textField_1.setVisible(false);
				
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(155, 220, 174, 20);
				frame.getContentPane().add(textField_2);
				textField_2.setVisible(false);
				
				
				
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(451, 219, 174, 20);
				frame.getContentPane().add(textField_4);
				textField_4.setVisible(false);
				
				final JTextField textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(461, 254, 174, 20);
				frame.getContentPane().add(textField_5);
				textField_5.setVisible(false);
				
				
				JButton btnNewButton = new JButton("Update");
				btnNewButton.setBounds(230, 148, 89, 23);
				frame.getContentPane().add(btnNewButton);
				
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
		final String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";
						
				        /*try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Insert into Gives values(?,?,?)");) {
				        	st.setString(1,textField.getText());
				        	st.setString(2,textField_1.getText());
				        	st.setString(3,textField_2.getText());
				        int a = st.executeUpdate();
				        }
				        catch (Exception e1) { 
				        	JOptionPane.showMessageDialog(frame, "Error!!Please insert Data");
				   	}*/
		JButton btnOkay_1 = new JButton("Okay");
		btnOkay_1.setBounds(254, 291, 89, 23);
		frame.getContentPane().add(btnOkay_1);
		btnOkay_1.setVisible(true);
						if(chckbxProfName.isSelected())
						{
							lblEnterStudentName .setVisible(true);
							textField_1.setVisible(true);
							
							btnOkay_1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Update  Teacher set Prof_name = ? where Prof_id = ?;");) {
							        	st.setString(1,textField_1.getText());
							        	st.setString(2,textField.getText());
							        	
							        int a = st.executeUpdate();
							        if(a == 1)
							        {
							        	JOptionPane.showMessageDialog(frame,"Updated Successfully");
							        }
							        }
							        catch (Exception e1) { 
							        	JOptionPane.showMessageDialog(frame, "Error!!Please insert Data");
							   	}
								}
							});
							
							
						}
						if(chckbxGender.isSelected())
						{
							lblEnterStudentId_1.setVisible(true);
							textField_2.setVisible(true);
							
							btnOkay_1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Update Teacher set Gender = ? where Prof_id = ?;");) {
							        	st.setString(1,textField_2 .getText());
							        	st.setString(2,textField.getText());
							        	
							        int a = st.executeUpdate();
							        if(a == 1)
							        {
							        	JOptionPane.showMessageDialog(frame,"Updated Successfully");
							        }
							        }
							        catch (Exception e1) { 
							        	JOptionPane.showMessageDialog(frame, "Error!!Please insert Data");
							   	}
								}
							});
							
							
						}
						
						if(chckbxSemester.isSelected())
						{
							lblNewLabel_4.setVisible(true);
							textField_4.setVisible(true);
							
							btnOkay_1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Update  Teacher set Education = ? where Prof_id = ?;");) {
							        	st.setString(1,textField_4 .getText());
							        	st.setString(2,textField.getText());
							        	
							        int a = st.executeUpdate();
							        if(a == 1)
							        {
							        	JOptionPane.showMessageDialog(frame,"Updated Successfully");
							        }
							        }
							        catch (Exception e1) { 
							        	JOptionPane.showMessageDialog(frame, "Error!!Please insert Data");
							   	}
								}
							});
							
							
						}
						if(chckbxBranch.isSelected())
						{
							lblNewLabel_5.setVisible(true);
							textField_5.setVisible(true);
							
							btnOkay_1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Update  Teacher set Teaching_exp = ? where Prof_id = ?;");) {
							        	st.setString(1,textField_5 .getText());
							        	st.setString(2,textField.getText());
							        	
							        int a = st.executeUpdate();
							        if(a == 1)
							        {
							        	JOptionPane.showMessageDialog(frame,"Updated Successfully");
							        }
							        }
							        catch (Exception e1) { 
							        	JOptionPane.showMessageDialog(frame, "Error!!Please insert Data");
							   	}
								}
							});
							
							
						}
						
					}
				});
			}
		});
		btnOkay.setBounds(391, 16, 89, 23);
		frame.getContentPane().add(btnOkay);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboardTeacher window = new AdminDashboardTeacher();
				window.frame.setVisible(true);
			}
		});
		btnBack.setBounds(524, 16, 89, 23);
		frame.getContentPane().add(btnBack);
		
		
		
		
		
	}
}
