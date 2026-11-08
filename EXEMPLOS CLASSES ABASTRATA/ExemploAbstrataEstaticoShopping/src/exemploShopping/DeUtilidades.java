
package exemploShopping;


public class DeUtilidades extends Loja{
    private int qtdeProduto;
    
    private Cliente cliente;
    private Box box;

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }
    
    public DeUtilidades(int numero, String descricao, Atendente atendente, 
            int qtdeProduto, Cliente cliente, Box box) {
        super(numero, descricao, atendente);
        this.qtdeProduto=qtdeProduto;
        this.cliente=cliente;
        this.box=box;
    }    
    
    public String toString(){
        return  "\n =======================================" +
                "\n ===========> DADOS DA LOJA <===========" + 
                "\n ------------ DE UTILIDADES ------------" +
                "\n =======================================" +
                "\n NÚMERO: " + getNumero() +
                "\n DESCRIÇÃO: " + getDescricao() +
                "\n QUANTIDADE DO PRODUTO: " + getQtdeProduto() +
                "\n =======================================" +
                                 getAtendente() +
                                 getCliente() +
                                 getBox() ;
    }
}
