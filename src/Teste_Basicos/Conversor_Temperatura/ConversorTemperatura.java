package Teste_Basicos.Conversor_Temperatura;

public class ConversorTemperatura {

    // O método "main" se faz necessário para executar o programa
    public static void main(String[] args) {

    /*
     Atributos de um mesmo tipo, podem ser declarados
     em uma única variável.
     */
    double C, F, K, Re, Ra;

    /*
    Atribuir os valores referente a cada variável
    para realizar as operações indicadas.
     */
    C = 2.43;

    F = C * 1.8 + 32;
    K = C + 273.15;
    Re = C * 0.8;
    Ra = C * 1.8 + 32 + 459.67;

    // Método SysOut para imprimir os resultados da interação das variáveis

        System.out.println("Temperatura em Fahrenheit: " + F);

        System.out.println("Temperatura em Kelvin: " + K);

        System.out.println("Temperatura em Réaumur: " + Re);

        System.out.println("Temperatura em Rankine: " + Ra);

    }
}
