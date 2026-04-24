package services;

import entities.CarRental;
import entities.Invoice;
import java.time.temporal.ChronoUnit;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;
    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Invoice processInvoice(CarRental carRental) {
        long roundedHours = (long) Math.ceil(ChronoUnit.MINUTES.between(carRental.getStart(), carRental.getFinish()) / 60.0);

        double basicPayment;
        if (roundedHours <= 12) {
            basicPayment = roundedHours * pricePerHour;
        } else {
            long days = (long) Math.ceil(roundedHours / 24.0);
            basicPayment = days * pricePerDay;
        }

        double tax = taxService.tax(basicPayment);
        return new Invoice(basicPayment, tax);
    }
}
