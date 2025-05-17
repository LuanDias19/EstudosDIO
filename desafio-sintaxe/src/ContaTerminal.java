import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    int numero;
    float saldo;
    String nomeCliente, sobreCliente, agencia;

    Scanner scanner = (new Scanner(System.in)).useLocale(Locale.US);

    public void gravarNome() {
        System.out.println("\nOlá, para iniciarmos a sessão digite seu nome e sobrenome, por favor! ");
        nomeCliente = scanner.next();
        sobreCliente = scanner.next();
    }

    public void gravarAgencia() {
        System.out.println("\nDigite o número da sua agência: ");
        agencia = scanner.next();
    }

    public void gravarConta() {
        System.out.println("\nDigite o número da sua conta: ");
        numero = scanner.nextInt();
    }

    public void gravarSaldo() {
        System.out.println("\nDigite o seu saldo (usar . ao invés de ,):");
        saldo = scanner.nextFloat();
    }

    public void saidaGeral() {
        System.out.println("\nOlá " + nomeCliente + " " + sobreCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero
                + " e seu saldo R$" + saldo + " já está disponível para saque");
        agencia = scanner.next();
    }

}
