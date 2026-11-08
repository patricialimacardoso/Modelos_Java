
package loja;


public class DeUtilidades extends Loja{
    private int quantidadeProduto;
    
    private Box box;

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public DeUtilidades(int numero, String descricao, Atendente atendente, int quantidadeProduto, Box box) {
        super(numero, descricao, atendente);
        this.quantidadeProduto=quantidadeProduto;
        this.box=box;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DA LOJA DE UTILIDADES <====" +
               "\n NÚMERO: " + getNumero()+ 
               "\n DESCRIÇÃO: " + getDescricao()+
               "\n QUANTIDADE DE PRODUTOS: " + getQuantidadeProduto()+
               "\n " + getAtendente()+ 
               "\n " + getBox(); 
    }   
}
