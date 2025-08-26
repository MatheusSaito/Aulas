import java.util.Scanner;

public class Ex2Lista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número desejado: ");
        var num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Esse número é par!");
        } else {
            System.out.println("Esse número é ímpar!");
        }

        if (num > 0) {
            System.out.println("Esse número é positivo!");
        } else {
            System.out.println("Esse número é negativo!");
        }

    }
}
