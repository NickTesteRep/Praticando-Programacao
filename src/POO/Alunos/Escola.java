package POO.Alunos;

public class Escola {

    public static void main(String[] args) {

        SisMatricula mat = null;

        String Aluno = "Carlos";

        if(Aluno.equals("Carlos")) {
            mat = new Carlos();
            mat.gerarNumMtricula();
            mat.validarMatricula();

        } else if (Aluno.equals("Adriana")) {
            mat = new Adriana();
        }if(Aluno.equals("João")) {
            mat = new Joao();
        }



    }
}
