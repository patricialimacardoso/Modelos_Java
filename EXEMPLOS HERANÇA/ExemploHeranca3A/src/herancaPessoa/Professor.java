package herancaPessoa;


public class Professor extends Pessoa {
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

    public Professor(String cpf, String nome, String disciplina, Double salario) {
        super(cpf, nome);
        this.disciplina = disciplina;
        this.salario = salario;
    
    }
    
}
