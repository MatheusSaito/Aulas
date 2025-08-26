import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o tamanho da base de seu triângulo: ");
        var base = scan.nextFloat();
        System.out.print("Digite o tamanho da altura de seu triângulo: ");
        var altura = scan.nextFloat();

        var area = base * altura;

        System.out.println("A área desse triângulo é " + area);
    }
}
