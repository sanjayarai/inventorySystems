package inventorySystems.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import inventorySystems.model.Cashier;
import inventorySystems.service.CashierService;
import inventorySystems.service.CashierServiceImpl;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditCashierForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField cashiernameFld;
	private JLabel lblNewLabel_1;
	private JTextField mobilenumberFld;
	private JLabel lblNewLabel_1_1;
	private JTextField addressFld;
	private JLabel lblNewLabel_1_2;
	private JTextField emailFld;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_4;
	private JPasswordField passwordFld;
	private JLabel lblNewLabel_2;
	private JButton btnUpdate;
	private JButton btnDelete;
	Cashier cs = new Cashier();
	CashierService cashierServ = new CashierServiceImpl();
	private JLabel csnameErr;
	private JLabel mnumberErr;
	private JLabel csnameErr_1;
	private JLabel csnameErr_2;
	private JLabel passErr;
	int cid =0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditCashierForm frame = new EditCashierForm();
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
	public EditCashierForm() {
		setTitle("Add Cashier");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getMnumberErr());
		contentPane.add(getBtnDelete());
		contentPane.add(getBtnUpdate());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getCashiernameFld());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getMobilenumberFld());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getAddressFld());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getEmailFld());
		contentPane.add(getLblNewLabel_1_3());
		contentPane.add(getLblNewLabel_1_4());
		contentPane.add(getPasswordFld());
		contentPane.add(getCsnameErr());
		contentPane.add(getLblNewLabel());
		contentPane.add(getCsnameErr_1());
		contentPane.add(getCsnameErr_2());
		contentPane.add(getPassErr());
		
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\yakha\\Desktop\\bg.jpg"));
			lblNewLabel.setBounds(10, 11, 863, 542);
		}
		return lblNewLabel;
	}
	private JTextField getCashiernameFld() {
		if (cashiernameFld == null) {
			cashiernameFld = new JTextField();
			cashiernameFld.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String PATTERN ="^[a-zA-Z]{4,10}";
					Pattern patt = Pattern.compile(PATTERN);
					Matcher match = patt.matcher(cashiernameFld.getText());
					if(!match.matches()) {
						csnameErr.setText("Invalid name");
					}else {
						csnameErr.setText(null);
					}
					
				}
			});
			cashiernameFld.setBounds(342, 106, 183, 31);
			cashiernameFld.setColumns(10);
		}
		return cashiernameFld;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Cashier Name:");
			lblNewLabel_1.setForeground(new Color(255, 250, 250));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(221, 104, 111, 31);
		}
		return lblNewLabel_1;
	}
	private JTextField getMobilenumberFld() {
		if (mobilenumberFld == null) {
			mobilenumberFld = new JTextField();
			mobilenumberFld.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String PATTERN = "^[0-9]{0,10}";
					Pattern patt = Pattern.compile(PATTERN);
					Matcher match = patt.matcher(mobilenumberFld.getText());
					if(!match.matches()) {
						mnumberErr.setText("Mobile number should be 10 digit & only number");
					}else {
						mnumberErr.setText(null);
					}
				}
			});
			mobilenumberFld.setColumns(10);
			mobilenumberFld.setBounds(342, 161, 183, 31);
		}
		return mobilenumberFld;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Mobile Number:");
			lblNewLabel_1_1.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_1.setBounds(221, 159, 122, 31);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getAddressFld() {
		if (addressFld == null) {
			addressFld = new JTextField();
			addressFld.setColumns(10);
			addressFld.setBounds(342, 217, 183, 31);
		}
		return addressFld;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Address:");
			lblNewLabel_1_2.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_2.setBounds(221, 215, 94, 31);
		}
		return lblNewLabel_1_2;
	}
	private JTextField getEmailFld() {
		if (emailFld == null) {
			emailFld = new JTextField();
			emailFld.setColumns(10);
			emailFld.setBounds(342, 272, 183, 31);
		}
		return emailFld;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Email-id:");
			lblNewLabel_1_3.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_3.setBounds(221, 270, 94, 31);
		}
		return lblNewLabel_1_3;
	}
	private JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("Password:");
			lblNewLabel_1_4.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_4.setBounds(221, 324, 94, 31);
		}
		return lblNewLabel_1_4;
	}
	private JPasswordField getPasswordFld() {
		if (passwordFld == null) {
			passwordFld = new JPasswordField();
			passwordFld.setBounds(342, 326, 183, 31);
		}
		return passwordFld;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Add Cashier Details");
			lblNewLabel_2.setForeground(new Color(255, 250, 250));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblNewLabel_2.setBounds(258, 48, 259, 45);
		}
		return lblNewLabel_2;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cs.setId(cid);
					cs.setCashiername(cashiernameFld.getText());
					cs.setMobilenumber(mobilenumberFld.getText());
					cs.setAddress(addressFld.getText());
					cs.setEmail(emailFld.getText());
					cs.setPassword(String.valueOf(passwordFld.getText()));
					if(cashierServ.updateCashier(cs)) {
						JOptionPane.showMessageDialog(null,"Updated successfully");
						new CashierForm().setVisible(true);
					}else {
					JOptionPane.showMessageDialog(null, "Failed");
					}
				}
			});
			btnUpdate.setBounds(293, 442, 101, 31);
		}
		return btnUpdate;
	}
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Back");
			btnDelete.setBounds(415, 442, 108, 31);
		}
		return btnDelete;
	}
	private JLabel getCsnameErr() {
		if (csnameErr == null) {
			csnameErr = new JLabel("");
			csnameErr.setForeground(Color.RED);
			csnameErr.setBounds(342, 137, 181, 23);
		}
		return csnameErr;
	}
	private JLabel getMnumberErr() {
		if (mnumberErr == null) {
			mnumberErr = new JLabel("");
			mnumberErr.setFont(new Font("Tw Cen MT", Font.PLAIN, 10));
			mnumberErr.setForeground(Color.RED);
			mnumberErr.setBounds(342, 190, 181, 23);
		}
		return mnumberErr;
	}
	private JLabel getCsnameErr_1() {
		if (csnameErr_1 == null) {
			csnameErr_1 = new JLabel("");
			csnameErr_1.setForeground(Color.RED);
			csnameErr_1.setBounds(342, 245, 181, 23);
		}
		return csnameErr_1;
	}
	private JLabel getCsnameErr_2() {
		if (csnameErr_2 == null) {
			csnameErr_2 = new JLabel("");
			csnameErr_2.setForeground(Color.RED);
			csnameErr_2.setBounds(342, 303, 181, 23);
		}
		return csnameErr_2;
	}
	private JLabel getPassErr() {
		if (passErr == null) {
			passErr = new JLabel("");
			passErr.setForeground(Color.RED);
			passErr.setBounds(342, 360, 181, 23);
		}
		return passErr;
	}
	
	public void setData(int id) {
		cid =id;
		Cashier cs = cashierServ.getById(id);
		cashiernameFld.setText(cs.getCashiername());
		mobilenumberFld.setText(String.valueOf(cs.getMobilenumber()));
		addressFld.setText(cs.getAddress());
		emailFld.setText(cs.getEmail());
		passwordFld.setText(cs.getPassword());
		
		
		
		
	}
}
