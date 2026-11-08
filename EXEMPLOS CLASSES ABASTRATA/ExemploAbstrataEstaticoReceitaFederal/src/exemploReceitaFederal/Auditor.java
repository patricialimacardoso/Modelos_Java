
package exemploReceitaFederal;


public class Auditor extends Funcionario{
    protected static Double gratificacao;
    
    private Auditoria auditoria;

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Auditoria getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(Auditoria auditoria) {
        this.auditoria = auditoria;
    }
    
    public Auditor(int matricula, String nome, Double salario, Double gratificacao, Auditoria auditoria) {
        super(matricula, nome, salario);
        this.gratificacao=gratificacao;
        this.auditoria=auditoria;
    }
    
    public Double calculaSalario(){
        return (salario+(salario*gratificacao)+gratificacao);
    }
    
     public String toString(){
        return  "\n =======================================" +
                "\n =======> DADOS DO FUNCIONÁRIO <========" + 
                "\n ---------------------------------------" +
                "\n -------------> AUDITOR <---------------" +
                "\n ---------------------------------------" +
                "\n =======================================" +
                "\n NOME: " + getNome() +
                "\n MATRICULA: " + getMatricula() +
                "\n SALARIO: " + getSalario() +
                "\n GRATIFICAÇÃO: " + getGratificacao() +
                "\n ===========>  AUDITORIA  <=============" + 
                "\n =======================================" +
                                getAuditoria()  +
                "\n =======================================" ;
        
    }
}
