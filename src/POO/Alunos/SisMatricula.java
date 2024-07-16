package POO.Alunos;

//Classe mãe, da qual vão herdar as classes filhas geradas
public abstract class SisMatricula {

    public abstract void gerarNumMtricula();
    public abstract void validarMatricula();

    //classe criada para que apenas as classes filhas
    //possuam acesso
    protected void registrarNaBiblioteca() {
        System.out.println("Registrando número de Biblioteca");
    }
}
