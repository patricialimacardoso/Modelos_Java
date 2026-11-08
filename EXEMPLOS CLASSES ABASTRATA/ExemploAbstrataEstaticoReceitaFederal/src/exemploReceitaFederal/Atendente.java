
package exemploReceitaFederal;


public class Atendente extends Funcionario{
    private String setor;
    private Fisica fisica;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }
    
    public Atendente (int matricula, String nome, Double salario, String setor, Fisica fisica){
        super(matricula, nome, salario);
        this.setor=setor;
        this.fisica=fisica;
    }
    
    public Double calculaSalario(){
        return (salario + (salario*0.15));
    }
    
     public String toString(){
        return  "\n =======================================" +
                "\n =======> DADOS DO FUNCIONÁRIO <========" + 
                "\n ---------------------------------------" +
                "\n -------------> ATENDENTE <-------------" + 
                "\n ---------------------------------------" +
                "\n =======================================" +
                "\n NOME: " + getNome() +
                "\n MATRICULA: " + getMatricula() +
                "\n SALARIO: " + getSalario() +
                "\n SETOR: " + getSetor() +
                               getFisica()  ;
    }
}
