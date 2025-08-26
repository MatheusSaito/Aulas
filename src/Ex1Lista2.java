import java.util.Scanner;

public class Ex1Lista2 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Digite o número desejado: ");
        var num = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            var tabuada = num * i;
            System.out.printf("%d x %d = %d%n", num, i, tabuada);
        }
    }
}
