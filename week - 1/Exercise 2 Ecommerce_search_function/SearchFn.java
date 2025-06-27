import java.util.*;
public class SearchFn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Product[] products = {
            new Product(3, "Laptop", "Electronics"),
            new Product(6, "Android", "Electronics"),
            new Product(7, "Ipod", "Electronics"),
            new Product(9, "Sandals", "Footwear"),
            new Product(8, "Pants", "Clothing"),
            new Product(5, "Coolers", "Clothing"),
            new Product(2, "Shoes", "Footwear"),
            new Product(1, "T-shirt", "Clothing"),
            new Product(4, "Refrigerator", "Appliances"),
            new Product(10, "AC", "Appliances")
        };
        int c;
        do {
        	System.out.println("\nSearch using 1.Linear 2.Binary 0.Exit ");
        	System.out.println("Enter your choice: ");
            c = sc.nextInt();
        	sc.nextLine();
        	switch(c) {
        	
        	case 1:
    
        int n;
        do {
        	System.out.println("\nModel(Linear search)");
            System.out.println("\nSearch by 1. Product ID 2. Product Name 3. Category 0. Exit");
            System.out.print("Enter your choice: ");
            n = sc.nextInt();
            sc.nextLine(); 

            if (n != 0) {
                linearSearch(products, n, sc);
            }

        } while (n != 0);
        break;
        
        	case 2:
        		do {
        			System.out.println("\nModel(Binary search)");
                    System.out.println("Search by 1. Product ID 2. Product Name 3. Category 0. Exit");
                    System.out.print("Enter your choice: ");
                    n = sc.nextInt();
                    sc.nextLine(); 

                    if (n != 0) {
                        binarySearch(products, n, sc);
                    }

                } while (n != 0);
                break;
        	case 0:
        		break;
        	
        	default:
        		System.out.println("Enter valid option.");
        	}
        }while(c != 0);
        System.out.println("Exited search.");
        sc.close();
    }

    public static void linearSearch(Product[] products, int n, Scanner sc) {
        boolean found = false;
        switch (n) {
            case 1:
                System.out.print("Enter the product ID: ");
                int searchId = sc.nextInt();
                for (Product product : products) {
                    if (product.getProductId() == searchId) {
                        System.out.println("Product found: " + product.getProductName() + " (" + product.getCategory() + ")");
                        found = true;
                        break;
                    }
                }
                break;

            case 2:
                System.out.print("Enter the product name: ");
                String name = sc.nextLine();
                for (Product product : products) {
                    if (product.getProductName().equalsIgnoreCase(name)) {
                        System.out.println("Product found: " + product.getProductName() + " (" + product.getCategory() + ")");
                        found = true;
                    }
                }
                break;

            case 3:
                System.out.print("Enter the product category: ");
                ArrayList<Product> out = new ArrayList<>(); 
                String category = sc.nextLine();
                for (int i =0;i<products.length;i++) {
                    if (products[i].getCategory().equalsIgnoreCase(category)) {
                    	out.add(products[i]);
                        found = true;
                    }
                     
                }
                if(found) {
                System.out.println("Products found in Category (" + category + "):");
                for(Product p: out) {
                	System.out.println(p.getProductName());
                }
                }
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        if (!found) {
            System.out.println("No product found.");
        }
    }
    public static void binarySearch(Product[] products, int n, Scanner sc) {
        boolean found = false;
        switch (n) {
            case 1: // Search by ID
                System.out.print("Enter the product ID: ");
                int searchId = sc.nextInt();
                Product[] byId = products.clone();
                Arrays.sort(byId, Comparator.comparingInt(Product::getProductId));
                int low = 0, high = byId.length - 1;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    if (byId[mid].getProductId() == searchId) {
                        System.out.println("Product found: " + byId[mid].getProductName()+ " ("+byId[mid].getCategory()+")");
                        found = true;
                        break;
                    } else if (byId[mid].getProductId() < searchId) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                break;

            case 2: // Search by Name
                System.out.print("Enter the product name: ");
                String name = sc.nextLine();
                Product[] byName = products.clone();
                Arrays.sort(byName, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
                low = 0;
                high = byName.length - 1;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    int cmp = byName[mid].getProductName().compareToIgnoreCase(name);
                    if (cmp == 0) {
                        System.out.println("Product found: " + byName[mid].getProductName() + " ("+byName[mid].getCategory()+")");
                        found = true;
                        break;
                    } else if (cmp < 0) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                break;

            case 3: // Search by Category
                System.out.print("Enter the product category: ");
                String category = sc.nextLine();
                Product[] byCategory = products.clone();
                Arrays.sort(byCategory, Comparator.comparing(Product::getCategory, String.CASE_INSENSITIVE_ORDER));
                low = 0;
                high = byCategory.length - 1;
                while (low <= high) {
                    int mid = (low + high) / 2;
                    int cmp = byCategory[mid].getCategory().compareToIgnoreCase(category);
                    if (cmp == 0) {
                    
                        List<Product> matched = new ArrayList<>();
                        int left = mid, right = mid + 1;
                        matched.add(byCategory[mid]);

                        while (left > 0 && byCategory[left - 1].getCategory().equalsIgnoreCase(category)) {
                            matched.add(0, byCategory[--left]);
                        }

                        while (right < byCategory.length && byCategory[right].getCategory().equalsIgnoreCase(category)) {
                            matched.add(byCategory[right++]);
                        }

                        System.out.println("Products found in Category (" + category + "):");
                        for (Product p : matched) {
                            System.out.println(p.getProductName());
                        }
                        found = true;
                        break;
                    } else if (cmp < 0) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                break;

            default:
                System.out.println("Invalid choice.");
                return;
        }

        if (!found) {
            System.out.println("No product found.");
        }
    }

}