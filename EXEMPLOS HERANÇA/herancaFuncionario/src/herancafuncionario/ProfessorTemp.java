
package herancafuncionario;


public class ProfessorTemp extends Temporario{
    private String disciplina;
    private Double salario;

   

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
     public ProfessorTemp(String nome, int numeroContrato,String disciplina, Double salario) {
        super(nome, numeroContrato);
        this.disciplina=disciplina;
        this.salario=salario;
    }
     
    public String toString(){
        return "\n DADOS DO FUNCIONÁRIO " +
                "\n NOME: " + getNome() +
                "\n MUMERO DO CONTRATO: " + getNumeroContrato() +
                "\n DISCIPLINA: " + getDisciplina() +
                "\n SALÁRIO: " + getSalario() ;
    }
    
}
