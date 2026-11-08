
package herancafuncionario;


public class Efetivo extends Funcionario{
    private String matricula;
    private Double salario;
    
  
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
      public Efetivo(String nome, String matricula, Double salario) {
        super(nome);
        this.matricula=matricula;
        this.salario=salario;
    }


}
