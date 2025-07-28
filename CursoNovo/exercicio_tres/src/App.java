import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    private final static MaquinaBanho maquinaBanho = new MaquinaBanho();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");

        int opcao = -1;

        do {
            System.out.println("===Escolha uma opção===");
            System.out.println("1. Dar banho no pet");
            System.out.println("2. Adicionar água");
            System.out.println("3. Adicionar shampoo");
            System.out.println("4. Verificar água");
            System.out.println("5. Verificar shampoo");
            System.out.println("6. Verificar se tem pet na máquina");
            System.out.println("7. Colocar pet na máquina");
            System.out.println("8. Retirar pet da máquina");
            System.out.println("9. Limpar máquina");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    maquinaBanho.tomarBanho();
                case 2:
                    maquinaBanho.addAgua();
                case 3:
                    maquinaBanho.addShampo();
                case 4:
                    System.out.println("Água disponível: " + maquinaBanho.getAgua() + "L");
                case 5:
                    System.out.println("Shampoo disponível: " + maquinaBanho.getShampoo() + "L");
                case 6:
                    System.out.println("Tem pet na máquina?\n" + maquinaBanho.temPet());
                case 7:
                    colocarPetMaquina();
                case 8:
                    maquinaBanho.retirarPet();
                case 9:
                    maquinaBanho.limparMaquina();
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }

        } while (opcao != 0);
    }

    public static void colocarPetMaquina() {
        var nome = "";

        while (nome == null || nome.isEmpty()) {
            System.out.println("Digite o nome do pet:");
            nome = scanner.nextLine();
        }

        var pet = new Pet(nome);
        System.out.println("Pet " + pet.getName() + " criado.");
        maquinaBanho.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

}
