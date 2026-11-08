
package herancaprodutopadaria;


public class Salgado extends Produto{
    private String nome;
    private Double quantidade;

    public Salgado(String dataFabricacao, String dataValidade, int codigo, String nome, Double quantidade) {
        super(dataFabricacao, dataValidade, codigo);
        this.nome=nome;
        this.quantidade=quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
    
}
