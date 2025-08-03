package inventory;
public class Main {
	public static void main(String args[]) {
		 ProductRepository repo = new Inventory();
	        InventoryService service = new InventoryManagement(repo);
	        ConsoleUI ui = new ConsoleUI(service);
	        ui.run();
	}
	}
