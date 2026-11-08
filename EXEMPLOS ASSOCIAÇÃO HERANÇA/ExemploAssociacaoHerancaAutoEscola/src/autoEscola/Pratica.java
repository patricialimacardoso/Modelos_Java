
package autoEscola;


public class Pratica extends Aula{
    
    private String horario;
    private String local;
    private Aluno aluno;
    private DeAulaPratica deAulaPratica;
    private Simulador simulador;
    private Veiculo veiculo;


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public DeAulaPratica getDeAulaPratica() {
        return deAulaPratica;
    }

    public void setDeAulaPratica(DeAulaPratica deAulaPratica) {
        this.deAulaPratica = deAulaPratica;
    }

    public Simulador getSimulador() {
        return simulador;
    }

    public void setSimulador(Simulador simulador) {
        this.simulador = simulador;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public Pratica(String data, String horario, String local, Aluno aluno, 
            DeAulaPratica deAulaPratica, Simulador simulador, Veiculo veiculo) {
        super(data);
        this.horario=horario;
        this.local=local;
        this.aluno=aluno;
        this.deAulaPratica=deAulaPratica;
        this.simulador=simulador;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DA AULA PRÁTICA <====" +
               "\n DATA: " + getData()+ 
               "\n LOCAL: " + getLocal()+ 
               "\n HORÁRIO: " + getHorario()+
               "\n " + getAluno()+
               "\n " + getDeAulaPratica()+
               "\n " + getSimulador()+
               "\n " + getVeiculo();
    } 
}
