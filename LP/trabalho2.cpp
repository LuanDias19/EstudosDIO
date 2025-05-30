#include <stdio.h>
#include <locale.h>

struct Aluno {
    char nome[50];
    int matricula=0;
    float notas[3];
};


float retornaMaior (float num1, float num2){
    if(num1 > num2){
        return num1;
    }else{
        return num2;
    }
}

float mediaFinal(int numAlunos, float nota1, float nota2, float nota3){
    
}


int main() {
	setlocale(LC_ALL, "Portuguese");

    struct Aluno alunos;
    int numAlunos;
    float media=0;

    printf("Quantos alunos? ");
    scanf("%d", &numAlunos);


    for(int i=0; i < numAlunos; i++){
    printf("Alunos %d", i++);
    printf("\nEntre com o nome do aluno: ");
    scanf("%s", &alunos[i].nome);
    printf("\nMatricula: ");
    scanf("%f", &alunos[i].matricula);
    
    for(int i=0; i < 3; i++){
            printf("\nNota 1: ");
        scanf("%f", &alunos[i].nota);
        }
    }   

    printf("\n--- Aprovados ---");

    for(int i=0; i < numAlunos; i++){
        if(media > 7){
            printf("\n%s (%i) - Media: %.2f", alunos[i].nome, alunos[i].matricula, alunos[i].media);
        }


    
    }

    printf("\n\n--- Exame ---");
    for(int i=0; i < numAlunos; i++){
    printf("\n%s (%i) - Media: %.2f", alunos[i].nome, alunos[i].matricula, alunos[i].media);
    }

    printf("\n\n--- Exame ---");
    for(int i=0; i < numAlunos; i++){
    printf("\n%s (%i) - Media: %.2f", alunos[i].nome, alunos[i].matricula, alunos[i].media);
    }


}