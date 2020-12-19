package inventorySystems.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CashierDashboard extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_4;
	private JLabel lblNewLabel_1_4_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierDashboard frame = new CashierDashboard();
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
	public CashierDashboard() {
		setTitle("Cashier Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getLblNewLabel());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\yakha\\Desktop\\bg.jpg"));
			lblNewLabel.setBounds(10, 11, 851, 541);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Quick Bill");
			lblNewLabel_1.setBorder(new CompoundBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)), null));
			lblNewLabel_1.setBounds(10, 11, 157, 50);
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			ImageIcon icon = new ImageIcon("C:\\Users\\yakha\\Downloads\\bg (1).png");
			Image scaleImage = icon.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(scaleImage));
		}
		return lblNewLabel_1;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 250, 205));
			panel.setBounds(10, 11, 851, 72);
			panel.setLayout(null);
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_1_2());
			panel.add(getLblNewLabel_1_3());
			panel.add(getLblNewLabel_1_4());
			panel.add(getLblNewLabel_1_4_1());
			panel.add(getBtnNewButton());
		}
		return panel;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Transaction");
			ImageIcon icon = new ImageIcon("C:\\\\Users\\\\yakha\\\\Desktop\\\\ImageJavaswing\\\\transaction.png");
			Image scaleImage = icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			lblNewLabel_1_2.setIcon(new ImageIcon(scaleImage));
			lblNewLabel_1_2.setBackground(new Color(240, 240, 240));
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(321, 11, 136, 50);
		}
		return lblNewLabel_1_2;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Stock");
			ImageIcon icon = new ImageIcon("C:\\Users\\yakha\\Desktop\\ImageJavaswing\\stock.png");
			Image scaleImage = icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
			lblNewLabel_1_3.setIcon(new ImageIcon(scaleImage));
			lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_3.setBounds(485, 12, 121, 50);
		}
		return lblNewLabel_1_3;
	}
	private JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("Sales");
			lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_4.setBounds(632, 11, 55, 50);
		}
		return lblNewLabel_1_4;
	}
	private JLabel getLblNewLabel_1_4_1() {
		if (lblNewLabel_1_4_1 == null) {
			lblNewLabel_1_4_1 = new JLabel("");
			ImageIcon icon = new ImageIcon("C:\\\\Users\\\\yakha\\\\Desktop\\\\ImageJavaswing\\\\exit.png");
			Image scaleImage = icon.getImage().getScaledInstance(30, 35, Image.SCALE_DEFAULT);
			lblNewLabel_1_4_1.setIcon(new ImageIcon(scaleImage));
			lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_4_1.setBounds(798, 11, 43, 50);
		}
		return lblNewLabel_1_4_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Cashier");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new CashierForm().setVisible(true);
				}
			});
			ImageIcon icon = new ImageIcon("C:\\\\Users\\\\yakha\\\\Desktop\\\\ImageJavaswing\\\\cashier.png");
			Image scaleImage = icon.getImage().getScaledInstance(30, 35, Image.SCALE_DEFAULT);
			btnNewButton.setIcon(new ImageIcon(scaleImage));
			btnNewButton.setBorder(null);
			btnNewButton.setBackground(new Color(255, 250, 205));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton.setBounds(189, 11, 111, 50);
		}
		return btnNewButton;
	}
}
