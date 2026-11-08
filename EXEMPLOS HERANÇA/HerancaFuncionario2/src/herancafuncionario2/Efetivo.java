
package herancafuncionario2;


public class Efetivo extends Funcionario{
    private String matricula;
    private Double salario;

    public Efetivo(String nome, String matricula, Double salario) {
        super(nome);
        this.matricula=matricula;
        this.salario=salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public String toString(){
        return "DADOS DO PROFESSOR: " +
               "\n NOME: " + getNome () +
               "\n MATRICULA:  " + getMatricula () +
               "\n SALÁRIO: " + getSalario () + " REAIS";
    }
 
}
