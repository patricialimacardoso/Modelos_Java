
package modeloInferface4;


public class DeSapatoFeminino extends Fornecedor implements Imposto{
    private String faixaEtaria;

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
    
    public DeSapatoFeminino(String nome, Double totalArrecadado, String faixaEtaria){
        super(nome, totalArrecadado);
        this.faixaEtaria=faixaEtaria;
    }
    
    public Double calculaImposto(){
        return (totalArrecadado * TARIFAF);
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =======> DADOS DO FORNECEDOR <=========" + 
               "\n -------- DE SAPATO FEMININO -----------" +
               "\n =======================================" +
               "\n NOME:" + getNome()+
               "\n FAIXA ETÁRIA:" + getFaixaEtaria()+
               "\n TOTAL ARRECADADO:" + getTotalArrecadado()+
               "\n IMPOSTO:" + calculaImposto();
    }
}
