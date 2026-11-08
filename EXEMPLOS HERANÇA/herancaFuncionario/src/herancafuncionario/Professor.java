
package herancafuncionario;


public class Professor extends Efetivo{
    
    private String graduacao;
    private String disciplinaAtuacao;
    private int tempoServico;
    
    
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
    
     public Professor(String nome, String matricula, Double salario, String graduacao, String disciplinaAtuacao, int tempoServico) {
        super(nome,matricula,salario);
        this.graduacao=graduacao;
        this.disciplinaAtuacao=disciplinaAtuacao;
        this.tempoServico=tempoServico;
    }
     
    public String toString(){
        return "\n DADOS DO FUNCIONÁRIO " +
                "\n NOME: " + getNome() +
                "\n MATRICULA: " + getMatricula() +
                "\n SALÁRIO: " + getSalario() +
                "\n GRADUAÇÃO: " + getGraduacao() +
                "\n DISCIPLINA DE ATUAÇÃO: " + getDisciplinaAtuacao();
    }
           
    
}
