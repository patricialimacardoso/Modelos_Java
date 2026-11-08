
package herancaveiculo;

 
public class Leve extends Veiculo {
    
    private int qtdPortas;

    
    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
    public Leve(int chassi, int ano, int qtdPortas) {
        super(chassi, ano);
        this.qtdPortas=qtdPortas;
    }
    
}

