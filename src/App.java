import java.time.OffsetDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var anoAtual = OffsetDateTime.now().getYear();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        var nome = scan.nextLine();
        System.out.print("Digite seu ano de nascimento: ");
        var anoNasc = scan.nextInt();
        var idade = anoAtual - anoNasc;

        System.out.printf("Olá, %s. Você tem %s anos", nome, idade);
    }
}
