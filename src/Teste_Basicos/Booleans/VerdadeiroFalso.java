package Teste_Basicos.Booleans;

public class VerdadeiroFalso {


    public boolean verificarIdade(int idade) {
       return idade >= 18;
    }

    public static void main(String[] args) {

        VerdadeiroFalso verdadeiroFalso = new VerdadeiroFalso();

        System.out.println(verdadeiroFalso.verificarIdade(18));
    }
}
