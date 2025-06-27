package inventory;
import java.util.*;
public interface ProductRepository {
	void addProducts(Product p);
	boolean removeProduct(int id);
	List<Product> display();
	int lengthOfList();
	void updateProductPrice(int id,int p);
	void updateProductQuantity(int id,int q);
	void updateProductQandP(int id,int q,int p);
	Product getById(int id);
}	
