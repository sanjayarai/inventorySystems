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
import javax.swing.border.EtchedBorder;

import inventorySystems.Db.DB;
import inventorySystems.model.Cashier;
import inventorySystems.service.CashierService;
import inventorySystems.service.CashierServiceImpl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class UserLoginForm extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	private JPanel panel_1_1;
	private JTextField emailFld;
	private JPasswordField passwordFld;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JButton btnNewButton;
	private JButton btnLogin;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLoginForm frame = new UserLoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserLoginForm() {
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(10, 11, 940, 517);
			panel.setLayout(null);
			panel.add(getPanel_2());
			panel.add(getLblNewLabel());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setForeground(new Color(248, 248, 255));
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\yakha\\Desktop\\bg.jpg"));
			lblNewLabel.setBounds(10, 11, 920, 495);
		}
		return lblNewLabel;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
			panel_2.setBounds(288, 51, 350, 412);
			panel_2.setLayout(null);
			panel_2.add(getLblNewLabel_1());
			panel_2.add(getPanel_1_1());
			panel_2.add(getEmailFld());
			panel_2.add(getPasswordFld());
			panel_2.add(getLabel_1());
			panel_2.add(getLblNewLabel_2_1());
			panel_2.add(getBtnNewButton());
			panel_2.add(getBtnLogin());
			panel_2.add(getLabel_2());
		}
		return panel_2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Sign in");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel_1.setBounds(30, 36, 137, 48);
		}
		return lblNewLabel_1;
	}
	private JPanel getPanel_1_1() {
		if (panel_1_1 == null) {
			panel_1_1 = new JPanel();
			panel_1_1.setLayout(null);
			panel_1_1.setBackground(new Color(153, 204, 255));
			panel_1_1.setBounds(30, 83, 104, 6);
		}
		return panel_1_1;
	}
	private JTextField getEmailFld() {
		if (emailFld == null) {
			emailFld = new JTextField();
			emailFld.setBounds(147, 122, 175, 39);
			emailFld.setColumns(10);
		}
		return emailFld;
	}
	private JPasswordField getPasswordFld() {
		if (passwordFld == null) {
			passwordFld = new JPasswordField();
			passwordFld.setBounds(147, 200, 175, 39);
		}
		return passwordFld;
	}
	private JLabel getLabel_1() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Username:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_2.setBounds(30, 122, 109, 39);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Password:");
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_2_1.setBounds(30, 200, 107, 39);
		}
		return lblNewLabel_2_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Cancel");
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnNewButton.setBackground(new Color(255, 51, 0));
			btnNewButton.setBounds(70, 270, 109, 39);
		}
		return btnNewButton;
	}
	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Cashier cs = new Cashier();
					CashierService cashierServ = new CashierServiceImpl();
					cs.setEmail(emailFld.getText());
					cs.setPassword(String.valueOf(passwordFld.getPassword()));
					if(cashierServ.loginCashier(cs)) {
						JOptionPane.showMessageDialog(null, "Login success");
						dispose();
						new CashierDashboard().setVisible(true);
						
					}else {
						JOptionPane.showMessageDialog(null, "Login Failed");
					
					}
				}
			});
			btnLogin.setForeground(new Color(255, 255, 255));
			btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnLogin.setBackground(new Color(102, 204, 255));
			btnLogin.setBounds(213, 270, 109, 39);
		}
		return btnLogin;
	}
	private JLabel getLabel_2() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Click here to create a new account");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_3.setBounds(70, 346, 252, 22);
		}
		return lblNewLabel_3;
	}
}
