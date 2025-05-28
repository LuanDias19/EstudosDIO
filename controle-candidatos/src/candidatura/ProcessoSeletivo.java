package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        /*
         * System.out.printf("Processo seletivo");
         * analisarCandidato(1900.0);
         * analisarCandidato(2200.0);
         * analisarCandidato(2000.0);
         */

        // selecaoCandidatos();

        // imprimirCandidatos();

        String[] candidatos = { "Laura", "Rafael", "Alice", "Lucas", "Isabella" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª TENTATIVA");
        } else {
            System.out.println(
                    "NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE LIGAÇÕES POSSIVEIS ATINGIDO");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirCandidatos() {
        String[] candidatos = { "Laura", "Rafael", "Alice", "Lucas", "Isabella" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº " + (i + 1) + " é o(a) " + candidatos[i]);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Laura", "Rafael", "Alice", "Lucas", "Isabella", "Enzo", "Valentina", "Sophia",
                "Matheus", "Gabriel" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("\nO candidato " + candidato + " solicitou R$" + salarioPretendido + " de salário. ");
            if (salarioBase >= salarioPretendido) {
                System.out.printf("\nO candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase < salarioPretendido) {
            System.out.printf("\nLIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.printf("\nLIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.printf("\nAGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
