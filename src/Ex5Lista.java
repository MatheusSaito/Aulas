import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex5Lista {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Digite o seu salário (Ex: 1000.00): ");
        var salario = scan.nextLine();

        BigDecimal valor1 = new BigDecimal(salario);
        BigDecimal valor2 = new BigDecimal("1293.20");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        var salarioFormatado = formatoMoeda.format(valor1);
        var salarioMinimoFormatado = formatoMoeda.format(valor2);

        BigDecimal qtd_salarios = valor1.divide(valor2, 2, RoundingMode.HALF_UP);

        System.out.println("Salário digitado: " + salarioFormatado);
        System.out.println("Salário mínimo: " + salarioMinimoFormatado);
        System.out.println("Quantidade de salários mínimos: " + qtd_salarios);
    }
}
