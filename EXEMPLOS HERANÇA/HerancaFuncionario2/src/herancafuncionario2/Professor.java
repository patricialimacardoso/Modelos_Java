
package herancafuncionario2;


public class Professor extends Efetivo {
    private String graduacao;
    private String disciplinaAtuacao;
    private int tempoServico;

    public Professor(String nome, String matricula, Double salario, String graduacao, String disciplina, int tempoServico) {
        super(nome, matricula, salario);
        this.graduacao=graduacao;
        this.disciplinaAtuacao=disciplinaAtuacao;
        this.tempoServico=tempoServico;
   
        
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public String getDisciplinaAtuacao() {
        return disciplinaAtuacao;
    }

    public void setDisciplinaAtuacao(String disciplinaAtuacao) {
        this.disciplinaAtuacao = disciplinaAtuacao;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }
    
    
}
