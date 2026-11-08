
package modeloInterfaceLaticinio;


public class Pagamento {
    private int numero;
    private String data;
    private Double valorPagamento;

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

    public Double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(Double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }
    
    public Pagamento (int numero, String data, Double valorPagamento){
        this.numero=numero;
        this.data=data;
        this.valorPagamento=valorPagamento;
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n ========> DADOS DO PAGAMENTO <=========" + 
               "\n =======================================" +
               "\n NÚMERO:" + getNumero()+
               "\n DATA:" + getData()+
               "\n VALOR:" + getValorPagamento();
    }
}
