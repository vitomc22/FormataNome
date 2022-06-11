package Formatar;

public class Respeitoso implements FormatadorNome {
    String sexo;

    public Respeitoso(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public String FormatarNome(String nome, String sobrenome) {
        if (sexo == "feminino") {
            return "Sra." + nome + " " + sobrenome;
        } else if (sexo == "masculino") {
            return "Sr." + nome + " " + sobrenome;

        } else return "Insira um sexo válido!";
    }
}
