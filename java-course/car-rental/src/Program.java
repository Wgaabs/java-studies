import entities.CarRental;
import entities.Invoice;
import services.BrazilianTaxService;
import services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();

        System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);

        System.out.print("Return (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        CarRental carRental = new CarRental(carModel, start, finish, pricePerHour, pricePerDay);
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilianTaxService());
        Invoice invoice = rentalService.processInvoice(carRental);

        System.out.println("INVOICE:");
        System.out.printf("Basic payment: %.2f%n", invoice.getBasicPayment());
        System.out.printf("Tax: %.2f%n", invoice.getTax());
        System.out.printf("Total payment: %.2f%n", invoice.getTotalPayment());
    }
}
