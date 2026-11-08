
package interfacePessoa;


public class Impressao extends Servico {
    private Double valorImpressao;

    public Double getValorImpressao() {
        return valorImpressao;
    }

    public void setValorImpressao(Double valorImpressao) {
        this.valorImpressao = valorImpressao;
    }
    
    public Impressao(String nome, Double valorImpressao){
        super(nome);
        this.valorImpressao=valorImpressao;
    }
    
    public Double totalPagar(){
        return (valorImpressao * Cliente.qtdPaginaImpressa);
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =========> DADOS DO SERVIÇO <==========" + 
               "\n ------------- IMPRESSÃO ---------------" +
               "\n =======================================" +
               "\n NOME:" + getNome()+
               "\n VALOR DA IMPRESSÃO:" + getValorImpressao()+
               "\n TOTAL A PAGAR:" + totalPagar() ;
    }
}
