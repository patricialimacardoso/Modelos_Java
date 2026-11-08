
package herancaagencia;


public class Pagamento extends Confirmadas{
    private String formaDePagamento;

    public Pagamento(String nome, String cnpj, String dataReserva, String dataDeConfirmacao, Double valor, String formaDePagamento) {
        super(nome, cnpj, dataReserva, dataDeConfirmacao, valor);
        this.formaDePagamento=formaDePagamento;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    
    public String toString(){
        return "DADOS DA RESERVA: " +
               "\n NOME DA EMPRESA: " + getNome () +
               "\n CNPJ: " + getCnpj () +
               "\n DATA DA RESERVA: " + getDataReserva()  + 
               "\n DATA DA CONFIRMAÇÃO: " + getDataDeConfirmacao()  +
               "\n VALOR: " + getValor()  + " REAIS" +
               "\n FORMA DE PAGAMENTO: " + getFormaDePagamento(); 
              
    }
}
