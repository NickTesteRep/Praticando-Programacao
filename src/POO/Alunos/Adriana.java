package POO.Alunos;

public class Adriana extends SisMatricula {

    //métodos obrigatórios gerados na classe mãe e que
    // foram herdados pela classe filha
    public void gerarNumMtricula() {
        System.out.println("Registrando o número de Adriana");

        //método com modificador "protected" criado na classe mãe
        //para ser usado apenas nas classes filhas
        registrarNaBiblioteca();
    }
    public void validarMatricula() {
        System.out.println("Matrícula Validada no Sistema");
    }
}
