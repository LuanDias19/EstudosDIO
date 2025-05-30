#include <stdio.h>

float retornaMaior (float num1, float num2){
    if(num1 > num2){
        return num1;
    }else{
        return num2;
    }
}

int main() {

    float x, y, m;

    printf("\nEntre com o primeiro valor: ");
    scanf("%f", &x);
    printf("Entre com o segundo valor; ");
    scanf("%f", &y);

    m = retornaMaior(x,y);

    printf("\nO maior e: %2.f", m);



    
}