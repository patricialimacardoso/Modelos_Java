
package modeloInferface4;


public class DeSapatoMasculino extends Fornecedor implements Imposto{
    private String estilo;
    private String telefone;

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public DeSapatoMasculino(String nome, Double totalArrecadado, String estilo, String telefone){
        super(nome, totalArrecadado);
        this.estilo=estilo;
        this.telefone=telefone;
    }
    
    public Double calculaImposto(){
        return (totalArrecadado * TARIFAM);
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =======> DADOS DO FORNECEDOR <=========" + 
               "\n -------- DE SAPATO MASCULINO ----------" +
               "\n =======================================" +
               "\n NOME:" + getNome()+
               "\n ESTILO:" + getEstilo()+
               "\n TELEFONE:" + getTelefone()+
               "\n TOTAL ARRECADADO:" + getTotalArrecadado()+
               "\n IMPOSTO:" + calculaImposto();
    }
}
