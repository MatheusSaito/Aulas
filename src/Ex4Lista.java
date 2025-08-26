import java.util.Scanner;

public class Ex4Lista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número desejado: ");
        var num = scan.nextInt();

        var antecessor = num - 1;
        var sucessor = num + 1;

        System.out.printf("O número digitado foi %s. Seu antecessor é %s e o seu sucessor é %s", num, antecessor,
                sucessor);
    }
}
