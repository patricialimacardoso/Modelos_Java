
package classeAbstrataEstaticoBanco;


public class Transacao {
    private String tipo;
    private Double valorTransacao;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(Double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }
    
    public Transacao (String tipo, Double valorTransacao){
        this.tipo=tipo;
        this.valorTransacao=valorTransacao;
    }
    
    public String toString (){
        return  "\n TIPO: " + getTipo()+
                "\n VALOR DA TRANSAÇÃO: " + getValorTransacao();
    }
}
