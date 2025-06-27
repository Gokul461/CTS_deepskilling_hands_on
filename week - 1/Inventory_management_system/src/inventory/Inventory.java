package inventory;
import java.util.*;
public class Inventory implements ProductRepository{
	private final List<Product> products = new ArrayList<>();
	
	public Inventory() {
		 Product p1 = new Product("cap", 1, 100, 1200);
         products.add(p1);

         Product p2 = new Product("Cooler", 2, 200, 200);
         products.add(p2);
	}
	@Override
	public int lengthOfList() {
		return products.size();
	}
	@Override
	public void addProducts(Product p) {
		products.add(p);
	}
	@Override
	public boolean removeProduct(int id) {
		for(int i=0;i<products.size();i++) {
			if(products.get(i).getId() == id) {
				products.remove(i);
				return true;
			}
		}
		return false;
	}
	@Override
	public List<Product> display() {
		return products;
	}
	@Override
	public void updateProductPrice(int id,int price) {
		for(int i=0;i<products.size();i++) {
			Product p = products.get(i);
			if(p.getId() == id) {
				p.setPrice(price);
			}
		}
	}
	@Override
	public void updateProductQuantity(int id,int q) {
		for(int i=0;i<products.size();i++) {
			Product p = products.get(i);
			if(p.getId() == id) {
				p.setQuantity(q);
				//code
			}
		}
	}
	@Override
	public void updateProductQandP(int id,int q,int price) {
		for(int i=0;i<products.size();i++) {
			Product p = products.get(i);
			if(p.getId() == id) {
				p.setPrice(price);
				p.setQuantity(q);
			}
		}
	}
	@Override
	public Product getById(int id) {
		for (Product p : products) {
	        if (p.getId() == id) {
	            return p;
	        }
		}
	return null;
	}
	

}
