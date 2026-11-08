
package autoEscola;


public class Agendamento {
    private int numero;
    private String data;
    private String horario;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public Agendamento(int numero, String data, String horário){
        this.numero=numero;
        this.data=data;
        this.horario=horario;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO AGENDAMENTO <====" +
               "\n NÚMERO: " + getNumero() + 
               "\n DATA: " + getData() +   
               "\n HORÁRIO: " + getHorario();         
    } 
}
