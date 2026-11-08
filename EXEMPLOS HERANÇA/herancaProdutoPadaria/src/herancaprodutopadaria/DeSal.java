
package herancaprodutopadaria;


public class DeSal extends Pao {
    private int quantidade;
    private Double tempoParaAssar;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getTempoParaAssar() {
        return tempoParaAssar;
    }

    public void setTempoParaAssar(Double tempoParaAssar) {
        this.tempoParaAssar = tempoParaAssar;
    }
    
    public DeSal (String dataFabricacao, String dataValidade, int codigo, String tempoFermentacao, int quantidade, Double tempoParaAssar){
        super(dataFabricacao, dataValidade, codigo,tempoFermentacao);
        this.quantidade=quantidade;
        this.tempoParaAssar=tempoParaAssar;
    }
    
    public String toString(){
        return "\n DADOS DO PRODUTO PÃO DE SAL " +
                "\n CÓDIGO: " + getCodigo() +
                "\n TEMPO DE FERMENTAÇÃO: " + getTempoFermentacao() +
                "\n DATA DE FABRICAÇÃO: " + getDataFabricacao() +
                "\n DATA DE VALIDADE: " + getDataValidade() +
                "\n QUANTIDADE: " + getQuantidade() +
                "\n TEMPO PARA ASSAR: " + getTempoParaAssar() + " HORAS";
    }
    
}
