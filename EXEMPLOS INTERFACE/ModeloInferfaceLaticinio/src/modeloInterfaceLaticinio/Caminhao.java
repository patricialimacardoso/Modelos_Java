
package modeloInterfaceLaticinio;


public class Caminhao implements Combustivel{
    
    private String placa;
    private String descricao;
    private Double kmRodados;
    private Double qtdeDieselGastos;
    
    private Ovino ovino;
    private Bovino bovino;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(Double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public Double getQtdeDieselGastos() {
        return qtdeDieselGastos;
    }

    public void setQtdeDieselGastos(Double qtdeDieselGastos) {
        this.qtdeDieselGastos = qtdeDieselGastos;
    }

    public Ovino getOvino() {
        return ovino;
    }

    public void setOvino(Ovino ovino) {
        this.ovino = ovino;
    }

    public Bovino getBovino() {
        return bovino;
    }

    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }
    
    public Caminhao (String placa, String descricao, Double kmRodados, Double qtdeDieselGastos, 
            Ovino ovino, Bovino bovino){
        this.placa=placa;
        this.descricao=descricao;
        this.kmRodados=kmRodados;
        this.qtdeDieselGastos=qtdeDieselGastos;
        this.ovino=ovino;
        this.bovino=bovino;
    }
    
    public Double calculaAutonomia(){
        return (qtdeDieselGastos / kmRodados);
    }
    
    public Double calculaValorGasto(){
        return (calculaAutonomia() * VALORDIESEL);
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =========> DADOS DO CAMINHÃO <=========" +
               "\n =======================================" +
               "\n PLACA:" + getPlaca()+
               "\n DESCRIÇÃO:" + getDescricao()+
               "\n KM RODADOS:" + getKmRodados()+
               "\n QUANTIDADE DE DIESEL GASTOS:" + getQtdeDieselGastos()+ 
               "\n CÁLCULO DA AUTONOMIA:" + calculaAutonomia()+
               "\n CÁLCULO DO VALOR GASTO:" + calculaValorGasto()+
                        getOvino()+
                        getBovino();
    }
}
