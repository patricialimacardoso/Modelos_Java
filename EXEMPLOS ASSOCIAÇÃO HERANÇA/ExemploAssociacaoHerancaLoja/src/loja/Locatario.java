
package loja;


public class Locatario {
    
    private String codigo;
    private String nome;
    private Contrato contrato;
    private Endereco endereco;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Locatario (String codigo, String nome, Contrato contrato, Endereco endereco){
        this.codigo=codigo;
        this.nome=nome;
        this.contrato=contrato;
        this.endereco=endereco;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO LOCATÁRIO <====" +
               "\n NOME: " + getNome()+ 
               "\n CÓDIGO: " + getCodigo()+
               "\n " + getContrato() +    
               "\n " + getEndereco();       
    } 
}
