import java.util.Scanner;

public class ProductXYZ {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of Product objects
        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product information:");
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent: " + totalAmount);
    }

    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }

        return totalAmount;
    }
}
