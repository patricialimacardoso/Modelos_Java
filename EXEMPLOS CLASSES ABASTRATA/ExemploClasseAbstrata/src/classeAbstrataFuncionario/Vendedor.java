
package classeAbstrataFuncionario;


public class Vendedor extends Funcionario{
    private String setor;
    private Double salario;
    
    private QualidadeTotal qualidadeTotal;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public QualidadeTotal getQualidadeTotal() {
        return qualidadeTotal;
    }

    public void setQualidadeToral(QualidadeTotal qualidadeTotal) {
        this.qualidadeTotal = qualidadeTotal;
    }
    
    public Vendedor (String matr, String nome, String endereco, Patrao patrao,
            String setor, Double salario, QualidadeTotal qualidadeTotal){
        super (matr, nome, endereco, patrao);
        this.setor=setor;
        this.salario=salario;
        this.qualidadeTotal=qualidadeTotal;
    }
    
    public Double comissao(){
        return (salario*0.25);
    }
    
    public Double inss(){
        return (salario*0.15);
    }
    
    public Double salarioFinal(){
        return (salario + comissao()-inss());
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n ==> DADOS DO FUNCIONÁRIO - VENDEDOR <==" +
                "\n =======================================" +
                "\n NOME: " + getNome() +
                "\n MATRÍCULA: " + getMatr() +
                "\n ENDEREÇO: " + getEndereco() +
                "\n SETOR: " + getSetor() +
                "\n SALÁRIO: " + getSalario() +
                "\n" +
                "\n =======================================" +
                "\n ===> DADOS DO CURSO QUALIDADE TOTAL <==" +
                "\n =======================================" +
                          getQualidadeTotal() +
                "\n COMISSÃO DO VENDEDOR: " + comissao() +
                "\n INSS DO VENDEDOR: " + inss() +
                "\n SALÁRIO FINAL DO VENDEDOR: " + salarioFinal() +
                "\n ========================================" ;
    }
    
}
