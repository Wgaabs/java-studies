import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Primeiro número: ");
            double n1 = sc.nextDouble();

            System.out.print("Operação (+, -, *, /): ");
            char op = sc.next().charAt(0);

            System.out.print("Segundo número: ");
            double n2 = sc.nextDouble();

            // Validação manual da divisão por zero para double
            if (op == '/' && n2 == 0) {
                throw new ArithmeticException("Erro: Divisão por zero não permitida!");
            }

            double res = 0;
            switch (op) {
                case '+': res = n1 + n2; break;
                case '-': res = n1 - n2; break;
                case '*': res = n1 * n2; break;
                case '/': res = n1 / n2; break;
                default:
                    // Lança exceção para manter padrão de tratamento centralizado
                    throw new IllegalArgumentException("Operação '" + op + "' não é válida! Use +, -, * ou /");
            }

            System.out.printf("Resultado: %.2f%n", res);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada: Deves digitar apenas números com ponto (ex: 10.5).");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fim da operação segura.");
            sc.close();
        }
    }
}