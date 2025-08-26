import java.util.Scanner;

public class Ex3Lista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        var a = scan.nextInt();
        System.out.print("Digite o valor de B: ");
        var b = scan.nextInt();

        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println("O valor de C é " + c);
    }
}
