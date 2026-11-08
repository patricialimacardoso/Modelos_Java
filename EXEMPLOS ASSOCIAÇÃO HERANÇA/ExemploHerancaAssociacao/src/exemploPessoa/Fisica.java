
package exemploPessoa;


public class Fisica extends Pessoa{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
     public Fisica (String nome, Endereco endereco, String cpf){
         super(nome,endereco);
         this.cpf=cpf;
     }
    
    public String toString (){
        return "\n CPF: " + getCpf()+
               "\n NOME: " + getNome() +
               "\n ENDEREÇO DA PESSOA FÍSICA: " + getEndereco() ;
    }
}
