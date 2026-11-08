
package herancaagencia;


public class NaoConfirmada extends Reservas {
    private String status;

    public NaoConfirmada(String nome, String cnpj, String dataReserva, String status) {
        super(nome, cnpj, dataReserva);
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String toString(){
        return "DADOS DA RESERVA: " +
               "\n NOME DA EMPRESA: " + getNome () +
               "\n CNPJ: " + getCnpj () +
               "\n DATA DA RESERVA: " + getDataReserva()  + 
               "\n STATUS DA RESERVA: " + getStatus(); 
              
    }
    
}
