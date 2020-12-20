package inventorySystems.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import inventorySystems.model.Stock;
import inventorySystems.service.StockService;
import inventorySystems.service.StockServiceImpl;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class BillForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_4;
	private JLabel lblNewLabel_1_5;
	private JLabel lblNewLabel_1_6;
	private JTextField billnoFld;
	private JTextField customernameFld;
	private JComboBox productidCombo;
	private JTextField nameFld;
	private JTextField mrpFld;
	private JTextField quantityFld;
	private JTextField discountFld;
	private JButton btnNewButton;
	private JButton btnRemove;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel_2;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillForm frame = new BillForm();
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
	public BillForm() {
		setTitle("New Bill");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 925, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnBack());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnRemove());
		contentPane.add(getBtnNewButton());
		contentPane.add(getDiscountFld());
		contentPane.add(getQuantityFld());
		contentPane.add(getMrpFld());
		contentPane.add(getNameFld());
		contentPane.add(getProductidCombo());
		contentPane.add(getCustomernameFld());
		contentPane.add(getBillnoFld());
		contentPane.add(getLblNewLabel_1_6());
		contentPane.add(getLblNewLabel_1_5());
		contentPane.add(getLblNewLabel_1_4());
		contentPane.add(getLblNewLabel_1_3());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\yakha\\Desktop\\ImageJavaswing\\bg.jpg"));
			lblNewLabel.setBounds(10, 0, 893, 576);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Bill No");
			lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setBounds(38, 86, 106, 34);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Customer Name");
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
			lblNewLabel_1_1.setBounds(38, 130, 146, 34);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Product ID");
			lblNewLabel_1_2.setForeground(Color.WHITE);
			lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 18));
			lblNewLabel_1_2.setBounds(38, 175, 106, 34);
		}
		return lblNewLabel_1_2;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Name");
			lblNewLabel_1_3.setForeground(Color.WHITE);
			lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 18));
			lblNewLabel_1_3.setBounds(38, 220, 106, 34);
		}
		return lblNewLabel_1_3;
	}
	private JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("Mrp");
			lblNewLabel_1_4.setForeground(Color.WHITE);
			lblNewLabel_1_4.setFont(new Font("Dialog", Font.BOLD, 18));
			lblNewLabel_1_4.setBounds(38, 273, 106, 34);
		}
		return lblNewLabel_1_4;
	}
	private JLabel getLblNewLabel_1_5() {
		if (lblNewLabel_1_5 == null) {
			lblNewLabel_1_5 = new JLabel("Quantity");
			lblNewLabel_1_5.setForeground(Color.WHITE);
			lblNewLabel_1_5.setFont(new Font("Dialog", Font.BOLD, 18));
			lblNewLabel_1_5.setBounds(38, 318, 106, 34);
		}
		return lblNewLabel_1_5;
	}
	private JLabel getLblNewLabel_1_6() {
		if (lblNewLabel_1_6 == null) {
			lblNewLabel_1_6 = new JLabel("Discount");
			lblNewLabel_1_6.setForeground(Color.WHITE);
			lblNewLabel_1_6.setFont(new Font("Dialog", Font.BOLD, 18));
			lblNewLabel_1_6.setBounds(38, 363, 106, 34);
		}
		return lblNewLabel_1_6;
	}
	private JTextField getBillnoFld() {
		if (billnoFld == null) {
			billnoFld = new JTextField();
			billnoFld.setBounds(194, 86, 218, 34);
			billnoFld.setColumns(10);
		}
		return billnoFld;
	}
	private JTextField getCustomernameFld() {
		if (customernameFld == null) {
			customernameFld = new JTextField();
			customernameFld.setColumns(10);
			customernameFld.setBounds(194, 130, 218, 34);
		}
		return customernameFld;
	}
	private JComboBox getProductidCombo() {
		if (productidCombo == null) {
			productidCombo = new JComboBox();
			productidCombo.setFont(new Font("Tahoma", Font.PLAIN, 16));
			
			StockService stockServ = new StockServiceImpl();
			List<Stock> stockList= stockServ.getAllList();
			for(Stock st: stockList) {
			productidCombo.addItem( st.getId());
			}
			productidCombo.setBounds(194, 175, 218, 34);
		}
		return productidCombo;
	}
	private JTextField getNameFld() {
		if (nameFld == null) {
			nameFld = new JTextField();
			nameFld.setColumns(10);
			nameFld.setBounds(194, 220, 218, 34);
		}
		return nameFld;
	}
	private JTextField getMrpFld() {
		if (mrpFld == null) {
			mrpFld = new JTextField();
			mrpFld.setColumns(10);
			mrpFld.setBounds(194, 265, 218, 34);
		}
		return mrpFld;
	}
	private JTextField getQuantityFld() {
		if (quantityFld == null) {
			quantityFld = new JTextField();
			quantityFld.setColumns(10);
			quantityFld.setBounds(194, 313, 218, 34);
		}
		return quantityFld;
	}
	private JTextField getDiscountFld() {
		if (discountFld == null) {
			discountFld = new JTextField();
			discountFld.setColumns(10);
			discountFld.setBounds(194, 358, 218, 34);
		}
		return discountFld;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnNewButton.setBounds(177, 448, 106, 44);
		}
		return btnNewButton;
	}
	private JButton getBtnRemove() {
		if (btnRemove == null) {
			btnRemove = new JButton("Remove");
			btnRemove.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnRemove.setBounds(306, 448, 106, 44);
		}
		return btnRemove;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(422, 86, 469, 476);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Quantity", "Name", "Mrp", "Price"
				}
			));
		}
		return table;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Date");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setBounds(433, 31, 73, 34);
		}
		return lblNewLabel_2;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Dashboard().setVisible(true);
				}
			});
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnBack.setBounds(54, 448, 106, 44);
		}
		return btnBack;
	}
}
