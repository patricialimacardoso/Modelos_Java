
package herancaagencia;

public class Confirmadas extends Reservas{
    private String dataDeConfirmacao;
    private Double valor;

    public Confirmadas(String nome, String cnpj, String dataReserva, String dataDeConfirmacao, Double valor) {
        super(nome, cnpj, dataReserva);
        this.dataDeConfirmacao=dataDeConfirmacao;
        this.valor=valor;
    }

    public String getDataDeConfirmacao() {
        return dataDeConfirmacao;
    }

    public void setDataDeConfirmacao(String dataDeConfirmacao) {
        this.dataDeConfirmacao = dataDeConfirmacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
