
package classeAbstrataFuncionario;


public class Empresa {
    private String cnpj;
    private String nome;

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
    public Empresa (String cnpj, String nome){
        this.cnpj=cnpj;
        this.nome=nome;
    }
    
    public String toString (){
        return  "\n CNPJ: " + getCnpj()+
                "\n NOME: " + getNome();
    }
}
