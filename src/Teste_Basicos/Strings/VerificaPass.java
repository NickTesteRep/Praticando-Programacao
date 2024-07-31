package Teste_Basicos.Strings;

import java.util.Scanner;

public class VerificaPass {

    String password = "123";
    public String verificarPass(String pass) {
        if (password.equals(pass)){
            System.out.println("Senha correta");
        }else {
            System.out.println("Tente novamente");
        }
        return pass;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        VerificaPass verificaPass = new VerificaPass();

        verificaPass.verificarPass(scan.nextLine());
    }
}
