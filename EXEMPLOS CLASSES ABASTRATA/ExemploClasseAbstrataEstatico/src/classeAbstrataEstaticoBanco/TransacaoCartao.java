
package classeAbstrataEstaticoBanco;


public class TransacaoCartao {
    private int numero;
    protected static Double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public TransacaoCartao (int numero, Double valor){
        this.numero=numero;
        this.valor=valor;
    }
    
     public static Double saldoFuturo(){
        return (CartaoCredito.saldoParcial()- valor);
    }
     
    public String toString (){
        return  "\n NÚMERO DA TRANSAÇÃO: " + getNumero()+
                "\n VALOR DA TRANSAÇÃO: " + getValor();
    }
}
