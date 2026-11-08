
package herancafuncionario;


public class Temporario extends Funcionario {
    
    private int numeroContrato;
    

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }
    
    public Temporario(String nome, int numeroContrato) {
        super(nome);
        this.numeroContrato=numeroContrato;
        
    } 
    
}
