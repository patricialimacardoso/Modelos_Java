

package herancaveiculo;


public class Gol extends Leve{
   
    private String marca;
    private Double kmRodados;
    private int qtdPassageiros;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(Double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
    
    public Gol(int chassi, int ano, int qtdPortas, String marca, Double kmRodados, int qtdPassageiros) {
        super(chassi, ano, qtdPortas);
        this.marca=marca;
        this.kmRodados=kmRodados;
        this.qtdPassageiros=qtdPassageiros;
    }
    
    @Override
    public String toString(){
        return "\n DADOS DO VEICULO GOL " +
                "\n MARCA: " + getMarca() +
                "\n KM RODADOS: " + getKmRodados() +
                "\n CHASSI: " + getChassi() +
                "\n ANO: " + getAno() +
                "\n QUANTIDADE DE PASSAGEIROS: " + getQtdPassageiros();
         
    }
}
