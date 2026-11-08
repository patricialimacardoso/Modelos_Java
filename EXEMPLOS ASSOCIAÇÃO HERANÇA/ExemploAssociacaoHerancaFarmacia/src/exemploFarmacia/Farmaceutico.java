
package exemploFarmacia;


public class Farmaceutico extends Funcionario{
    private String formacao;

    public Farmaceutico(int matricula, String nome, Double salario, String formacao) {
        super(matricula, nome, salario);
        this.formacao=formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO FARMACEUTICO <====" +
               "\n NOME: " + getNome()+ 
               "\n MATRICULA: " + getMatricula()+
               "\n SALÁRIO: " + getSalario() +  
               "\n FORMAÇÃO: " + getFormacao();
    } 
}
