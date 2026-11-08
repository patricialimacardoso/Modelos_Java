
package exemploShopping;


public class Alimentacao extends Setor{
    private int qtdeLoja;
    private DeAlimentacao deAlimentacao;

    public int getQtdeLoja() {
        return qtdeLoja;
    }

    public void setQtdeLoja(int qtdeLoja) {
        this.qtdeLoja = qtdeLoja;
    }

    public DeAlimentacao getDeAlimentacao() {
        return deAlimentacao;
    }

    public void setDeAlimentacao(DeAlimentacao deAlimentacao) {
        this.deAlimentacao = deAlimentacao;
    }
    
    public Alimentacao(int numero, int qtdeLoja, DeAlimentacao deAlimentacao) {
        super(numero);
        this.qtdeLoja=qtdeLoja;
        this.deAlimentacao=deAlimentacao;
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n ==========> DADOS DO SETOR <===========" + 
                "\n ----------- DE ALIMENTAÇÃO ------------" +
                "\n =======================================" +
                "\n NÚMERO: " + getNumero() +
                "\n QUANTIDADE DE LOJA: " + getQtdeLoja() +
                "\n =======================================" +
                                 getDeAlimentacao() ;
    }
}
