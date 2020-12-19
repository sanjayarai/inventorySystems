package inventorySystems.service;

import java.util.List;

import inventorySystems.model.Cashier;

public interface CashierService {
	boolean addCashier(Cashier ca);
	boolean deleteCashier(int id);
	boolean updateCashier(Cashier ca);
	List<Cashier> getAllCashier();
	Cashier getById(int id);
	boolean loginCashier(Cashier ca);

}
