package edu.luan.anatomiaDeClasses;

public class MinhaClasse {
    
    public static void main(String[] args) {
        
        /*
        int ano = 2025;

        ano = 2020;

        final String BR = "Brasil";

        BR = "Brazil"; 
        */

        //int numero = 1;

        /*
        String meuNome = "Luan";

        int anoFabricacao = 2006;

        boolean verdadeira = true;

        anoFabricacao = 2005;
        */

        String primeiroNome= "Luan";
        String segundoNome="Dias";

        //String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto(primeiroNome, segundoNome));
        
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome).concat(" ");
    }
}
