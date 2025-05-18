import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua nota:   ");
        nota = scanner.nextInt();

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }
}