
package herancaprodutopadaria;


public class Recheado extends DeDoce{
    private String descricaoRecheio;

   
    public String getDescricaoRecheio() {
        return descricaoRecheio;
    }

    public void setDescricaoRecheio(String descricaoRecheio) {
        this.descricaoRecheio = descricaoRecheio;
    }
    
     public Recheado(String dataFabricacao, String dataValidade, int codigo, String tempoFermentacao, String descricao, String descricaoRecheio) {
        super(dataFabricacao, dataValidade, codigo, tempoFermentacao, descricao);
        this.descricaoRecheio=descricaoRecheio;
    }
     public String toString(){
        return "\n DADOS DO PRODUTO PÃO DE DOCE RECHEADO: " +
                "\n CÓDIGO: " + getCodigo() +
                "\n DESCRIÇÃO: " + getDescricao() +
                "\n RECHEIO: " + getDescricaoRecheio() +
                "\n TEMPO DE FERMENTAÇÃO: " + getTempoFermentacao() +
                "\n DATA DE FABRICAÇÃO: " + getDataFabricacao() +
                "\n DATA DE VALIDADE: " + getDataValidade() ;
    }
    
}
