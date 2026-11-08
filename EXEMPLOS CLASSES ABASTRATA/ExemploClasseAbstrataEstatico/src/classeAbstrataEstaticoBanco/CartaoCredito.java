
package classeAbstrataEstaticoBanco;


public class CartaoCredito {
    private int numero;
    private String dataCriacao;
    protected static Double valorDaCompra;
    
    private TransacaoCartao transacaoCartao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(Double valorDaConta) {
        this.valorDaCompra = valorDaCompra;
    }

    public TransacaoCartao getTransacaoCartao() {
        return transacaoCartao;
    }

    public void setTransacaoCartao(TransacaoCartao transacaoCartao) {
        this.transacaoCartao = transacaoCartao;
    }
    
    public CartaoCredito (int numero, String dataCriacao, Double valorDaCompra, TransacaoCartao transacaoCartao){
        this.numero=numero;
        this.dataCriacao=dataCriacao;
        this.valorDaCompra=valorDaCompra;
        this.transacaoCartao=transacaoCartao;
    }
    
    public static Double saldoParcial(){
        return (Fisica.saldoAtual()- valorDaCompra);
    }
    
    public String toString (){
        return  "\n NÚMERO DO CARTÃO DE CRÉDITO: " + getNumero()+
                "\n DATA DE CRIAÇÃO: " + getDataCriacao()+
                "\n VALOR DA CONTA: " + getValorDaCompra()+
                "\n =======================================" +
                "\n ===> DADOS DA TRANSAÇÃO DO CARTÃO <====" +
                "\n =======================================" +
                             getTransacaoCartao();
    }
}
