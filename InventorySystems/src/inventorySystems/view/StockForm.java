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

public class StockForm extends JFrame {

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
	private JButton editBtn;
	private JButton btnDelete;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel mnumberErr;
	private JLabel csnameErr_1;
	private JLabel csnameErr_2;
	private JLabel passErr;
	StockService stockServ = new StockServiceImpl();
	private JTextField mrpFld;
	private JLabel lblNewLabel_1_1_1;
	private JTextField searchFld;
	private JButton btnBack;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StockForm frame = new StockForm();
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
	public StockForm() {
		setTitle("Stock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnBack());
		contentPane.add(getSearchFld());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getMrpFld());
		contentPane.add(getMnumberErr());
		contentPane.add(getScrollPane());
//		contentPane.add(getBtnDelete());
		contentPane.add(getEditBtn());
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
		displayStockData();
		
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
			productnameFld.setBounds(191, 115, 183, 31);
		}
		return productnameFld;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Product Name:");
			lblNewLabel_1_1.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_1.setBounds(70, 113, 122, 31);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getAvailableqtyFld() {
		if (availableqtyFld == null) {
			availableqtyFld = new JTextField();
			availableqtyFld.setColumns(10);
			availableqtyFld.setBounds(191, 171, 183, 31);
		}
		return availableqtyFld;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Available Qty:");
			lblNewLabel_1_2.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_2.setBounds(70, 169, 111, 31);
		}
		return lblNewLabel_1_2;
	}
	private JTextField getAddedqtyFld() {
		if (addedqtyFld == null) {
			addedqtyFld = new JTextField();
			addedqtyFld.setColumns(10);
			addedqtyFld.setBounds(191, 226, 183, 31);
		}
		return addedqtyFld;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Added Qty:");
			lblNewLabel_1_3.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_3.setBounds(70, 224, 94, 31);
		}
		return lblNewLabel_1_3;
	}
	private JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("Mrp:");
			lblNewLabel_1_4.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1_4.setBounds(70, 278, 94, 31);
		}
		return lblNewLabel_1_4;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Add Stock Details");
			lblNewLabel_2.setForeground(new Color(255, 250, 250));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblNewLabel_2.setBounds(102, 35, 259, 45);
		}
		return lblNewLabel_2;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add New");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Stock st = new Stock();
					st.setProductName(productnameFld.getText());
					st.setAvailableQuantity(Integer.parseInt(availableqtyFld.getText()));
					st.setAddedQuantity(Integer.parseInt(addedqtyFld.getText()));
					st.setMrp(Integer.parseInt(mrpFld.getText()));
					
					if(stockServ.addStock(st)) {
						JOptionPane.showMessageDialog(null,"Added successfully");
						displayStockData();
					}else {
					JOptionPane.showMessageDialog(null, "Failed");
					}
				}
			});
			btnNewButton.setBounds(155, 422, 101, 31);
		}
		return btnNewButton;
	}
	private JButton getEditBtn() {
		if (editBtn == null) {
			editBtn = new JButton("Edit");
			editBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow() < 0) {
						JOptionPane.showMessageDialog(null, "Please Select a row you want to edit");
						return;
					}else {
						int row = table.getSelectedRow();
						int id = (int) table.getModel().getValueAt(row, 0);
						EditStockForm ef = new EditStockForm();
						ef.setData(id);
						ef.setVisible(true);
						dispose();
					}
				}
			});
			editBtn.setBounds(273, 422, 101, 31);
		}
		return editBtn;
	}
//	private JButton getBtnDelete() {
//		if (btnDelete == null) {
//			btnDelete = new JButton("Delete");
//			btnDelete.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					if(table.getSelectedRow() < 0 ) {
//						JOptionPane.showMessageDialog(null, "Please Select the date you want to edit");
//						return;
//					}else {
//						int row = table.getSelectedRow();
//						int id = (int) table.getModel().getValueAt(row, 0);
//						if(cashierServ.deleteCashier(id)) {
//							JOptionPane.showMessageDialog(null, "Deleted Successfully");
//							displayCashierData();
//						}
//						else {
//							JOptionPane.showMessageDialog(null, "Failed");
//						}
//					}
//				}
//			});
//			btnDelete.setBounds(259, 429, 108, 31);
//		}
//		return btnDelete;
//	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(392, 69, 474, 478);
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
					"Product_Id", "Product_Name", "Available", "Mrp"
				}
			));
		}
		return table;
	}
	private JLabel getMnumberErr() {
		if (mnumberErr == null) {
			mnumberErr = new JLabel("");
			mnumberErr.setFont(new Font("Tw Cen MT", Font.PLAIN, 10));
			mnumberErr.setForeground(Color.RED);
			mnumberErr.setBounds(191, 144, 181, 23);
		}
		return mnumberErr;
	}
	private JLabel getCsnameErr_1() {
		if (csnameErr_1 == null) {
			csnameErr_1 = new JLabel("");
			csnameErr_1.setForeground(Color.RED);
			csnameErr_1.setBounds(191, 199, 181, 23);
		}
		return csnameErr_1;
	}
	private JLabel getCsnameErr_2() {
		if (csnameErr_2 == null) {
			csnameErr_2 = new JLabel("");
			csnameErr_2.setForeground(Color.RED);
			csnameErr_2.setBounds(191, 257, 181, 23);
		}
		return csnameErr_2;
	}
	private JLabel getPassErr() {
		if (passErr == null) {
			passErr = new JLabel("");
			passErr.setForeground(Color.RED);
			passErr.setBounds(191, 314, 181, 23);
		}
		return passErr;
	}
	private JTextField getMrpFld() {
		if (mrpFld == null) {
			mrpFld = new JTextField();
			mrpFld.setColumns(10);
			mrpFld.setBounds(191, 285, 183, 31);
		}
		return mrpFld;
	}
	public void displayStockData() {
		List<Stock> stockList = stockServ.getAllList();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for(Stock st: stockList) {
			model.addRow(new Object[] { st.getId(), st.getProductName(),st.getAvailableQuantity(),st.getMrp()});
		}
		
		
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Search:");
			lblNewLabel_1_1_1.setForeground(new Color(255, 250, 250));
			lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_1_1_1.setBounds(591, 27, 82, 31);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getSearchFld() {
		if (searchFld == null) {
			searchFld = new JTextField();
			searchFld.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String input = searchFld.getText().trim();
				List<Stock> stockList =	stockServ.search(input);
			DefaultTableModel model	=(DefaultTableModel) table.getModel();
			model.setRowCount(0);
			for(Stock st: stockList) {
				model.addRow(new Object[] { st.getId(), st.getProductName(), st.getAvailableQuantity(), st.getMrp()});
			}
					
				}
			});
			searchFld.setColumns(10);
			searchFld.setBounds(683, 27, 183, 31);
		}
		return searchFld;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new CashierDashboard().setVisible(true);
					dispose();
				}
			});
			btnBack.setBounds(51, 422, 94, 31);
		}
		return btnBack;
	}
}
