import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Olá, pessoa 1. Digite seu nome: ");
        var nome1 = scan.nextLine();
        System.out.print("Olá, pessoa 2. Digite seu nome: ");
        var nome2 = scan.nextLine();

        System.out.print(nome1 + ", digite sua idade: ");
        var idade1 = scan.nextInt();
        System.out.print(nome2 + ", digite sua idade: ");
        var idade2 = scan.nextInt();

        var diferencaIdade = Math.abs(idade1 - idade2);

        System.out.printf("A diferença de idade de %s e de %s é de %d anos. %n", nome1, nome2, diferencaIdade);
    }
}
