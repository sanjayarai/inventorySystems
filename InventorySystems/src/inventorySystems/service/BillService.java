package inventorySystems.service;

import java.util.List;

import inventorySystems.model.Bill;

public interface BillService {
	boolean addBill(Bill bi);
	boolean deleteBill(int id);
	boolean updateBill(Bill bi);
	List<Bill> getAllBill();
	Bill getById(int id);
	

}
