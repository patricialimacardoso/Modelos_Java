
package herancaprodutopadaria;


public class Frito extends Salgado{
    private String tipoDaMassa;

    public Frito(String dataFabricacao, String dataValidade, int codigo, String nome, Double quantidade) {
        super(dataFabricacao, dataValidade, codigo, nome, quantidade);
    }

    public String getTipoDaMassa() {
        return tipoDaMassa;
    }

    public void setTipoDaMassa(String tipoDaMassa) {
        this.tipoDaMassa = tipoDaMassa;
    }
    
     public String toString(){
        return "\n DADOS DO PRODUTO SALGADO FRITO " +
                "\n CÓDIGO: " + getCodigo() +
                "\n DATA DE FABRICAÇÃO: " + getDataFabricacao() +
                "\n DATA DE VALIDADE: " + getDataValidade() +
                "\n NOME: " + getNome() +
                "\n QUANTIDADE: " + getQuantidade() +
                "\n TIPO DA MASSA: " + getTipoDaMassa() ;
    }
    
}
