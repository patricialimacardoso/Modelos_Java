
package herancaagencia;


public class Reservas extends AgenciaDeViagens {
    private String dataReserva;

    public Reservas(String nome, String cnpj, String dataReserva) {
        super(nome, cnpj);
        this.dataReserva=dataReserva;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }
    
}
