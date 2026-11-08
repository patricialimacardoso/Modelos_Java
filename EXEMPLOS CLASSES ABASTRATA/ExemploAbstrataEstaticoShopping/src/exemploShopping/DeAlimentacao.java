
package exemploShopping;


public class DeAlimentacao extends Loja{
    private String pais;
    private Cliente cliente;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public DeAlimentacao(int numero, String descricao, Atendente atendente, String pais, Cliente cliente) {
        super(numero, descricao, atendente);
        this.pais=pais;
        this.cliente=cliente;
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n ===========> DADOS DA LOJA <===========" + 
                "\n ----------- DE ALIMENTAÇÃO ------------" +
                "\n =======================================" +
                "\n NÚMERO: " + getNumero() +
                "\n DESCRIÇÃO: " + getDescricao() +
                "\n PAÍS: " + getPais() +
                "\n =======================================" +
                                 getAtendente() +
                                 getCliente() ;
    }
}
