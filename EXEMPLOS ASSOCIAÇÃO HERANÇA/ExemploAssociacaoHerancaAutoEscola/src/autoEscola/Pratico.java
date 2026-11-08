
package autoEscola;

public class Pratico extends Exame {
    private String data;
    
    private String local;
    private Double nota;
    private Agendamento agendamento;
    private FiscalDetran fiscalDetran;
    private Veiculo veiculo;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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

    public FiscalDetran getFiscalDetran() {
        return fiscalDetran;
    }

    public void setFiscalDetran(FiscalDetran fiscalDetran) {
        this.fiscalDetran = fiscalDetran;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public Pratico(String nome, Aluno aluno, String data, String local, Double nota, 
            Agendamento agendamento, FiscalDetran fiscalDetran, Veiculo veiculo) {
        super(nome, aluno);
        this.data=data;
        this.local=local;
        this.nota=nota;
        this.agendamento=agendamento;
        this.fiscalDetran=fiscalDetran;
        this.veiculo=veiculo;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO EXAME <====" +
               "\n NOME DO EXAME: " + getNome()+ 
               "\n DATA: " + getData()+ 
               "\n LOCAL: " + getLocal()+
               "\n NOTA: " + getNota()+  
               "\n ALUNO DO EXAME PRÁTICO: " + getAluno()+
               "\n " + getAgendamento()+
               "\n " + getFiscalDetran()+
               "\n " + getVeiculo();
    } 
}
