import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro numero");
        int primeiroNumero = scanner.nextInt();
        // System.out.println("Guardou: " + primeiroNumero);


        int segundoNumero;
        do{
            System.out.println("Insira o segundo numero");
            segundoNumero = scanner.nextInt();
            if(segundoNumero <= primeiroNumero) {
                System.out.println("O segundo numero deve ser maior que o primeiro");
            }
        }while (segundoNumero <= primeiroNumero);

        System.out.println("Escolha 'par' ou 'impar': ");
        String escolha = scanner.next().toLowerCase();
        // System.out.println("Escolha recebida: " + escolha);

        System.out.println("Numeros " + escolha + " no intervalo [" + primeiroNumero + ", " + segundoNumero + "]:");
        for(int i = segundoNumero; i >= primeiroNumero; i--){
            if((escolha.equals("par") && i % 2 == 0) || (escolha.equals("impar") && i % 2 != 0)){
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
