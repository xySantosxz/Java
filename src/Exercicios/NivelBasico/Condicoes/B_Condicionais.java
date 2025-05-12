package Exercicios.NivelBasico.Condicoes;

import java.util.Scanner;

public class B_Condicionais {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        /*
        1. Leia um número inteiro e diga se ele é par ou ímpar.

        2. Peça ao usuário sua idade e diga se ele pode votar (idade ≥ 18).

        3. Solicite três números e exiba o maior deles.

        4. Crie um programa que leia o número do mês (1 a 12) e diga o nome correspondente usando switch.
         */

        /*
        1.
        System.out.println("Escreva um numero");

        int num = ler.nextInt();

        if(num % 2 == 0){
            System.out.println("Número Par");
        } else {
            System.out.println("Número Impar");
        }
        */

        /*
        2.
        System.out.println("Escreva a sua idade");
        int idade = ler.nextInt();

        if (idade > 18) {
            System.out.println("Pode votar");
        }
         */

        /*
        3. Por fazer


        int[] array = new int[3];
        int maior = array[0];
        int IndiceValorMaior = -1;

        int num;

        for (int i = 0; i < array.length; i++){
            num = ler.nextInt();
            array[i] = num;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            if (array[i] > maior){
                maior = array[i];
                IndiceValorMaior = i;
            }
        }

        problemas: entender a manipulação, tive que ter outra variável intermediária para substituir valores

         */


        /*
        4.
           int x = ler.nextInt();

                switch(x){
                    case 1:
                        System.out.println("Janeiro");
                        break;
                    case 2:
                        System.out.println("Fevereiro");
                        break;
                    case 3:
                        System.out.println("Março");
                        //convém usar o Break ou então todos os meses vão sair na mesma.
                    case 4:
                        System.out.println("Abril");
                    case 5:
                        System.out.println("Maio");
                    case 6:
                        System.out.println("Junho");
                    case 7:
                        System.out.println("Julho");
                    case 8:
                        System.out.println("Agosto");
                    case 9:
                        System.out.println("Setembro");
                    case 10:
                        System.out.println("Outro");
                    case 11:
                        System.out.println("Novembro");
                    case 12:
                        System.out.println("Dezembro");
                }
         */




    }
}
