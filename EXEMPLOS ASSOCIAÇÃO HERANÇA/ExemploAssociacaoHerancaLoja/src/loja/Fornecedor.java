
package loja;


public class Fornecedor {
    private String cnpj;
    private String nome;
    
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Fornecedor (String cnpj, String nome, Endereco endereco){
        this.cnpj=cnpj;
        this.nome=nome;
        this.endereco=endereco;
    }
     
    
    public String toString(){
        return "\n" +
               "====> DADOS DO FORNECEDOR <====" +
               "\n NOME: " + getNome()+ 
               "\n CNPJ: " + getCnpj()+   
               "\n " + getEndereco();       
    } 
}
