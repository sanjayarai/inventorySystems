package inventorySystems.view;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import inventorySystems.model.Stock;
import inventorySystems.service.StockService;
import inventorySystems.service.StockServiceImpl;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ProductInformation extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTable table;
	StockService stockServ = new StockServiceImpl();
	private JLabel lblNewLabel_1;
	private JTextField searchFld;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductInformation frame = new ProductInformation();
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
	public ProductInformation() {
		setTitle("ProductInformation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getSearchFld());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel());
		productInformation();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\yakha\\Desktop\\bg.jpg"));
			lblNewLabel.setBounds(20, 11, 837, 535);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(30, 77, 815, 447);
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
					"ID", "Product Name", "Available", "Mrp"
				}
			));
		}
		return table;
	}
	public void productInformation() {
		List<Stock> stockList =stockServ.getAllList();
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for(Stock list: stockList) {
			model.addRow(new Object[] { list.getId(), list.getProductName(), list.getAvailableQuantity(), list.getMrp()});
		}
		
	}
	
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Search");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_1.setBounds(491, 33, 85, 33);
		}
		return lblNewLabel_1;
	}
	private JTextField getSearchFld() {
		if (searchFld == null) {
			searchFld = new JTextField();
			searchFld.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String input = searchFld.getText().trim();
					List<Stock> stockList = stockServ.search(input);
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.setRowCount(0);
					for(Stock st: stockList) {
						model.addRow(new Object[] {st.getId(), st.getProductName(), st.getAvailableQuantity(), st.getMrp()});
					}
					
				}
			});
			searchFld.setBounds(603, 33, 232, 35);
			searchFld.setColumns(10);
		}
		return searchFld;
	}
}
