
package supermercado;

public class Supermercado {
    private String cnpj;
    private String razaoSocial;
    private String telefone;

    private Cliente cliente;
    private Produto produto;
    private Endereco endereco;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
   
    public Supermercado (String cnpj,String razaoSocial, String telefone, Cliente cliente,
    Produto produto, Endereco endereco ){
        this.cnpj=cnpj;
        this.razaoSocial=razaoSocial;
        this.telefone=telefone;
        this.cliente=cliente;
        this.produto=produto;
        this.endereco=endereco;   
    }
    
    public String toString(){
        return  "*** DADOS DO SUPERMERCADO ***" +
                "\n CNPJ: " + getCnpj()+ 
                "\n RAZÃO SOCIAL: " + getRazaoSocial()+
                "\n TELEFONE: " + getTelefone()+
                "\n CLIENTE: " + getCliente()+
                "\n PRODUTO: " + getProduto()+
                "\n ENDEREÇO: " + getEndereco();           
    }
    
}
