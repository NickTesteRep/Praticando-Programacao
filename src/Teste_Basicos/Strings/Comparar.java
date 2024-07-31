package Teste_Basicos.Strings;

import java.util.Scanner;

import java.util.Scanner;
public class Comparar {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Comparar comparar = new Comparar();

        String password = "123456";

        System.out.println("Digite sua senha: ");
        String pass = scan.nextLine();
        if (password.equals(pass)) {
            System.out.println("Senha correta");
        }else {
            System.out.println("Senha incorreta");
        }
        scan.close();
    }
}
