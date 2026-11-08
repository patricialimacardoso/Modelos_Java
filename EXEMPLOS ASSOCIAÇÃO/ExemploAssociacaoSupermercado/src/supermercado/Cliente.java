
package supermercado;


public class Cliente {
    private String cpf;
    private String nome;
    private int idade;

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Cliente (String cpf, String nome, int idade){
        this.cpf=cpf;
        this.idade=idade;
        this.nome=nome;
    }
    
    public String toString(){
        return "\n CPF: " + getCpf()+ 
               "\n NOME: " + getNome()+
               "\n IDADE: " + getIdade();
    }
}
