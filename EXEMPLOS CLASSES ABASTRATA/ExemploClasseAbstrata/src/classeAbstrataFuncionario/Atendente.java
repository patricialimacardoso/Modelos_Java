
package classeAbstrataFuncionario;


public class Atendente extends Funcionario{
    private int idade;
    private String sexo;
    private Double salario;
    
    private AtendimentoEficaz atendimentoEficaz;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public AtendimentoEficaz getAtendimentoEficaz() {
        return atendimentoEficaz;
    }

    public void setAtendimentoEficaz(AtendimentoEficaz atendimentoEficaz) {
        this.atendimentoEficaz = atendimentoEficaz;
    }
    
    public Atendente (String matr, String nome, String endereco, Patrao patrao,
            int idade, String sexo, Double salario, AtendimentoEficaz atendimentoEficaz){
        super (matr, nome, endereco, patrao);
        this.idade=idade;
        this.sexo=sexo;
        this.salario=salario;
        this.atendimentoEficaz=atendimentoEficaz;
    }
    
     public Double comissao(){
        return (salario*0.05);
    }
    
    public Double inss(){
        return (salario*0.15);
    }
    
    public Double salarioFinal(){
        return (salario + comissao()-inss());
    }
    
    public String toString(){
        return  "\n ========================================" +
                "\n ==> DADOS DO FUNCIONÁRIO - ATENDENDE <==" +
                "\n ========================================" +
                "\n NOME: " + getNome() +
                "\n MATRÍCULA: " + getMatr() +
                "\n ENDEREÇO: " + getEndereco() +
                "\n IDADE: " + getIdade() +
                "\n SEXO: " + getSexo() +
                "\n SALÁRIO: " + getSalario() +
                "\n ----------------------------------------" +
                "\n ========================================" +
                "\n ==> DADOS DO CURSO ATENDIMENTO EFICAZ <=" +
                "\n ========================================" +
                "\n " + getAtendimentoEficaz() +
                "\n ----------------------------------------" +
                "\n COMISSÃO DO ATENDENTE: " + comissao() +
                "\n INSS DO ATENDENTE: " + inss() +
                "\n SALÁRIO FINAL DO ATENDENTE: " + salarioFinal() +
                "\n ========================================" ;
    }
    
}
