package inventorySystems.service;

import java.util.List;

import inventorySystems.model.Stock;

public interface StockService {
	boolean addStock(Stock st);
	boolean deleteStock(int id);
	boolean updateStock(Stock st);
	List<Stock> getAllList();
	Stock getById(int id);
	List<Stock> search(String input);
	
}
