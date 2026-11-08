
package modeloInterfaceLaticinio;


public class PropriedadeRural {
    private Double tamanhoHectares;
    private String cidade;
    private String estado;

    public Double getTamanhoHectares() {
        return tamanhoHectares;
    }

    public void setTamanhoHectares(Double tamanhoHectares) {
        this.tamanhoHectares = tamanhoHectares;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public PropriedadeRural (Double tamanhoHectares, String cidade, String estado){
        this.tamanhoHectares=tamanhoHectares;
        this.cidade=cidade;
        this.estado=estado;
    }
    
    public Double calculaImposto(){
        return (ProdutoRural.calculaValorRecebido() - (tamanhoHectares/ProdutoRural.qtdeLeite));
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n ====> DADOS DA PROPRIEDADE RURAL <=====" + 
               "\n =======================================" +
               "\n TAMANHO EM HECTARES:" + getTamanhoHectares()+
               "\n CIDADE:" + getCidade()+
               "\n ESTADO:" + getEstado()+
               "\n IMPOSTO:" + calculaImposto();
    }
}
