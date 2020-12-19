package inventorySystems.service;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Db.DB;
import inventorySystems.model.Admin;
import inventorySystems.model.User;

public class UserServiceImpl implements UserService{
	
	Connection conn = null;
	
	public  UserServiceImpl() {
		conn = DB.createConnection();
	}

	@Override
	public boolean addUser(User us) {
	
		String sql = "insert into user (firstname,lastname,username,password,birthdate,address) values (?,?,?,?,?,?)";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, us.getFirstname());
			pstm.setString(2, us.getLastname());
			pstm.setString(3, us.getUsername());
			pstm.setString(4, us.getPassword());
			pstm.setDate(5,  new java.sql.Date(us.getBirthdate().getTime()));
			pstm.setString(6, us.getAddress());
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User us) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAllUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean adminLogin(Admin ad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
