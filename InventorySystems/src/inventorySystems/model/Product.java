package inventorySystems.model;

public class Product {
	private int id;
	private String productName;
	private  int Mrp;
	private  int available;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getMrp() {
		return Mrp;
	}
	public void setMrp(int mrp) {
		Mrp = mrp;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	
}
