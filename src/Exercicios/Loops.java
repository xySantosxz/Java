package Exercicios;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        /*
        1. Imprima os números de 1 a 100 usando um for.

        2. Calcule a soma dos números pares de 0 a 50 com while.

        3. Leia números do usuário até que ele digite 0, e no final mostre a média dos números digitados.

        4. Crie a tabuada de um número digitado (de 1 a 10).
         */

        /*
        for (int i = 0; i <= 100; i++){
            System.out.println(i);
        }
         */

        /*
        for (int i = 0; i <= 50; i++){
            if( i % 2 == 0 ){
                System.out.println(i);
            }
        }
         */

/*
       int[] array = new int[4];
       int x;
       int media = 0;
       int soma = 0;

       for (int i = 0; i < 4; i++){
           x = ler.nextInt();
           array[i] = x;
           soma += array[i];
       }
        media = soma / array.length;
        System.out.println(media);

        Problemas que enfrentei:
 */

        /*
        Tabuada
         */

        int num = ler.nextInt();

        for (int i = 0; i <= 10; i++){
            int resultado = num * i;
            System.out.println(resultado);
        }


    }
}
