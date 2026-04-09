import java.text.ParseException;
import entities.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());
        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String prodName = sc.next();
            System.out.println("Product price: ");
            double prodPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            Product product = new Product(prodName, prodPrice);
            OrderItem item = new OrderItem(qty, prodPrice, product);
            order.addItem(item);
        }
        System.out.println("\nORDER SUMMARY:");
        System.out.println("Order moment: " + sdf.format(order.getMoment()));
        System.out.println("Order status: " + order.getStatus());
        System.out.printf("Client: %s (%s) - %s%n",
                order.getClient().getName(),
                sdf.format(order.getClient().getBirthDate()),
                order.getClient().getEmail());

        System.out.println("Order items:");
        for (OrderItem item : order.getItems()) {
            System.out.printf("%s, $%.2f, Quantity: %d, Subtotal: $%.2f%n",
                    item.getProduct().getName(),
                    item.getPrice(),
                    item.getQuantity(),
                    item.subTotal());
        }
        System.out.printf("Total price: $%.2f%n", order.total());
        sc.close();
    }
}
