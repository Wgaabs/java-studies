import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditure: ");
                double healthExpenditure = sc.nextDouble();
                taxPayers.add(new Individual(name, annualIncome, healthExpenditure));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                taxPayers.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }
        System.out.println("\nTAXES PAID:");
        double totalTax = 0.0;
        for (TaxPayer tp : taxPayers) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
            totalTax += tp.tax();
        }
        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTax));
    }
}
