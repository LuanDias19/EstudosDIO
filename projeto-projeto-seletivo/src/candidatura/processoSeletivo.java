package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    public static void main(String[] args) {
        /*
        System.out.printf("Processo seletivo");
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
         */

        selecaoCandidatos();
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Laura", "Rafael", "Alice", "Lucas", "Isabella", "Enzo", "Valentina", "Sophia", "Matheus", "Gabriel"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("\nO candidato " + candidato + " solicitou R$" + salarioPretendido + " de salário. ");
            if(salarioBase >= salarioPretendido){
                System.out.printf("\nO candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase < salarioPretendido){
            System.out.printf("\nLIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.printf("\nLIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else{
            System.out.printf("\nAGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
