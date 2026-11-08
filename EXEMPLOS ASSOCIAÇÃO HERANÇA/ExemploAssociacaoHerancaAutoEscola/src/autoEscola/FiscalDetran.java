
package autoEscola;


public class FiscalDetran {
    private int matricula;
    private String nome;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public FiscalDetran (int matricula, String nome){
        this.matricula=matricula;
        this.nome=nome;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO FISCAL DO DETRAN <====" +
               "\n NOME: " + getNome()+ 
               "\n MATRICULA: " + getMatricula();                   
    } 
}
