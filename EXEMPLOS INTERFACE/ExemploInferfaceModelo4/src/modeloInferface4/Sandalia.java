
package modeloInferface4;

public class Sandalia extends Calcado implements Custo{
    private String material;
    private String cor;
    protected static Double precoSandalia;
    
    private DeSapatoFeminino deSapatoFeminino;

    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPrecoSandalia() {
        return precoSandalia;
    }

    public void setPrecoSandalia(Double precoSandalia) {
        Sandalia.precoSandalia = precoSandalia;
    }

    public DeSapatoFeminino getDeSapatoFeminino() {
        return deSapatoFeminino;
    }

    public void setDeSapatoFeminino(DeSapatoFeminino deSapatoFeminino) {
        this.deSapatoFeminino = deSapatoFeminino;
    }
    
    public Sandalia(String codigo, String modelo, String material, String cor, 
            Double precoSandalia, DeSapatoFeminino deSapatoFeminino){
        super(codigo, modelo);
        this.material=material;
        this.cor=cor;
        Sandalia.precoSandalia=precoSandalia;
        this.deSapatoFeminino=deSapatoFeminino;
    }
    
    public Double precoFinal(){
         return (precoSandalia + (precoSandalia * 0.31));
     }
    
    public Double calculaValorCusto(){
        return (precoFinal() - (precoFinal() *PERCSANDALIA));
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =========> DADOS DO CALÇADO <==========" + 
               "\n --------------- SANDÁLIA --------------" +
               "\n =======================================" +
               "\n CÓDIGO:" + getCodigo()+
               "\n MODELO:" + getModelo()+
               "\n MATERIAL:" + getMaterial()+
               "\n COR:" + getCor()+
               "\n PREÇO:" + getPrecoSandalia()+
               "\n VALOR DO CUSTO:" + calculaValorCusto()+
               "\n PREÇO FINAL:" + precoFinal()+
                        getDeSapatoFeminino();
    }
}
