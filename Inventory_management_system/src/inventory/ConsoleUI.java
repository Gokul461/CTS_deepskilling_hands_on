package inventory;
import java.util.*;
public class ConsoleUI {
	private final InventoryService service;
	public ConsoleUI(InventoryService service)
	{
	this.service = service;	
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
	int ch;
	do {
		System.out.println("Enter choice 1. Add 2. Remove 3. Display 4. update 0. Exit: ");
		ch = sc.nextInt();
		sc.nextLine();
		switch(ch) {
		case 1:
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			System.out.println("Enter product id: ");
			int id = sc.nextInt();
			System.out.println("Enter quantity: ");
			int q = sc.nextInt();
			System.out.println("Enter price: ");
			int p = sc.nextInt();
			service.add(name,id,q,p);
			break;
		case 2:
			System.out.println("Enter product id to remove: ");
			id = sc.nextInt();
			service.remove(id);
			break;
		case 3:
			service.print();
			break;
		case 4:
			System.out.println("Enter the Id: ");
			id = sc.nextInt();
			sc.nextLine();
			int c;
			if(service.len() != 0 && service.len() >= id){
					System.out.println("What do you want to update 1. quantity 2. price 3. All 0. cancel: ");
					c = sc.nextInt();
					switch(c) {
					case 1:
						System.out.println("Enter the new quantity to update: ");
						q = sc.nextInt();
						sc.nextLine();
						service.updateQuantity(id,q);
						break;
					case 2:
						System.out.println("Enter the new price to update: ");
						p = sc.nextInt();
						sc.nextLine();
						service.updatePrice(id,p);
						break;
					case 3:
						System.out.println("Enter new product quantity to update: ");
						q = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter new product price to update: ");
						p = sc.nextInt();
						sc.nextLine();
						service.updateQuantityAndPrice(id,q,p);
						break;
				    case 0:
			            System.out.println("Cancelled!");
			            return;
				    default:
		                System.out.println("Invalid choice.");
					}
			}
			else {
				System.out.println("Id not found.\n");
			}
		
		case 0:
			break;
		default:
			System.out.println("Enter valid input...");
		}
	}while(ch != 0);
	System.out.println("Program ends...");
}
}