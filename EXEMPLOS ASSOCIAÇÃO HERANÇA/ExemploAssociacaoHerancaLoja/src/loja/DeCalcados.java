
package loja;


public class DeCalcados extends Loja {
    private String tipoProduto;

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    public DeCalcados(int numero, String descricao, Atendente atendente, String tipoProduto) {
        super(numero, descricao, atendente);
        this.tipoProduto=tipoProduto;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DA LOJA DE CALÇADOS <====" +
               "\n NÚMERO: " + getNumero()+ 
               "\n DESCRIÇÃO: " + getDescricao()+
               "\n TIPO DO PRODUTO: " + getTipoProduto()+
               "\n " + getAtendente();     
    } 
}
