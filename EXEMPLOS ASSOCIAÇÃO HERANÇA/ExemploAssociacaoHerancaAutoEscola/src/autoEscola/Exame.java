
package autoEscola;


public class Exame {
    private String nome;
    private Aluno aluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public Exame (String nome, Aluno aluno){
        this.nome=nome;
        this.aluno=aluno;
    }
}
