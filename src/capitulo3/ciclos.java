package capitulo3;

public class ciclos {
    public static void main(String[] args) {

        // Ciclos - If-else // While - Do While // For

        int idade = 15;

        /*
        if ( idade < 18 ) {
            System.out.println("ÉS DEMASIADO CRIANÇA");
        } */

        while (idade < 18) {
            idade = idade + 1;
        }
        System.out.println(idade);

        do {
            idade = idade + 1;
        } while (idade < 18);
        System.out.println(idade);


        /* Um for tem quase o mesmo conceito que um while,
        porém existe espaço para reservar uma inicialização de uma
        variável

        formato de um for
        for(inicializacao; condicao; incremento) {
            System("olá");
        }
        */

        for (int i = 0; i < 10; i++){
            System.out.println("Olá");
        }
    }
}
