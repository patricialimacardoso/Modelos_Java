
package classeAbstrataVeiculo;


public class Onibus extends Veiculo{
    private int qtdPassageiros;
    
    private Montadora montadora;

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
    
    public Onibus (String placa, int ano, String cor, Double preco, Proprietario proprietario, 
            int qtdPassageiros, Montadora montadora){
        super(placa, ano, cor, preco, proprietario);
        this.qtdPassageiros=qtdPassageiros;
        this.montadora=montadora;
    }
    
    public Double ipva(){
        return (preco*0.05);
    }
    
    public Double seguro(){
        return (preco*0.025);
    }
    
    public String toString(){
        return  "\n ===================================" +
                "\n ====> DADOS DO VEÍCULO ÔNIBUS <====" +
                "\n -----------------------------------" +
                "\n PLACA: " + getPlaca() +
                "\n ANO: " + getAno() +
                "\n COR: " + getCor() +
                "\n PREÇO: " + getPreco() +
                "\n QUANTIDADE DE PASSAGEIROS: " + getQtdPassageiros() +
                "\n -----------------------------------" +
                "\n       PROPRIETÁRIO DO ÔNIBUS " + getProprietario() +
                "\n -----------------------------------" +
                "\n        MONTADORA DO ÔNBIBUS " + getMontadora() +
                "\n -----------------------------------" +
                "\n VALOR DO IPVA: " + ipva() +
                "\n VALOR DO SEGURO: " + seguro() +
                "\n ===================================" ;
    }
}
