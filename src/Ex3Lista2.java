import java.util.Scanner;

public class Ex3Lista2 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        var num1 = scan.nextInt();
        System.out.print("Digite o segundo número sendo maior que o primeiro: ");
        var num2 = scan.nextInt();

        if (num2 <= num1) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
            System.exit(0);
        }

        System.out.print("Informe sua escolha entre par e impar: ");
        var escolha = scan.next();
        switch (escolha) {
            case "par":
                for (int i = num2; i >= num1; i--) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                break;
            case "impar":
                for (int i = num2; i >= num1; i--) {
                    if (i % 2 == 1) {
                        System.out.println(i);
                    }
                }
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }
    }
}
