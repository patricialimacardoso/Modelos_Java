
package herancaprodutopadaria;

public class Assado extends Salgado {
    private Double tempoDeEspera;

    public Assado(String dataFabricacao, String dataValidade, int codigo, String nome, Double quantidade, Double tempoDeEspera) {
        super(dataFabricacao, dataValidade, codigo, nome, quantidade);
        this.tempoDeEspera=tempoDeEspera;
    }

    public Double getTempoDeEspera() {
        return tempoDeEspera;
    }

    public void setTempoDeEspera(Double tempoDeEspera) {
        this.tempoDeEspera = tempoDeEspera;
    }
    
    public String toString(){
        return "\n DADOS DO PRODUTO SALGADO ASSADO " +
                "\n CÓDIGO: " + getCodigo() +
                "\n DATA DE FABRICAÇÃO: " + getDataFabricacao() +
                "\n DATA DE VALIDADE: " + getDataValidade() +
                "\n NOME: " + getNome() +
                "\n QUANTIDADE: " + getQuantidade() +
                "\n TEMPO DE ESPERA: " + getTempoDeEspera() + " MINUTOS";
    }
}
