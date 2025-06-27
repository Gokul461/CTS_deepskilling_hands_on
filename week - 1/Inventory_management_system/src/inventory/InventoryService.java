package inventory;

public interface InventoryService {
    void add(String name, int id, int quantity, int price);
    void remove(int id);
    void print();
    int len();
    void updatePrice(int id, int price);
    void updateQuantity(int id, int quantity);
    void updateQuantityAndPrice(int id, int quantity, int price);
}
