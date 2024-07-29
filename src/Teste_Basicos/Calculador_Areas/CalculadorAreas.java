package Teste_Basicos.Calculador_Areas;

public class CalculadorAreas {

    public static void main(String[] args) {

        double qtd, Ap, Aa, hp, lp, la, ha;

        hp = 2.6;
        lp = 1.6;
        la = 0.35;
        ha = 0.3;

        Ap = hp * lp;
        Aa = la * ha;

        qtd = Ap / Aa;
        System.out.println(Ap);

        System.out.println(Aa);

        System.out.println(qtd);

    }
}
