package inventory;
import java.util.*;
public class InventoryManagement implements InventoryService{
    private final ProductRepository repository;

    public InventoryManagement(ProductRepository repository) {
        this.repository = repository;
    }

    public void add(String name, int id, int quantity, int price) {
        if (repository.getById(id) != null) {
            System.out.println("Product with ID " + id + " already exists.\n");
            return;
        }
        Product p = new Product(name, id, quantity, price);
        repository.addProducts(p);
        System.out.println("Successfully added to product list!\n");
    }
    public void remove(int id) {
        if (repository.getById(id) == null) {
            System.out.println("Product with ID " + id + " not exists.\n");
            return;
        }
        if(repository.removeProduct(id)) {
    	    System.out.println("Product with ID " + id + " is removed successfully.\n");
    }
        else {
        	System.out.println("Error occured.");
        }
    }
    public int len() {
    	return repository.lengthOfList();
    }
    public void print() {
    	  List<Product> products = repository.display();
    	    if (products.isEmpty()) {
    	        System.out.println("No products in inventory.\n");
    	        return;
    	    }
    	    System.out.println("-----------------------------------------------------");
    	for(Product p: products) {
    		System.out.println(p);
    	}
    	System.out.println("-----------------------------------------------------\n");
    }
    public void updatePrice(int id,int price) {
    	 if (repository.getById(id) == null) {
             System.out.println("Product with ID " + id + " not exists.\n");
             return;
         }
    	 repository.updateProductPrice(id,price);
    	 System.out.println("Product price updated.\n");
    }
    public void updateQuantity(int id,int q) {
   	 if (repository.getById(id) == null) {
            System.out.println("Product with ID " + id + " not exists.\n");
            return;
        }
   	 repository.updateProductQuantity(id,q);
   	System.out.println("Product quantity updated.\n");
   }
    public void updateQuantityAndPrice(int id,int q,int price) {
   	 if (repository.getById(id) == null) {
            System.out.println("Product with ID " + id + " not exists.\n");
            return;
        }
   	 repository.updateProductQandP(id,q,price);
   	 System.out.println("Product price and quantity updated.\n");
   }
}
