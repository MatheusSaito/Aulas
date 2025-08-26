import java.util.Scanner;

public class Ex2Lista2 {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Digite sua altura (m): ");
        var altura = scan.nextDouble();
        System.out.print("Digite seu peso (kg): ");
        var peso = scan.nextDouble();

        var IMC = peso / (altura * altura);
        System.out.printf("Seu IMC é %.2f \n", IMC);

        if (IMC <= 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (IMC >= 18.6 && IMC <= 24.9) {
            System.out.println("Peso ideal.");
        } else if (IMC >= 25.0 && IMC <= 29.9) {
            System.out.println("Sobrepeso.");
        } else if (IMC >= 30.0 && IMC <= 34.9) {
            System.out.println("Obesidade Grau I.");
        } else if (IMC >= 35.0 && IMC <= 39.9) {
            System.out.println("Obesidade Grau II (Severa).");
        } else if (IMC > 40.0) {
            System.out.println("Obesidade Grau III (Morbida).");
        }
    }
}
