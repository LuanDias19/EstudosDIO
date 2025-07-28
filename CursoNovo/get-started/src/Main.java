import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        /*
         * System.out.println("Hello, World!");
         * System.out.println(msg + args[0]);
         * System.out.println("Precisamos de uma " + args[1]);
         * 
         * System.out.println("Olá! Qual o seu nome?\n");
         * String nome = scanner.next();
         * 
         * System.out.println("Qual a sua idade?\n");
         * int idade = scanner.nextInt();
         * 
         * System.out.println("Olá " + nome + " você tem " + idade + " anos!\n");
         */

        /*
         * System.out.println("Informa o seu nome:");
         * var nome = scanner.next();
         * 
         * System.out.println("Informe a sua idade:");
         * var idade = scanner.nextInt();
         * 
         * System.out.println("Você é emancipado? (s/n)\n");
         * var emancipado = scanner.next().equalsIgnoreCase("s");
         * 
         * var podeDirigir = (idade >= 18) || (idade >= 16 && emancipado);
         * var mensagem = podeDirigir ?
         * nome + ", você pode dirigir\n" :
         * nome + ", você não pode dirigir\n";
         * 
         * 
         * 
         * System.out.println(mensagem);
         * System.out.println("Fim da execução");
         * 
         * // Switch Case
         * System.out.println("Informe um número de 1 a 7");
         * var opcao = scanner.nextInt();
         * 
         * switch (opcao){
         * case 1:
         * System.out.println("Domingo");
         * break;
         * case 2:
         * System.out.println("Segunda");
         * break;
         * case 3:
         * System.out.println("Terça");
         * break;
         * case 4:
         * System.out.println("Quarta");
         * break;
         * case 5:
         * System.out.println("Quinta");
         * break;
         * case 6:
         * System.out.println("Sexta");
         * break;
         * case 7:
         * System.out.println("Sábado");
         * break;
         * }
         * 
         * System.out.println("Informe um número de 1 a 7");
         * var opcao = scanner.nextInt();
         * var mensagem = switch (opcao){
         * case 1, 7 -> {
         * var dia = opcao == 1 ? "Domingo" : "Sábado";
         * yield String.format("Fim de Semana, DÁÁÁÁ-LHE", dia);
         * }
         * case 2 -> "Segunda";
         * case 3 -> "Terça";
         * case 4-> "Quarta";
         * case 5 -> "Quinta";
         * case 6 -> "Sexta";
         * default -> "Inválido";
         * };
         * System.out.println(mensagem);
         * 
         * 
         * // Repetição FOR
         * for(;;){
         * System.out.println("Digite um nome:\nPara sair digite 'exit'");
         * var nome = scanner.next();
         * 
         * if(nome.equalsIgnoreCase("exit")) break;
         * 
         * System.out.println(nome + "\n");
         * }
         * 
         * 
         * for(var i = 0; i<=100; i++) {
         * if (i % 2 == 1) {
         * System.out.println(i);
         * continue;
         * }
         * }
         * 
         * 
         * 
         * for(var arg : args) {
         * System.out.println(arg);
         * }
         * 
         * 
         * // Repetição WHILE e DO WHILE
         * 
         * var nome = "";
         * while(!nome.equals("exit")){
         * System.out.println("Informe um nome");
         * nome = scanner.next();
         * System.out.println(nome + "\n");
         * }
         * 
         * 
         * var nome = "";
         * while(true){
         * System.out.println("Informe um nome");
         * nome = scanner.next();
         * System.out.println(nome + "\n");
         * 
         * if (nome.equalsIgnoreCase("exit")) break;
         * }
         * 
         * 
         * var nome = "exit";
         * do {
         * System.out.println("Informe um nome");
         * nome = scanner.next();
         * System.out.println(nome + "\n");
         * 
         * } while (!nome.equalsIgnoreCase("exit"));
         * 
         */

        /*
         * // Exercício 1
         * System.out.println("Digite um número para a tabuada");
         * var numero = scanner.nextInt();
         * 
         * for (int i = 1; i <= 10; i++){
         * System.out.printf("%s x %s = %s\n", numero, i, (numero * i));
         * }
         * 
         * // Exercício 2
         * System.out.println("Digite o seu peso");
         * var peso = scanner.nextInt();
         * 
         * System.out.println("Digite a sua altura");
         * var altura = scanner.nextInt();
         * 
         * var IMC = peso/(altura * altura);
         * 
         * System.out.println(IMC);
         * 
         * if (IMC <= 18.5) {
         * System.out.println("Abaixo do peso");
         * } else if (IMC >= 18.6 && IMC <= 24.9){
         * System.out.println("Peso ideal");
         * } else if (IMC >= 25.0 && IMC <= 29.9){
         * System.out.println("Levemente acima do peso");
         * } else if (IMC >= 30.0 && IMC <= 34.9){
         * System.out.println("Obesidade Grau I");
         * } else if (IMC >= 35.0 && IMC <= 39.9){
         * System.out.println("Obesidade Grau II");
         * } else {
         * System.out.println("Obesidade Grau III");
         * }
         */

        /*
         * var male = new Person("João", 30);
         * var female = new Person("Maria", 24);
         * 
         * male.incAge();
         * 
         * System.out.println("\nNome: " + male.getName() + "\nIdade: " +
         * male.getAge());
         * System.out.println("\nNome: " + female.getName() + "\nIdade: " +
         * female.getAge());
         * 
         * 
         * var person = new Person("João", 30);
         * System.out.println(person.getInfo());
         * System.out.println(person.name());
         */

        var person = new Person1("João", 12);
        System.out.println(person);
        System.out.println(person.name());
        person.name();

    }

}