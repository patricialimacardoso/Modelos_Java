
package exemploFarmacia;

public class Fornecedor {
    private String cnpj;
    private String nome;
    private String endereco;

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Fornecedor (String cnpj, String nome, String endereco){
        this.cnpj=cnpj;
        this.nome=nome;
        this.endereco=endereco;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO FORNECEDOR <====" +
               "\n CNPJ: " + getCnpj()+ 
               "\n NOME: " + getNome()+
               "\n ENDEREÇO: " + getEndereco();       
    } 
}
