import java.util.Scanner;

public class Ex4Lista2 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Digite o número desejado: ");
        var num = scan.nextInt();
        var verificacao = true;

        while (verificacao) {
            System.out.printf("Digite um número para que o resto de %s seja 0: ", num);
            var numeros = scan.nextInt();

            if (num > numeros) {
                System.out.printf("Informe um número maior que %s \n", num);
                continue;
            }
            var resultado = numeros % num;
            verificacao = resultado == 0;

            System.out.printf("%s %% %s = %s \n", numeros, num, resultado);
        }
    }
}
