package inventorySystems.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import inventorySystems.Db.DB;
import inventorySystems.model.Bill;

public class BillServiceImpl implements BillService{
	Connection conn=null;
	public BillServiceImpl() {
		conn = DB.createConnection();
	}
	@Override
	public boolean addBill(Bill bi) {
		String sql ="INSERT INTO bill (bill_no, customer_name, product_id, name, mrp, quantity, discount) VALUES (?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, bi.getBill_no());
			pstm.setString(2, bi.getCustomer_name());
			pstm.setInt(3, bi.getProduct_id());
			pstm.setString(4, bi.getName());
			pstm.setInt(5, bi.getMrp());
			pstm.setInt(6, bi.getQuantity());
			pstm.setInt(7, bi.getDiscount());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteBill(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBill(Bill bi) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Bill> getAllBill() {
		List<Bill> billList = new ArrayList();
		String sql = "SELECT * FROM bill";
		try {
			Bill bi = new Bill();
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				bi.setBill_no(rs.getInt("bill_no"));
				bi.setCustomer_name(rs.getString("customer_name"));
				bi.setProduct_id(rs.getInt("product_id"));
				bi.setName(rs.getString("name"));
				bi.setMrp(rs.getInt("mrp"));
				bi.setQuantity(rs.getInt("quantity"));
				bi.setDiscount(rs.getInt("discount"));
				billList.add(bi);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return billList;
	}

	@Override
	public Bill getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
