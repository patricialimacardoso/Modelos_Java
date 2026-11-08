
package herancafuncionario;


public class DaLimpeza extends Temporario{
    private int idade;
    private String setor;

   

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
     public DaLimpeza(String nome, int numeroContrato, int idade, String setor) {
        super(nome, numeroContrato);
        this.idade=idade;
        this.setor=setor;
    }
    
     public String toString(){
        return "\n DADOS DO FUNCIONÁRIO " +
                "\n NOME: " + getNome() +
                "\n MUMERO DO CONTRATO: " + getNumeroContrato() +
                "\n IDADE: " + getIdade() +
                "\n SETOR: " + getSetor() ;
    }
}
