public class ContaBanco {

    public static void main(String[] args) {

        ContaTerminal contaTerminal = new ContaTerminal();

        contaTerminal.gravarNome();

        contaTerminal.gravarAgencia();

        contaTerminal.gravarConta();

        contaTerminal.gravarSaldo();

        contaTerminal.saidaGeral();
    }
}
