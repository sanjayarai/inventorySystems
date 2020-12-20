package inventorySystems.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import inventorySystems.Db.DB;
import inventorySystems.model.Stock;

public class StockServiceImpl implements StockService{
	Connection conn = null;
	public StockServiceImpl() {
		conn= DB.createConnection();
	}
	@Override
	public boolean addStock(Stock st) {
		String sql = "INSERT INTO stock (productName,availableQuantity,addedQuantity,mrp) VALUES (?,?,?,?)";
		PreparedStatement pstm;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, st.getProductName());
			pstm.setInt(2, st.getAvailableQuantity());
			pstm.setInt(3, st.getAddedQuantity());
			pstm.setInt(4, st.getMrp());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean deleteStock(int id) {
		String sql ="DELETE FROM stock WHERE id="+id;
		try {
			Statement stm = conn.createStatement();
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateStock(Stock st) {
		String sql = "UPDATE stock SET productName=?, availableQuantity=?, addedQuantity=?, mrp=? WHERE id=?";
		PreparedStatement pstm;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, st.getProductName());
			pstm.setInt(2, st.getAvailableQuantity());
			pstm.setInt(3, st.getAvailableQuantity());
			pstm.setInt(4, st.getMrp());
			pstm.setInt(5, st.getId());
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public List<Stock> getAllList() {
		List<Stock> stockList = new ArrayList<>();
		String sql ="SELECT * FROM stock";
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				Stock st = new Stock();
				st.setId(rs.getInt("id"));
				st.setProductName(rs.getString("productName"));
				st.setAvailableQuantity(rs.getInt("availableQuantity"));
				st.setAddedQuantity(rs.getInt("addedQuantity"));
				st.setMrp(rs.getInt("mrp"));
				stockList.add(st);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return stockList;
	}

	@Override
	public Stock getById(int id) {
		Stock st = new Stock();
		String sql = "SELECT * FROM stock WHERE id="+id;
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				st.setId(rs.getInt("id"));
				st.setProductName(rs.getString("productName"));
				st.setAvailableQuantity(rs.getInt("availableQuantity"));
				st.setAddedQuantity(rs.getInt("addedQuantity"));
				st.setMrp(rs.getInt("mrp"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return st;
	}
	@Override
	public List<Stock> search(String input) {
		List<Stock> stockList = new ArrayList<>();
		String sql ="SELECT * FROM stock WHERE productName like '%"+input+"%' OR mrp like '%"+input+"%' ";
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				Stock st = new Stock();
				st.setId(rs.getInt("id"));
				st.setProductName(rs.getString("productName"));
				st.setAvailableQuantity(rs.getInt("availableQuantity"));
				st.setAddedQuantity(rs.getInt("addedQuantity"));
				st.setMrp(rs.getInt("mrp"));
				stockList.add(st);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return stockList;
	}
	

}
