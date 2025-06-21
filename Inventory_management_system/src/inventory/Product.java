package inventory;

public class Product {
    private String productName;
    private int productId;
    private int quantity;
    private int price;
	public Product(String productName, int productId,int quantity,int price) {
		this.productName = productName;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return this.productId;
	}
	 public String getProductName() {
	        return productName;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public int getPrice() {
	        return price;
	    }
	    public void setPrice(int p) {
	    	this.price = p;
	    }
	    public void setQuantity(int q) {
	    	this.quantity = q;
	    }
	    
	    public String toString() {
	    	return  "Product ID: " + productId + ", Name: " + productName + 
	                ", Quantity: " + quantity + ", Price: " + price;
	    
	    }
}
