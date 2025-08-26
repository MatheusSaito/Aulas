import java.util.Scanner;

public class Ex1Lista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        var a = scan.nextInt();
        System.out.println("Digite o valor de B: ");
        var b = scan.nextInt();
        System.out.println("Digite o valor de C: ");
        var c = scan.nextInt();

        var soma = a + b;
        System.out.println("A soma de A + B é " + soma);

        if (c > soma) {
            System.out.println("O valor de C é mais que soma de A + B");
        } else {
            System.out.println("A soma de A + B é maior!");
        }
    }
}
