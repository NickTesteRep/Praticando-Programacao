import java.io.PrintStream;
import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] args) {
        
        PrintStream show = System.out;
        Scanner scan = new Scanner(System.in);
        
        int soma;
        int subtrai;
        int mulplica;
        float divisao;
        
       show.println("Digite o primeiro numero: ");
            int num1 = scan.nextInt();
       show.println("Digite o segundo numero: ");
            int num2 = scan.nextInt();
            soma = num1 + num2;
       show.println(soma);
       

        show.println("Digite o 1º numero da divisão: ");
            float div1 = scan.nextFloat();
        show.println("Digite o 2º numero da divisão");
            float div2 = scan.nextFloat();
            divisao = div1/div2;
        show.println(divisao);
        scan.close();
    }

    

    
}
