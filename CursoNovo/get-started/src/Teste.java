import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        System.out.println("Você tem permissão? (true/false)");
        boolean hasPermission = scanner.nextBoolean();  //Lê um valor booleano (true ou false)

        System.out.println("Quantos anos você tem?");
        int age = scanner.nextInt(); // Lê a idade como inteiro

        if ((hasPermission == true) && (age >= 18)){
            System.out.println("Acesso permitido");
        } else if ((hasPermission == false) && (age >= 18)){
            System.out.println("Acesso negado");
        } else if (age < 18){
            System.out.println("Idade insuficiente");
        }

        // TODO: Verifique condições de acesso

        scanner.close();
    }
}
