
package autoEscola;


public class Aluno {
    private String cpf;
    private String nome;
    private String endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    
    public Aluno (String cpf, String nome, String endereco){
        this.cpf=cpf;
        this.nome=nome;
        this.endereco=endereco;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO ALUNO <====" +
               "\n NOME: " + getNome()+ 
               "\n CPF: " + getCpf()+   
               "\n ENDEREÇO: " + getEndereco();         
    } 
}
