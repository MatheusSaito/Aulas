import java.util.Scanner;

public class Ex6Lista {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Digite um valor qualquer: ");
        var num = scan.nextInt();

        var reajuste = num*1.05;
        System.out.printf("Valor reajustado é %.2f", reajuste);
    }
}
