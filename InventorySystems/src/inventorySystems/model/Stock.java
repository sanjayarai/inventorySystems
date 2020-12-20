package inventorySystems.model;

public class Stock {
	private int id;
	private String productName;
	private int availableQuantity;
	private int addedQuantity;
	private int mrp;
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
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	public int getAddedQuantity() {
		return addedQuantity;
	}
	public void setAddedQuantity(int addedQuantity) {
		this.addedQuantity = addedQuantity;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
	

}
