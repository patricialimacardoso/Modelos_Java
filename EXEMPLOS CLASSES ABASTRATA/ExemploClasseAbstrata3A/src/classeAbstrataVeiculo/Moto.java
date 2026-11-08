
package classeAbstrataVeiculo;


public class Moto extends Veiculo{
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public Moto (String placa, int ano, String cor, Double preco, Proprietario proprietario, 
            int cilindrada){
        super(placa, ano, cor, preco, proprietario);
        this.cilindrada=cilindrada;
    }
    
    public Double ipva(){
        return (preco*0.08);
    }
    
    public Double seguro(){
        return (preco*0.05);
    }
    
    public String toString(){
        return  "\n =================================" +
                "\n ====> DADOS DO VEÍCULO MOTO <====" +
                "\n ---------------------------------" +
                "\n       DADOS DO VEÍCULO MOTO" +
                "\n PLACA: " + getPlaca() +
                "\n ANO: " + getAno() +
                "\n COR: " + getCor() +
                "\n PREÇO: " + getPreco() +
                "\n CILINDRADA: " + getCilindrada() +
                "\n ---------------------------------" +
                "\n       PROPRIETÁRIO DA MOTO " + getProprietario() +
                "\n ---------------------------------" +
                "\n VALOR DO IPVA: " + ipva() +
                "\n VALOR DO SEGURO: " + seguro() +
                "\n =================================" ;
    }
}
