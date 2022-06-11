package Formatar;

public class ComTítulo implements FormatadorNome{

    String titulo;


    public ComTítulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String FormatarNome(String nome, String sobrenome) {
        return titulo + " " + nome + " " + sobrenome;
    }
}
