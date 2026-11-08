
package exemploShopping;

public class Fornecedor {
    private String cnpj;
    private String nome;
    protected static Double taxaDesconto;
    private Endereco endereco;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTaxaDesconto() {
        return taxaDesconto;
    }

    public void setTaxaDesconto(Double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Fornecedor(String cnpj, String nome, Double taxaDesconto, Endereco endereco){
        this.cnpj=cnpj;
        this.nome=nome;
        this.taxaDesconto=taxaDesconto;
        this.endereco=endereco;
    }
    
    public static Double calculaPrecoBasico(){
        return (Produto.calculaPrecoFinal()- taxaDesconto);
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n ========> DADOS DO FORNECEDOR <========" + 
                "\n =======================================" +
                "\n CNPJ: " + getCnpj() +
                "\n NOME: " + getNome() +
                "\n TAXA DE DESCONTO: " + getTaxaDesconto() +
                "\n PREÇO BÁSICO: " + calculaPrecoBasico() +
                "\n =======================================" +
                "\n =============> ENDEREÇO <==============" + 
                "\n =======================================" +
                                 getEndereco() +
                "\n =======================================" ;
    }
}
