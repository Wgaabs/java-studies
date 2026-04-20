import java.util.Scanner;
import java.util.InputMismatchException;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o saldo da conta: ");
            double saldo = sc.nextDouble();

            System.out.print("Digite o valor do saque: ");
            double saque = sc.nextDouble();

            if (saque > saldo) {
               
                throw new IllegalArgumentException("Saldo insuficiente para esta operação.");
            }

            saldo -= saque;
            System.out.println("Saque realizado! Novo saldo: " + saldo);

        } catch (InputMismatchException e) {

            System.err.println("Erro de entrada: Por favor, digite apenas números.");
        } catch (IllegalArgumentException e) {

            System.err.println("Erro de negócio: " + e.getMessage());
        } finally {

            sc.close();
            System.out.println("Conexão com o sistema encerrada.");
        }
    }
}
