
package interfaceVeiculo;

public class Gol extends Veiculo implements InterVeiculo, InterKm{
    private String modelo;
    private String cor;
    private Marca marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    public Gol(int ano, Double preco, Double km, Proprietario proprietario, 
            String modelo, String cor, Marca marca){
        super(ano, preco, km, proprietario);
        this.modelo=modelo;
        this.cor=cor;
        this.marca=marca;
    }
    
    public Double calculaIpva(){
        return (preco * 0.05);
    }
    
    public Double calculaMetro(){
        return (km * 1000);
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =========> DADOS DO VEÍCULO <==========" + 
               "\n ----------------- GOL -----------------" +
               "\n =======================================" +
               "\n MARCA" + getMarca()+
               "\n MODELO:" + getModelo()+
               "\n COR:" + getCor()+
               "\n ANO:" + getAno()+
               "\n KM:" + getKm()+
               "\n ESTADO:" + UF +
               "\n PROPRIETÁRIO:" + getProprietario()+
               "\n PREÇO:" + getPreco()+
               "\n VALOR DI IPVA:" + calculaIpva()+
               "\n QUANTIDADE DE METROS RODADOS:" + calculaMetro()+
               "\n =======================================" ;
    }
}
