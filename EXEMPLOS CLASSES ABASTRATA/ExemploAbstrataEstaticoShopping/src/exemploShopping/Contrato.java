
package exemploShopping;


public class Contrato {
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
    
    public Contrato(int numero, Double valor){
        this.numero=numero;
        this.valor=valor;
    }
    
    public static Double calculaValorFinal(){
        return (valor+Box.valorAluguel+Locatario.taxaCondominio);
    }
    public String toString(){
        return  "\n NÚMERO: " + getNumero() +
                "\n VALOR: " + getValor() ;
    }
}
