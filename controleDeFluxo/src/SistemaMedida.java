import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua medida:   ");
        sigla = scanner.next();

        if (sigla == "P")
            System.out.println("PEQUENO");
        else if (sigla == "M")
            System.out.println("MEDIO");
        else if (sigla == "G")
            System.out.println("GRANDE");
        else
            System.out.println("INDEFINIDO");

    }
}