
package herancaprodutopadaria;


public class Bolo extends Produto{
    private String nome;
    private Double peso;
    private Double preco;

    public Bolo(String dataFabricacao, String dataValidade, int codigo, String nome, Double peso, Double preco) {
        super(dataFabricacao, dataValidade, codigo);
        this.nome=nome;
        this.peso=peso;
        this.preco=preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
     public String toString(){
        return "\n DADOS DO PRODUTO BOLO " +
                "\n CÓDIGO: " + getCodigo() +
                "\n DATA DE FABRICAÇÃO: " + getDataFabricacao() +
                "\n DATA DE VALIDADE: " + getDataValidade() +
                "\n NOME: " + getNome() +
                "\n PESO: " + getPeso() +
                "\n PREÇO: " + getPreco() ;
    }
    
}
