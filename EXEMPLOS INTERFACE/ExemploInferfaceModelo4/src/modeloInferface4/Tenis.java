
package modeloInferface4;

public class Tenis extends Calcado implements Custo{
    private String marca;
    private int tamanho;
    protected static Double precoTenis;
    
    private DeSapatoMasculino deSapatoMasculino;
    private DeSapatoFeminino deSapatoFeminino;
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPrecoTenis() {
        return precoTenis;
    }

    public void setPrecoTenis(Double precoTenis) {
        Tenis.precoTenis = precoTenis;
    }

    public DeSapatoMasculino getDeSapatoMasculino() {
        return deSapatoMasculino;
    }

    public void setDeSapatoMasculino(DeSapatoMasculino deSapatoMasculino) {
        this.deSapatoMasculino = deSapatoMasculino;
    }

    public DeSapatoFeminino getDeSapatoFeminino() {
        return deSapatoFeminino;
    }

    public void setDeSapatoFeminino(DeSapatoFeminino deSapatoFeminino) {
        this.deSapatoFeminino = deSapatoFeminino;
    }
    
    public Tenis(String codigo, String modelo, String marca, int tamanho, Double precoTenis, 
            DeSapatoMasculino deSapatoMasculino, DeSapatoFeminino deSapatoFeminino){
        super(codigo, modelo);
        this.marca=marca;
        this.tamanho=tamanho;
        this.precoTenis=precoTenis;
        this.deSapatoMasculino=deSapatoMasculino;
        this.deSapatoFeminino=deSapatoFeminino;
    }
    
    @Override
    public Double precoFinal(){
         return (precoTenis + (precoTenis * 0.27));
     }
    
    public Double calculaValorCusto(){
        return (precoFinal() - (precoFinal() *PERCTENIS));
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =========> DADOS DO CALÇADO <==========" + 
               "\n ---------------- TÊNIS ----------------" +
               "\n =======================================" +
               "\n CÓDIGO:" + getCodigo()+
               "\n MODELO:" + getModelo()+
               "\n MARCA:" + getMarca()+
               "\n TAMANHO:" + getTamanho()+
               "\n PREÇO:" + getPrecoTenis()+
               "\n VALOR DO CUSTO:" + calculaValorCusto()+
               "\n PREÇO FINAL:" + precoFinal()+
                        getDeSapatoMasculino() +
                        getDeSapatoFeminino();
    }
}
