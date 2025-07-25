import java.util.Scanner;

public class OrderProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double itemsValue = scanner.nextDouble(); // Corrigido para nextDouble
        double shipping = scanner.nextDouble();   // Corrigido para nextDouble
        boolean firstPurchase = scanner.nextBoolean();

        double discount = 0;

        // Aplica desconto de 5% se for primeira compra
        if (firstPurchase) {
            discount = itemsValue * 0.05;
        }

        double discountedValue = itemsValue - discount;

        // Frete grátis para compras acima de R$200
        if (itemsValue >= 200.0) {
            shipping = 0;
        }

        double finalValue = discountedValue + shipping;

        // Exibe o valor final com duas casas decimais
        System.out.printf("%.2f\n", finalValue);

        scanner.close();
    }
}