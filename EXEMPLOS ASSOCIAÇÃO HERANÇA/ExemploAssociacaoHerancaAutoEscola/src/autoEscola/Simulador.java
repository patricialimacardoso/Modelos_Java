
package autoEscola;


public class Simulador {
    private int qtdePontos;
    
    private Agendamento agendamento;

    public int getQtdePontos() {
        return qtdePontos;
    }

    public void setQtdePontos(int qtdePontos) {
        this.qtdePontos = qtdePontos;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }
    
    public Simulador (int qtdePontos, Agendamento agendamento){
        this.qtdePontos=qtdePontos;
        this.agendamento=agendamento;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO SIMULADOR <====" +
               "\n QUANTIDADE DE PONTOS: " + getQtdePontos()+ 
               "\n  " + getAgendamento();
    } 
}
