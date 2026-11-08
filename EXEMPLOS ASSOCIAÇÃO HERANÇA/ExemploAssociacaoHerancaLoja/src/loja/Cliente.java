
package loja;

public class Cliente {
    
    private String cpf;
    private String nome;
    private Produto produto;

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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Cliente (String cpf, String nome, Produto produto){
        this.cpf=cpf;
        this.nome=nome;
        this.produto=produto;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO CLIENTE <====" +
               "\n NOME: " + getNome()+ 
               "\n CPF: " + getCpf()+
               "\n " + getProduto();       
    } 
}
