package inventorySystems.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainBillLogin extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel cashierloginBtn;
	private JButton adminloginBtn;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1;
	private JButton btnCashierLogin;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainBillLogin frame = new MainBillLogin();
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
	public MainBillLogin() {
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
			panel.add(getAdminloginBtn());
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_1());
			panel.add(getBtnCashierLogin());
			panel.add(getLblNewLabel());
			panel.add(getCashierloginBtn());
		}
		return panel;
	}
	private JLabel getCashierloginBtn() {
		if (cashierloginBtn == null) {
			cashierloginBtn = new JLabel("Cashier Login");
			cashierloginBtn.setFont(new Font("Tahoma", Font.BOLD, 30));
			cashierloginBtn.setForeground(new Color(248, 248, 255));
			cashierloginBtn.setIcon(new ImageIcon("C:\\Users\\yakha\\Desktop\\bg.jpg"));
			cashierloginBtn.setBounds(10, 11, 930, 483);
		}
		return cashierloginBtn;
	}
	private JButton getAdminloginBtn() {
		if (adminloginBtn == null) {
			adminloginBtn = new JButton("Admin Login");
			adminloginBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new AdminLogin().setVisible(true);
					dispose();
				}
			});
			adminloginBtn.setForeground(new Color(0, 0, 0));
			adminloginBtn.setBackground(new Color(255, 255, 255));
			adminloginBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
			adminloginBtn.setBounds(515, 187, 180, 34);
		}
		return adminloginBtn;
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Quick Bills");
			lblNewLabel_2.setForeground(new Color(0, 0, 0));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
			lblNewLabel_2.setBounds(191, 330, 220, 53);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Welcome To Super Market Billing System");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel_1.setForeground(new Color(0, 0, 0));
			lblNewLabel_1.setBounds(115, 31, 631, 53);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnCashierLogin() {
		if (btnCashierLogin == null) {
			btnCashierLogin = new JButton("Cashier Login");
			btnCashierLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new UserLoginForm().setVisible(true);
					dispose();
				}
			});
			btnCashierLogin.setForeground(Color.BLACK);
			btnCashierLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnCashierLogin.setBackground(Color.WHITE);
			btnCashierLogin.setBounds(515, 269, 180, 34);
		}
		return btnCashierLogin;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\yakha\\Downloads\\bg.png"));
			lblNewLabel.setBounds(155, 134, 226, 204);
		}
		return lblNewLabel;
	}
}
