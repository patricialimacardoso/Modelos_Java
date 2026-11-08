
package interfaceVeiculo;


public abstract class Veiculo {
    private int ano;
    protected Double preco;
    protected Double km;
    private Proprietario proprietario;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
    public Veiculo(int ano, Double preco, Double km, Proprietario proprietario){
        this.ano=ano;
        this.preco=preco;
        this.km=km;
        this.proprietario=proprietario;
    }
}
