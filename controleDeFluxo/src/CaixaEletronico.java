import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seu saldo atual: R$" + saldo);

        System.out.println("Quanto deseja retirar?");
        valorSolicitado = scanner.nextInt();

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println("Novo Saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente, você é pobre.");
        }

    }
}