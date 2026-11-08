
package exemploShopping;


public class Produto {
    private int codigo;
    private String nome;
    protected static Double preco;
    private Fornecedor fornecedor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public Produto(int codigo, String nome, Double preco, Fornecedor fornecedor){
        this.codigo=codigo;
        this.nome=nome;
        this.preco=preco;
        this.fornecedor=fornecedor;
    }
    
    public static Double calculaPrecoFinal(){
        return (preco+(preco*0.7));
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n ==========> DADOS DO PRODUTO <=========" + 
                "\n =======================================" +
                "\n CÓDIGO: " + getCodigo() +
                "\n NOME: " + getNome() +
                "\n PREÇO: " + getPreco() +
                "\n PREÇO FINAL: " + calculaPrecoFinal() +
                                getFornecedor() ;
    }
}
