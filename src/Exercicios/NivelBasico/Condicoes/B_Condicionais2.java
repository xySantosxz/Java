package Exercicios.NivelBasico.Condicoes;

import java.util.Scanner;

public class B_Condicionais2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        // 1. Verificar se um número é positivo, negativo ou igual a zero

        int num = ler.nextInt();

        if(num > 0){
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else if (num == 0){
            System.out.println("Igual a zero");
        } else {
            System.out.println("Escreva um número");
        }

        // 2. Par ou Ímpar

        if (num % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        // 3. Maior de dois números

        int num1 = ler.nextInt();
        int num2 = ler.nextInt();

        if (num1 > num2 ) {
            System.out.println("O primeiro valor é maior que o segundo");
        } else if (num1 < num2) {
            System.out.println("O segundo valor é maior que o primeiro");
        } else if (num1 == num2) {
            System.out.println("Os números são iguais");
        }

        // 4. Verificação de Idades

        int idade = ler.nextInt();

            if (idade < 18){
                System.out.println("Podes ir beber leite");
            } else if (idade > 18) {
                System.out.println("Podes beber um Whiskey");
            } else {
                System.out.println("Escreva um valor inteiro");
            }

        // 5. Aprovar Notas

        double nota = ler.nextDouble();

            if (nota >= 7){
                System.out.println("Aprovado");
            } else if (nota > 5 && nota < 6.9) {
                System.out.println("Recuperação");
            } else if (nota < 5){
                System.out.println("Reprovado");
            }

        // 6. Ano Bissexto

        int ano = ler.nextInt();

            if (ano % 400 == 0 ){
                System.out.println("Ano Bissexto");
            } else if (ano % 4 == 0 || ano % 100 != 0){
                System.out.println("Não é Bissexto");
            }

        // 7. Calculadora Simples

        int x = ler.nextInt();
        int num3 = ler.nextInt();
        int num4 = ler.nextInt();
        int resultado = 0;


        switch (x){
            case 1:
                System.out.println("Soma");
                resultado = num3 + num4;
                System.out.println(resultado);
                break;
            case 2:
                System.out.println("Subtração");
                resultado = num3 + num4;
                System.out.println(resultado);
                break;
            case 3:
                System.out.println("Produto");
                resultado = num3 + num4;
                System.out.println(resultado);
                break;
            case 4:
                System.out.println("Divisão");
                resultado = num3 + num4;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Escolha uma opção válida");
        }

        //8. Verificar a Faixa Etária

        int idadee = ler.nextInt();

        if (idade > 0 && idade < 12){
            System.out.println("Criança");
        } else if (idade > 13 && idade < 17) {
            System.out.println("Adolescente");
        } else if (idade > 18 && idade < 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso(60+)");
        }


        // 9. Autenticação Simples

        String nome = "admin";
        String senha = "1234";

        String nome1= ler.next();
        String senha1= ler.next();

        if (nome.equals(nome1) && senha.equals(senha1)) { System.out.println("Acesso Permitido"); }
    }
}
