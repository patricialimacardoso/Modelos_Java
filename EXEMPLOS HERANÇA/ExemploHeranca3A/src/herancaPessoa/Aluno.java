
package herancaPessoa;


public class Aluno extends Pessoa{
    
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Aluno (String cpf, String nome, String matricula){
        super (cpf,nome);
        this.matricula = matricul;
    }
    public String toString(){
        return "DADOS DO ALUNO: " +
               "\n NOME: " + getCpf +
               "\n CPF: " + getNome +
               "\n MATRICULA: " + getMatricula;
  
    }
    
        
}
