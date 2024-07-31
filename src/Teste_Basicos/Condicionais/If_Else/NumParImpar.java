package Teste_Basicos.Condicionais.If_Else;

public class NumParImpar {

    int num;

    public int VerificadorNum(int num) {
        this.num = num;
        if (num %2 == 0) {
            System.out.println("Número é par");
        }else {
            System.out.println("Número é impar");
        }
        return num;
    }

    public static void main(String[] args) {

        NumParImpar numParImpar = new NumParImpar();

        numParImpar.VerificadorNum(100);
    }
}
