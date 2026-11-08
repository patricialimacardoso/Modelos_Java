
package modeloInterfaceLaticinio;


public class NotaFiscal {
    private int numero;
    private String data;
    private Pagamento pagamento;

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

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    public NotaFiscal (int numero, String data, Pagamento pagamento){
        this.numero=numero;
        this.data=data;
        this.pagamento=pagamento;
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =======> DADOS DA NOTA FISCAL <========" +
               "\n =======================================" +
               "\n NÚMERO:" + getNumero()+
               "\n DATA:" + getData()+
                        getPagamento();
    }
}
