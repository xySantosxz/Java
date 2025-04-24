package capitulo3;

/*
1-) Imprima todos os números de 150 a 1500 (inclusive).
2-) Imprima a soma de 1 até 1000 (inclusive).
3-) Imprima todos os múltiplos de 3, entre 1 e 100 (inclusive).
4-) Imprima todos os números entre 1 e 100 (inclusive) dizendo se ele é ou
não é múltiplo de 3. (dica: use o operador de resto: %)
 */

public class Imprimir {
    public static void main(String[] args) {
        int num = 150;
        int soma = 0;

/*
        while (num < 1500) {
            num = num + 1;
            System.out.println(num);
        }
*/
        for (int i = 0; i < 1000; i++ ){
            soma++;
        }
        System.out.println(soma);
    }
}