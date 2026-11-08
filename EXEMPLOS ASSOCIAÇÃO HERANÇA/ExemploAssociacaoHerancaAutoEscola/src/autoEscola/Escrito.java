
package autoEscola;


public class Escrito extends Exame {
    private int qtdeQuestoes;
    private Double nota;
    
    private Agendamento agendamento;

    public int getQtdeQuestoes() {
        return qtdeQuestoes;
    }

    public void setQtdeQuestoes(int qtdeQuestoes) {
        this.qtdeQuestoes = qtdeQuestoes;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }
    
    public Escrito(String nome, Aluno aluno, int qtdeQuestoes, Double nota, Agendamento agendamento) {
        super(nome, aluno);
        this.qtdeQuestoes=qtdeQuestoes;
        this.nota=nota;
        this.agendamento=agendamento;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO EXAME <====" +
               "\n NOME DO EXAME: " + getNome()+ 
               "\n QUANTIDADE DE QUESTÕES: " + getQtdeQuestoes()+ 
               "\n NOTA: " + getNota()+  
               "\n ALUNO DO EXAME ESCRITO: " + getAluno()+
               "\n " + getAgendamento();         
    } 
}

