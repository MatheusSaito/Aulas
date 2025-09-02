import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", preco);
    }
}

public class Ex8Lista {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Geladeira", 499.99));
        produtos.add(new Produto("Máquina de lavar", 360.70));
        produtos.add(new Produto("Fogão", 500.00));
        produtos.add(new Produto("Micro-ondas", 450.00));
        produtos.add(new Produto("Ar-condicionado", 480.50));
        produtos.add(new Produto("Televisor LED", 470.00));
        produtos.add(new Produto("Liquidificador Industrial", 390.00));
        produtos.add(new Produto("Aspirador de pó", 420.00));

        Scanner scan = new Scanner(System.in);
        ArrayList<Produto> escolhidos = new ArrayList<>();

        while (true) {
            System.out.println("Escolha um produto (digite 0 para finalizar):");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println((i + 1) + ". " + produtos.get(i));
            }
            System.out.print("Número do produto: ");
            int escolhaProduto = scan.nextInt();

            if (escolhaProduto == 0) {
                break;
            } else if (escolhaProduto > 0 && escolhaProduto <= produtos.size()) {
                Produto escolhido = produtos.get(escolhaProduto - 1);
                escolhidos.add(escolhido);
                System.out.println("Produto adicionado: " + escolhido);
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Produtos escolhidos:");
        for (Produto p : escolhidos) {
            System.out.println(p);
        }
        System.out.println("---------------------------------------------------");
        double totalCompra = 0.0;
        for (Produto p : escolhidos) {
            totalCompra += p.getPreco();
        }
        System.out.println("Preço total da compra: R$ " + String.format("%.2f", totalCompra));

        System.out.println("---------------------------------------------------");
        System.out.println("Digite a sua forma de pagamento: ");
        System.out.println("1. À Vista em Dinheiro ou Pix");
        System.out.println("2. À Vista no cartão de crédito");
        System.out.println("3. Parcelado no cartão em duas vezes");
        System.out.println("4. Parcelado no cartão em três vezes ou mais");
        int escolhaPagamento = scan.nextInt();
        double totalFinal = totalCompra;

        switch (escolhaPagamento) {
            case 1:
                totalFinal = totalCompra * 0.85;
                System.out.println("Pagamento à vista em Dinheiro ou Pix: 15% de desconto aplicado.");
                break;
            case 2:
                totalFinal = totalCompra * 0.90;
                System.out.println("Pagamento à vista no cartão de crédito: 10% de desconto aplicado.");
                break;
            case 3:
                System.out.println("Pagamento parcelado em 2 vezes: preço normal, sem juros.");
                break;
            case 4:
                totalFinal = totalCompra * 1.10;
                System.out.println("Pagamento parcelado em 3 vezes ou mais: 10% de juros aplicado.");
                break;
            default:
                System.out.println("Opção de pagamento inválida. Considerando preço normal.");
                break;
        }

        System.out.println("Valor final a pagar: R$ " + String.format("%.2f", totalFinal));
    }
}