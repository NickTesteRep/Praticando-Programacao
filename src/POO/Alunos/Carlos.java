package POO.Alunos;

//classe filha com a extensão da classe mãe
public class Carlos extends SisMatricula {

    //métodos obrigatórios gerados na classe mãe e que
    // foram herdados pela classe filha
    public void gerarNumMtricula() {
        System.out.println("Número de Matrícula Gerado");
        registrarNaBiblioteca();

    }
    public void validarMatricula() {
        System.out.println("Matrícula Validada no Sistema");
    }


}
