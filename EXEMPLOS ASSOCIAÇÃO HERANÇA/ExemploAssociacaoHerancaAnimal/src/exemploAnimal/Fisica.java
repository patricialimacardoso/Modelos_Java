
package exemploAnimal;


public class Fisica extends Pessoa{
    private String cpf;
    private Profissao profissao;

   
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
    
     public Fisica(String nome,String cpf, Profissao profissao) {
        super(nome);
        this.cpf=cpf;
        this.profissao=profissao;
    }

    public String toString(){
        return "\n NOME DO DONO DO CACHRORRO: " + getNome() + 
               "\n CPF: " + getCpf()+
               "\n " +getProfissao();         
    }
   
    
}
