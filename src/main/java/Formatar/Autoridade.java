package Formatar;

public class Autoridade {


    String nome;
    String sobrenome;
    FormatadorNome fn;


    public Autoridade(String nome, String sobrenome, FormatadorNome fn) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.fn = fn;
    }

    public String getTratamento() {

        return fn.FormatarNome(nome, sobrenome);
    }
}

// Crie uma classe chamada Formatar.Autoridade que possui atributos como nome,
//  sobrenome e uma instância de Formatar.FormatadorNome.
//      Essa classe deve possuir um método getTratamento() que delega a formatação do nome para a instância de Formatar.FormatadorNome.

//     Formatar.Informal: retorna somente o primeiro nome

//      Formatar.Respeitoso: deve receber em seu construtor a informação se é masculino ou feminino, e retornar "Sr." ou "Sra." seguido do sobrenome

//      Formatar.ComTítulo: deve receber em seu construtor o título e retornar o título seguido de nome e sobrenome. Exemplo: "Magnífico Pedro Cabral"


