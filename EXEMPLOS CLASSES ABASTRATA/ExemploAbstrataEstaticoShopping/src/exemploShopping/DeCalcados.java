
package exemploShopping;


public class DeCalcados extends Loja{
    private String tipoProduto;
    private Cliente cliente;  

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
     public DeCalcados(int numero, String descricao, Atendente atendente, String tipoProduto, Cliente cliente) {
        super(numero, descricao, atendente);
        this.tipoProduto=tipoProduto;
        this.cliente=cliente;
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n ===========> DADOS DA LOJA <===========" + 
                "\n ------------- DE CALÇADOS -------------" +
                "\n =======================================" +
                "\n NÚMERO: " + getNumero() +
                "\n DESCRIÇÃO: " + getDescricao() +
                "\n TIPO DO PRODUTO: " + getTipoProduto() +
                "\n =======================================" +
                                 getAtendente() +
                                 getCliente() ;
    }
}
