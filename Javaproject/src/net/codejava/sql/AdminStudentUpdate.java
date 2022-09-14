package net.codejava.sql;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class AdminStudentUpdate {

	JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField;
	private JButton btnOkay_1;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminStudentUpdate window = new AdminStudentUpdate();
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
	public AdminStudentUpdate() {
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
				
				final JCheckBox chckbxStudentName = new JCheckBox("Student Name");
				chckbxStudentName.setBounds(187, 94, 97, 23);
				frame.getContentPane().add(chckbxStudentName);
				
				final JCheckBox chckbxGender = new JCheckBox("Gender");
				chckbxGender.setBounds(342, 94, 97, 23);
				frame.getContentPane().add(chckbxGender);
				
				final JCheckBox chckbxClass = new JCheckBox("Class");
				chckbxClass.setBounds(38, 120, 97, 23);
				frame.getContentPane().add(chckbxClass);
				
				final JCheckBox chckbxSemester = new JCheckBox("Semester");
				chckbxSemester.setBounds(187, 120, 97, 23);
				frame.getContentPane().add(chckbxSemester);
				
				final JCheckBox chckbxBranch = new JCheckBox("Branch");
				chckbxBranch.setBounds(342, 120, 97, 23);
				frame.getContentPane().add(chckbxBranch);
				
				final JCheckBox chckbxCourse = new JCheckBox("Course");
				chckbxCourse.setBounds(38, 88, 97, 23);
				frame.getContentPane().add(chckbxCourse);
				
				final JLabel lblEnterStudentName = new JLabel("Enter Student Name :-");
				lblEnterStudentName.setFont(new Font("Calibri", Font.PLAIN, 15));
				lblEnterStudentName.setBounds(10, 176, 144, 33);
				frame.getContentPane().add(lblEnterStudentName);
				lblEnterStudentName.setVisible(false);
				
				final JLabel lblEnterStudentId_1 = new JLabel("Enter Student Gender :-");
				lblEnterStudentId_1.setFont(new Font("Calibri", Font.PLAIN, 15));
				lblEnterStudentId_1.setBounds(10, 215, 164, 33);
				frame.getContentPane().add(lblEnterStudentId_1);
				lblEnterStudentId_1.setVisible(false);
				
				final JLabel lblNewLabel_3 = new JLabel("Enter Student Class :-");
				lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 15));
				lblNewLabel_3.setBounds(319, 176, 144, 33);
				frame.getContentPane().add(lblNewLabel_3);
				lblNewLabel_3.setVisible(false);
				
				final JLabel lblNewLabel_4 = new JLabel("Enter Student Sem:-");
				lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 15));
				lblNewLabel_4.setBounds(319, 215, 144, 33);
				frame.getContentPane().add(lblNewLabel_4);
				lblNewLabel_4.setVisible(false);
				
				final JLabel lblNewLabel_5 = new JLabel("EnterStudent Branch:-");
				lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 15));
				lblNewLabel_5.setBounds(319, 250, 144, 33);
				frame.getContentPane().add(lblNewLabel_5);
				lblNewLabel_5.setVisible(false);
				
				final JLabel lblNewLabel_6 = new JLabel("Enter Student Course :-");
				lblNewLabel_6.setFont(new Font("Calibri", Font.PLAIN, 15));
				lblNewLabel_6.setBounds(10, 250, 144, 33);
				frame.getContentPane().add(lblNewLabel_6);
				
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
				
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(451, 180, 174, 20);
				frame.getContentPane().add(textField_3);
				textField_3.setVisible(false);
				
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(451, 219, 174, 20);
				frame.getContentPane().add(textField_4);
				textField_4.setVisible(false);
				
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(461, 254, 174, 20);
				frame.getContentPane().add(textField_5);
				textField_5.setVisible(false);
				
				textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(155, 259, 174, 20);
				frame.getContentPane().add(textField_6);
				textField_6.setVisible(false);
				lblNewLabel_6.setVisible(false);
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
		btnOkay_1 = new JButton("Okay");
		btnOkay_1.setBounds(254, 291, 89, 23);
		frame.getContentPane().add(btnOkay_1);
		btnOkay_1.setVisible(true);
						if(chckbxStudentName.isSelected())
						{
							lblEnterStudentName .setVisible(true);
							textField_1.setVisible(true);
							
							btnOkay_1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Update  Student set Stud_name = ? where Stud_id = ?;");) {
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
									try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Update  Student set Gender = ? where Stud_id = ?;");) {
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
						if(chckbxClass.isSelected())
						{
							lblNewLabel_3.setVisible(true);
							textField_3 .setVisible(true);
							
							btnOkay_1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Update  Student set Class = ? where Stud_id = ?;");) {
							        	st.setString(1,textField_3.getText());
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
									try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Update  Student set Sem = ? where Stud_id = ?;");) {
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
									try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Update  Student set Branch = ? where Stud_id = ?;");) {
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
						if(chckbxCourse.isSelected())
						{
							lblNewLabel_6.setVisible(true);
							textField_6.setVisible(true);
							
							btnOkay_1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									try (Connection con = DriverManager.getConnection(connectionUrl); PreparedStatement st = (PreparedStatement) con.prepareStatement("Update  Student set Course_id = ? where Stud_id = ?;");) {
							        	st.setString(1,textField_6 .getText());
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
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminDashboardStudent window = new AdminDashboardStudent();
				window.frame.setVisible(true);
			}
		});
		btnBack.setBounds(524, 16, 89, 23);
		frame.getContentPane().add(btnBack);
		
		
		
		
		
	}
}
