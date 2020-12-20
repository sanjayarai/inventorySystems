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
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import inventorySystems.model.Stock;
import inventorySystems.service.StockService;
import inventorySystems.service.StockServiceImpl;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EditStockForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField productnameFld;
	private JLabel lblNewLabel_1_1;
	private JTextField availableqtyFld;
	private JLabel lblNewLabel_1_2;
	private JTextField addedqtyFld;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_4;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JLabel mnumberErr;
	private JLabel csnameErr_1;
	private JLabel csnameErr_2;
	private JLabel passErr;
	StockService stockServ = new StockServiceImpl();
	private JTextField mrpFld;
	private JButton btnBack;
	int sid=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditStockForm frame = new EditStockForm();
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
	public EditStockForm() {
		setTitle("Add Cashier");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnBack());
		contentPane.add(getMrpFld());
		contentPane.add(getMnumberErr());
//		contentPane.add(getBtnDelete());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getProductnameFld());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getAvailableqtyFld());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getAddedqtyFld());
		contentPane.add(getLblNewLabel_1_3());
		contentPane.add(getLblNewLabel_1_4());
		contentPane.add(getBtnNewButton());
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
	private JTextField getProductnameFld() {
		if (productnameFld == null) {
			productnameFld = new JTextField();
			productnameFld.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String PATTERN = "^[0-9]{0,10}";
					Pattern patt = Pattern.compile(PATTERN);
					Matcher match = patt.matcher(productnameFld.getText());
					if(!match.matches()) {
						mnumberErr.setText("Mobile number should be 10 digit & only number");
					}else {
						mnumberErr.setText(null);
					}
				}
			});
			productnameFld.setColumns(10);
			productnameFld.setBounds(337, 125, 183, 31);
		}
		return productnameFld;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Product Name:");
			lblNewLabel_1_1.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_1.setBounds(216, 123, 122, 31);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getAvailableqtyFld() {
		if (availableqtyFld == null) {
			availableqtyFld = new JTextField();
			availableqtyFld.setColumns(10);
			availableqtyFld.setBounds(337, 181, 183, 31);
		}
		return availableqtyFld;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Available Qty:");
			lblNewLabel_1_2.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_2.setBounds(216, 179, 111, 31);
		}
		return lblNewLabel_1_2;
	}
	private JTextField getAddedqtyFld() {
		if (addedqtyFld == null) {
			addedqtyFld = new JTextField();
			addedqtyFld.setColumns(10);
			addedqtyFld.setBounds(337, 236, 183, 31);
		}
		return addedqtyFld;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Added Qty:");
			lblNewLabel_1_3.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_3.setBounds(216, 234, 94, 31);
		}
		return lblNewLabel_1_3;
	}
	private JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("Mrp:");
			lblNewLabel_1_4.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_4.setBounds(216, 288, 94, 31);
		}
		return lblNewLabel_1_4;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Add Cashier Details");
			lblNewLabel_2.setForeground(new Color(255, 250, 250));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblNewLabel_2.setBounds(248, 45, 259, 45);
		}
		return lblNewLabel_2;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Update");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Stock st = new Stock();
					st.setId(sid);
					st.setProductName(productnameFld.getText());
					st.setAvailableQuantity(Integer.parseInt(availableqtyFld.getText()));
					st.setAddedQuantity(Integer.parseInt(addedqtyFld.getText()));
					st.setMrp(Integer.parseInt(mrpFld.getText()));
					
					if(stockServ.updateStock(st)) {
						JOptionPane.showMessageDialog(null,"Updated successfully");
						new StockForm().setVisible(true);
						dispose();
					}else {
					JOptionPane.showMessageDialog(null, "Failed");
					}
				}
			});
			btnNewButton.setBounds(301, 358, 101, 31);
		}
		return btnNewButton;
	}
	
	private JLabel getMnumberErr() {
		if (mnumberErr == null) {
			mnumberErr = new JLabel("");
			mnumberErr.setFont(new Font("Tw Cen MT", Font.PLAIN, 10));
			mnumberErr.setForeground(Color.RED);
			mnumberErr.setBounds(337, 154, 181, 23);
		}
		return mnumberErr;
	}
	private JLabel getCsnameErr_1() {
		if (csnameErr_1 == null) {
			csnameErr_1 = new JLabel("");
			csnameErr_1.setForeground(Color.RED);
			csnameErr_1.setBounds(337, 209, 181, 23);
		}
		return csnameErr_1;
	}
	private JLabel getCsnameErr_2() {
		if (csnameErr_2 == null) {
			csnameErr_2 = new JLabel("");
			csnameErr_2.setForeground(Color.RED);
			csnameErr_2.setBounds(337, 267, 181, 23);
		}
		return csnameErr_2;
	}
	private JLabel getPassErr() {
		if (passErr == null) {
			passErr = new JLabel("");
			passErr.setForeground(Color.RED);
			passErr.setBounds(337, 324, 181, 23);
		}
		return passErr;
	}
	private JTextField getMrpFld() {
		if (mrpFld == null) {
			mrpFld = new JTextField();
			mrpFld.setColumns(10);
			mrpFld.setBounds(337, 295, 183, 31);
		}
		return mrpFld;
	}

	public void setData(int id) {
		Stock st = stockServ.getById(id);
		sid=id;
		productnameFld.setText(st.getProductName());
		availableqtyFld.setText(String.valueOf(st.getAvailableQuantity()));
		addedqtyFld.setText(String.valueOf(st.getAddedQuantity()));
		mrpFld.setText(String.valueOf(st.getMrp()));
		
		
		
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.setBounds(424, 358, 101, 31);
		}
		return btnBack;
	}
}
