
package classeAbstrataVeiculo;


public class DePasseio extends Veiculo{
    
    private String marca;
    private String descricao;
    
    private Montadora montadora;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
    
    public DePasseio (String placa, int ano, String cor, Double preco, Proprietario proprietario,
            String marca, String descricao, Montadora montadora){
        super(placa, ano, cor, preco, proprietario);
        this.marca=marca;
        this.descricao=descricao;
        this.montadora=montadora;
    }
    
    public Double ipva(){
        return (preco*0.03);
    }
    
    public Double seguro(){
        return (preco*0.015);
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n ====> DADOS DO VEÍCULO DE PASSEIO <====" +
                "\n ---------------------------------------" +
                "\n PLACA: " + getPlaca() +
                "\n ANO: " + getAno() +
                "\n COR: " + getCor() +
                "\n PREÇO: " + getPreco() +
                "\n MARCA: " + getMarca() +
                "\n DESCRIÇÃO: " + getDescricao() +
                "\n ---------------------------------------" +
                "\n          MONTADORA DO VEICULO " + getMontadora() +
                "\n ---------------------------------------" +
                "\n        PROPRIETÁRIO DO VEICULO " + getProprietario() +
                "\n ---------------------------------------" +
                "\n VALOR DO IPVA: " + ipva() +
                "\n VALOR DO SEGURO: " + seguro() +
                "\n =======================================" ;
    }
}
