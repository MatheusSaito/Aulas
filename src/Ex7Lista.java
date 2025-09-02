//TESTANDO Bubble Sort

import java.util.Scanner;

public class Ex7Lista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];
        int aux = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + " número: ");
            num[i] = scan.nextInt();
        }

        System.out.println("Números desordenados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(" " + num[i]);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (num[j] > num[j + 1]) {
                    aux = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = aux;
                }
            }
        }
        System.out.println("Números organizados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(" " + num[i]);
        }

    }
}
