
package interfaceVeiculo;


public class Palio extends Veiculo implements InterVeiculo, InterKm {
    private Double potencia;
    private int qtdVersoes;
    
    private Marca marca;

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }

    public int getQtdVersoes() {
        return qtdVersoes;
    }

    public void setQtdVersoes(int qtdVersoes) {
        this.qtdVersoes = qtdVersoes;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    public Palio(int ano, Double preco, Double km, Proprietario proprietario, 
            Double potencia, int qtdVersoes, Marca marca){
        super(ano, preco, km, proprietario);
        this.potencia=potencia;
        this.qtdVersoes=qtdVersoes;
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
               "\n ---------------- PALIO ----------------" +
               "\n =======================================" +
               "\n ANO:" + getAno()+
               "\n PREÇO:" + getPreco()+ 
               "\n KM:" + getKm()+
               "\n POTÊNCIA:" + getPotencia()+
               "\n QUANTIDADE DE VERSÕES:" + getQtdVersoes()+
               "\n MARCA" + getMarca()+
               "\n ESTADO:" + UF +
               "\n PROPRIETÁRIO:" + getProprietario()+
               "\n VALOR DI IPVA:" + calculaIpva()+
               "\n QUANTIDADE DE METROS RODADOS:" + calculaMetro()+
               "\n =======================================" ;
    }
}
