package inventorySystems.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import inventorySystems.Db.DB;
import inventorySystems.model.Cashier;
import inventorySystems.view.Dashboard;

public class CashierServiceImpl implements CashierService {
	Connection conn = null;
	public CashierServiceImpl() {
		conn = DB.createConnection();
	}
	@Override
	public boolean addCashier(Cashier ca) {
		String sql = "INSERT INTO cashier (cashiername,mobilenumber,address,email,password) VALUES (?,?,?,?,?)";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, ca.getCashiername());
			pstm.setString(2, ca.getMobilenumber());
			pstm.setString(3, ca.getAddress());
			pstm.setString(4, ca.getEmail());
			pstm.setString(5, ca.getPassword());
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteCashier(int id) {
		String sql = "DELETE FROM cashier where id="+id;
		try {
			Statement stm = conn.createStatement();
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean updateCashier(Cashier ca) {
		String sql ="UPDATE cashier SET cashiername=?, mobilenumber=?, address=?, email=?, password=? WHERE id=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, ca.getCashiername());
			pstm.setString(2, ca.getMobilenumber());
			pstm.setString(3, ca.getAddress());
			pstm.setString(4, ca.getEmail());
			pstm.setString(5, ca.getPassword());
			pstm.setInt(6, ca.getId());
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}


	

	@Override
	public Cashier getById(int id) {
		Cashier cs = new Cashier();
		String sql ="SELECT * FROM cashier WHERE id ="+id;
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				cs.setId(rs.getInt("id"));
				cs.setCashiername(rs.getString("cashiername"));
				cs.setMobilenumber(rs.getString("mobilenumber"));
				cs.setAddress(rs.getString("address"));
				cs.setEmail(rs.getString("email"));
				cs.setPassword(rs.getString("password"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cs;
	}
	@Override
	public List<Cashier> getAllCashier() {
		List<Cashier> csList = new ArrayList<>();
		String sql = "SELECT * FROM cashier";
		Statement stm;
		try {
			stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				Cashier cs = new Cashier();
				cs.setId(rs.getInt("id"));
				cs.setCashiername(rs.getString("cashiername"));
				cs.setMobilenumber(rs.getString("mobilenumber"));
				cs.setAddress(rs.getString("address"));
				cs.setEmail(rs.getString("email"));
				cs.setPassword(rs.getString("password"));
				csList.add(cs);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return csList;
	}
	@Override
	public boolean loginCashier(Cashier ca) {
		Connection conn= DB.createConnection();
		String sql ="SELECT * FROM `cashier` WHERE `email`=? AND `password`=?";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, ca.getEmail());
			pstm.setString(2, ca.getPassword());
			ResultSet rs = pstm.executeQuery();
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return false;
	}

}
