
package exemploFarmacia;


public class Atendente extends Funcionario{
    private int idade;


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Atendente(int matricula, String nome, Double salario, int idade) {
        super(matricula, nome, salario);
        this.idade=idade;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO ATENDENTE <====" +
               "\n MATRICULA: " + getMatricula()+ 
               "\n NOME: " + getNome()+
               "\n SALÁRIO: " + getSalario()+
               "\n IDADE: " + getIdade();     
    } 
}
