package inventorySystems.view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.toedter.calendar.JDateChooser;

import inventorySystems.model.User;
import inventorySystems.service.UserService;
import inventorySystems.service.UserServiceImpl;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField firstnameFld;
	private JTextField lastnameFld;
	private JTextField usernameFld;
	private JPasswordField passwordFld;
	private JPasswordField retypepassFld;
	private JTextArea addressFld;
	private JButton btnNewButton;
	private JButton btnRegister;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_4;
	private JLabel lblNewLabel_1_5;
	private JLabel lblNewLabel_1_6;
	private JLabel lblNewLabel_1_7;
	private JDateChooser birthdateFld;
	private JLabel fnameErr;
	private JLabel lnameErr;
	private JLabel unameErr;
	private JLabel passErr;
	private JLabel repassErr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void validateFields(JTextField field,JLabel label, String name) {
		if(field.getText().length() >0) {
			label.setText("Invlaid"+name);
		}
		
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setTitle("Register Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(10, 11, 950, 558);
			panel.setLayout(null);
			panel.add(getLblNewLabel_1_7());
			panel.add(getLblNewLabel_1_6());
			panel.add(getAddressFld());
			panel.add(getLblNewLabel_1());
			panel.add(getPanel_1());
			panel.add(getFirstnameFld());
			panel.add(getLastnameFld());
			panel.add(getUsernameFld());
			panel.add(getPasswordFld());
			panel.add(getRetypepassFld());
			panel.add(getBtnNewButton());
			panel.add(getBtnRegister());
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_1_2());
			panel.add(getLblNewLabel_1_3());
			panel.add(getLblNewLabel_1_4());
			panel.add(getLblNewLabel_1_5());
			panel.add(getBirthdateFld());
			panel.add(getFnameErr());
			panel.add(getLblNewLabel());
			panel.add(getLnameErr());
			panel.add(getUnameErr());
			panel.add(getPassErr());
			panel.add(getRepassErr());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setForeground(new Color(248, 248, 255));
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\yakha\\Desktop\\bg.jpg"));
			lblNewLabel.setBounds(10, 11, 940, 536);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("First Name:");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_1.setBounds(89, 86, 94, 26);
		}
		return lblNewLabel_1;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(102, 204, 255));
			panel_1.setBounds(10, 11, 940, 57);
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel_1_1());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Register");
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel_1_1.setBounds(76, 11, 152, 35);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getFirstnameFld() {
		if (firstnameFld == null) {
			firstnameFld = new JTextField();
			firstnameFld.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
							String PATTERN = "^[a-zA-z]{3,10}";
							Pattern patt = Pattern.compile(PATTERN);
							Matcher match = patt.matcher(firstnameFld.getText());
								if(!match.matches()) {
									fnameErr.setText("Invalid ");
								}else {
									fnameErr.setText(null);
								}
				}
			});
			firstnameFld.setBounds(229, 84, 267, 34);
			firstnameFld.setColumns(10);
		}
		return firstnameFld;
	}
	private JTextField getLastnameFld() {
		if (lastnameFld == null) {
			lastnameFld = new JTextField();
			lastnameFld.setColumns(10);
			lastnameFld.setBounds(229, 129, 267, 34);
		}
		return lastnameFld;
	}
	private JTextField getUsernameFld() {
		if (usernameFld == null) {
			usernameFld = new JTextField();
			usernameFld.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String PATTERN = "^(.+)@(.+)$";
					Pattern patt = Pattern.compile(PATTERN);
					Matcher match = patt.matcher(firstnameFld.getText());
						if(!match.matches()) {
							unameErr.setText("Invalid username ");
						}else {
							unameErr.setText(null);
						}
				}
			});
			usernameFld.setColumns(10);
			usernameFld.setBounds(229, 174, 267, 34);
		}
		return usernameFld;
	}
	private JPasswordField getPasswordFld() {
		if (passwordFld == null) {
			passwordFld = new JPasswordField();
			passwordFld.setBounds(229, 219, 267, 34);
		}
		return passwordFld;
	}
	private JPasswordField getRetypepassFld() {
		if (retypepassFld == null) {
			retypepassFld = new JPasswordField();
			retypepassFld.setBounds(229, 262, 267, 34);
		}
		return retypepassFld;
	}
	private JTextArea getAddressFld() {
		if (addressFld == null) {
			addressFld = new JTextArea();
			addressFld.setBounds(229, 352, 325, 70);
		}
		return addressFld;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Cancel");
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(255, 0, 51));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton.setBounds(214, 433, 106, 34);
		}
		return btnNewButton;
	}
	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("Register");
			btnRegister.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
				}
			});
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					User us = new User(); 
					us.setFirstname(firstnameFld.getText());
					us.setLastname(lastnameFld.getText());
					us.setUsername(usernameFld.getText());
					if(!passwordFld.getText().equals(retypepassFld.getText())) {
						JOptionPane.showMessageDialog(passwordFld, "Password do not match please enter correct password");
					}else {
					us.setPassword(String.valueOf(passwordFld.getPassword()));
					}
					us.setBirthdate(birthdateFld.getDate());
					us.setAddress(addressFld.getText());
					UserService usr = new UserServiceImpl();
					if(usr.addUser(us)) {
						JOptionPane.showMessageDialog(null, "User Added successfully!!");
						dispose();
						new MainBillLogin().setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "Failed");
					}
					
					
					
				}
			});
			btnRegister.setForeground(Color.WHITE);
			btnRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnRegister.setBackground(new Color(102, 204, 255));
			btnRegister.setBounds(352, 433, 133, 34);
		}
		return btnRegister;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Click here to login");
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_2.setBounds(269, 490, 148, 26);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Last Name:");
			lblNewLabel_1_2.setForeground(Color.WHITE);
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_1_2.setBounds(89, 139, 94, 26);
		}
		return lblNewLabel_1_2;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Username:");
			lblNewLabel_1_3.setForeground(Color.WHITE);
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_1_3.setBounds(89, 184, 94, 26);
		}
		return lblNewLabel_1_3;
	}
	private JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("Password:");
			lblNewLabel_1_4.setForeground(Color.WHITE);
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_1_4.setBounds(89, 229, 94, 26);
		}
		return lblNewLabel_1_4;
	}
	private JLabel getLblNewLabel_1_5() {
		if (lblNewLabel_1_5 == null) {
			lblNewLabel_1_5 = new JLabel("Retype pass:");
			lblNewLabel_1_5.setForeground(Color.WHITE);
			lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_1_5.setBounds(89, 262, 106, 26);
		}
		return lblNewLabel_1_5;
	}
	private JLabel getLblNewLabel_1_6() {
		if (lblNewLabel_1_6 == null) {
			lblNewLabel_1_6 = new JLabel("BirthDate:");
			lblNewLabel_1_6.setForeground(Color.WHITE);
			lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_1_6.setBounds(89, 307, 94, 26);
		}
		return lblNewLabel_1_6;
	}
	private JLabel getLblNewLabel_1_7() {
		if (lblNewLabel_1_7 == null) {
			lblNewLabel_1_7 = new JLabel("Address:");
			lblNewLabel_1_7.setForeground(Color.WHITE);
			lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_1_7.setBounds(89, 357, 94, 26);
		}
		return lblNewLabel_1_7;
	}
	private JDateChooser getBirthdateFld() {
		if (birthdateFld == null) {
			birthdateFld = new JDateChooser();
			birthdateFld.setBounds(229, 307, 267, 34);
		}
		return birthdateFld;
	}
	private JLabel getFnameErr() {
		if (fnameErr == null) {
			fnameErr = new JLabel("");
			fnameErr.setForeground(Color.RED);
			fnameErr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			fnameErr.setBounds(507, 86, 185, 32);
		}
		return fnameErr;
	}
	private JLabel getLnameErr() {
		if (lnameErr == null) {
			lnameErr = new JLabel("");
			lnameErr.setForeground(Color.RED);
			lnameErr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			lnameErr.setBounds(506, 131, 185, 32);
		}
		return lnameErr;
	}
	private JLabel getUnameErr() {
		if (unameErr == null) {
			unameErr = new JLabel("");
			unameErr.setForeground(Color.RED);
			unameErr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			unameErr.setBounds(506, 176, 185, 32);
		}
		return unameErr;
	}
	private JLabel getPassErr() {
		if (passErr == null) {
			passErr = new JLabel("");
			passErr.setForeground(Color.RED);
			passErr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			passErr.setBounds(506, 219, 185, 32);
		}
		return passErr;
	}
	private JLabel getRepassErr() {
		if (repassErr == null) {
			repassErr = new JLabel("");
			repassErr.setForeground(Color.RED);
			repassErr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			repassErr.setBounds(507, 262, 185, 32);
		}
		return repassErr;
	}
}
