package herancaPessoa;

public class Funcionario extends Pessoa {
    private String cargo;
    private Double salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Funcionario (String cpf, String nome, String cargo, Double salario){
        super(cpf, nome);
        this.cargo=cargo;
        this.salario=salario;
    }
    
    public String toString(){
        return "DADOS DO FUNCIONARIO: " +
               "\n NOME: " + getCpf +
               "\n CPF: " + getNome +
               "\n CARGO: " + getCargo +
               "\n SALÁRIO: " + getSalario;
    }
}
