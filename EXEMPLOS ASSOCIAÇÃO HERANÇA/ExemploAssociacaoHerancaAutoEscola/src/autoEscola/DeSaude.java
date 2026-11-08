
package autoEscola;

public class DeSaude extends Exame{
    private String nomeMedico;
    private int qtdeExames;
    
    private Laudo laudo;

    
    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public int getQtdeExames() {
        return qtdeExames;
    }

    public void setQtdeExames(int qtdeExames) {
        this.qtdeExames = qtdeExames;
    }

    public Laudo getLaudo() {
        return laudo;
    }

    public void setLaudo(Laudo laudo) {
        this.laudo = laudo;
    }
    
    public DeSaude(String nome, Aluno aluno, String nomeMedico, int qtdeExames, Laudo laudo) {
        super(nome, aluno);
        this.nomeMedico=nomeMedico;
        this.qtdeExames=qtdeExames;
        this.laudo=laudo;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO EXAME <====" +
               "\n NOME DO EXAME: " + getNome()+ 
               "\n NOME DO MÉDICO: " + getNomeMedico()+ 
               "\n QUANTIDADE: " + getQtdeExames()+ 
               "\n ALUNO DO EXAME DE SAÚDE: " + getAluno()+
               "\n " + getLaudo();
    } 
}
