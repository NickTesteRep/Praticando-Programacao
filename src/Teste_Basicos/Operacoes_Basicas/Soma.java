package Teste_Basicos.Operacoes_Basicas;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma;

        soma = 1 + 1;
        soma = 1 + 2;

        soma = entrada.nextInt() + entrada.nextInt();
        entrada.close();

        System.out.println(soma);
    }
}
