package inventorySystems.service;

import java.util.List;

import inventorySystems.model.Admin;
import inventorySystems.model.User;

public interface UserService {
	boolean addUser(User us);
	boolean deleteUser(int id);
	boolean updateUser(User us);
	User getById(int id);
	List<User> getAllUser(int id);
	
	boolean adminLogin(Admin ad);
}
