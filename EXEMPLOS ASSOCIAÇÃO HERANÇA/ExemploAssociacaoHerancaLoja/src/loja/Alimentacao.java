
package loja;


public class Alimentacao extends Setor {
    private int quantidadeLoja;
    
    private DeAlimentacao deAlimentacao;


    public int getQuantidadeLoja() {
        return quantidadeLoja;
    }

    public void setQuantidadeLoja(int quantidadeLoja) {
        this.quantidadeLoja = quantidadeLoja;
    }

    public DeAlimentacao getDeAlimentacao() {
        return deAlimentacao;
    }

    public void setDeAlimentacao(DeAlimentacao deAlimentacao) {
        this.deAlimentacao = deAlimentacao;
    }
     public Alimentacao(int numero, int quantidadeLoja, DeAlimentacao deAlimentacao) {
        super(numero);
        this.quantidadeLoja=quantidadeLoja;
        this.deAlimentacao=deAlimentacao;
    }
    
    public String toString(){
        return "\n" +
               "====> SETOR ALIMENTAÇÃO <====" +
               "\n QUANTIDADE DE LOJAS: " + getQuantidadeLoja()+
               "\n " + getDeAlimentacao();       
    } 
}
