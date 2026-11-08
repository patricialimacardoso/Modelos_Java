
package herancafuncionario;


public class TecnicoAdministrativo extends Efetivo{
    private String setor;
    private String escolaridade;

    public TecnicoAdministrativo(String nome, String matricula, Double salario, String setor, String escolaridade) {
        super(nome, matricula, salario);
        this.setor=setor;
        this.escolaridade=escolaridade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
   
    public String toString(){
        return "\n DADOS DO FUNCIONÁRIO " +
                "\n NOME: " + getNome() +
                "\n MATRICULA: " + getMatricula() +
                "\n SALÁRIO: " + getSalario() +
                "\n SETOR: " + getSetor() +
                "\n ESCOLARIDADE: " + getEscolaridade();
    }
    
    
}
