package inventorySystems.service;

import java.util.List;

import inventorySystems.model.Product;

public interface ProductService {
	boolean addProduct(Product pr);
	boolean deleteProduct(int id);
	boolean updateProduct(Product pr);
	List<Product> getAllProduct();
	Product getById(int id);
	

}
