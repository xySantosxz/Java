package Exercicios.NivelBasico.Arrays;

import java.util.Scanner;

public class B_Arrays {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Por estudar, dificuldades: Lógica dentro do Loop
        // Experimentar a classe Array

    /*
    1. Criação e Impressão

    Crie um array de 5 números inteiros, atribua valores a ele e imprima todos os elementos.

    2. Soma dos Elementos
    Crie um array com 10 elementos inteiros e calcule a soma de todos eles.

    3. Média dos Valores
    Leia 8 números inteiros, armazene-os em um array e calcule a média.

    4. Maior e Menor Valor
    Preencha um array com 6 números inteiros e exiba o maior e o menor valor.

     */

    /*1.

    int[] array = new int[5];

        for (int i = 0; i < 5; i++ ){
            int utilizador = ler.nextInt();
            array[i] = utilizador;
        }
        System.out.println(array);
*/
    /*2.

        int[] array2 = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++){
            int utilizador2 = ler.nextInt();
            array2[i] = utilizador2;
            soma += array2[i];
        }
        System.out.println(soma);
*/

        /*3. Média de valores, 8 elementos

        int[] array3 = new int[8];
        int soma = 0;

        for (int i = 0 ; i < 8 ; i++){
            int utilizador2 = ler.nextInt();
            array3[i] = utilizador2;
            soma += array3[i];
        }

        System.out.println(soma / array3.length);
*/
        /*4. Maior e Menor, 6 elementos

        int[] array4 = new int[6];
        int maior = 0;
        int menor = 0;

        for (int i = 0 ; i < 6 ; i++){
            int utilizador2 = ler.nextInt();
            array4[i] = utilizador2;
        }

        /* maior
        for (int i = 0 ; i < array4.length ; i++){
            if (array4[0] < array4[i]){
                maior = i;
            }

        }
        System.out.println(maior);


        for (int i = 0 ; i < array4.length ; i++){
            if (array4[0] > array4[i]){
                menor = i;
            }
        }
        System.out.println(menor);
*/
    }
}