#include <stdio.h>

struct Aluno {
    char nome[50];
    int matricula=0;
    float notas[3];
    float media;
};

float calcularMedia(float notas[3]) {
    float soma = 0;
    for (int i = 0; i < 3; i++) {
        soma += notas[i];
    }
    return soma / 3;
}

int main() {

    struct Aluno alunos[1000];
    int numAlunos=0;
 


    printf("Quantos alunos? ");
    scanf("%d", &numAlunos);
    printf("Para as notas: \n - Caso seja decimal, colocar .\n - Digitar sequencialmente, ex: (7.0 4.1 8.9)");

    for(int i=0; i < numAlunos; i++){
        printf("\n\nAluno %d", i+1);
        printf("\nEntre com o nome do aluno: ");
        scanf("%s", &alunos[i].nome);
        printf("Matricula: ");
        scanf("%f", &alunos[i].matricula);
        printf("Notas: ", i+1);
        scanf("%f %f %f", &alunos[i].notas[0], &alunos[i].notas[1], &alunos[i].notas[2]);
    }  

    calcularMedia();
    


    printf("\n--- Aprovados ---");

    for(int i=0; i < numAlunos; i++){
        if(alunos[i].media > 7){
            printf("\n%s (%i) - Media: %.2f", alunos[i].nome, alunos[i].matricula, alunos[i].media);
        }  
    printf("\n");
    }

    mostraAprovados(alunos[i].nome, alunos[i].matricula, alunos[i].media)

    printf("\n\n--- Exame ---");
    for(int i=0; i < numAlunos; i++){
        if(alunos[i].media < 7 && alunos[i].media >= 4){
            printf("\n%s (%i) - Media: %.2f", alunos[i].nome, alunos[i].matricula, alunos[i].media);
        } 
    printf("\n");
    }

    printf("\n\n--- Reprovados ---");
    for(int i=0; i < numAlunos; i++){
        if(alunos[i].media < 4){
            printf("\n%s (%i) - Media: %.2f", alunos[i].nome, alunos[i].matricula, alunos[i].media);
        } 
    }

}