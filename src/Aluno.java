public class Aluno extends Telefone{
    private String nome;
    private Long matricula;

    public Aluno(String nome, Long matricula) {
        super();
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }
}
