
package herancaagencia;

public class Campo extends Destino{
    private String dataIda;
    private String dataVolta;

    public Campo(String nome, String cnpj, String cidade, String pais, String dataIda,String dataVolta) {
        super(nome, cnpj, cidade, pais);
        this.dataIda=dataIda;
        this.dataVolta=dataVolta;
    }

    public String getDataIda() {
        return dataIda;
    }

    public void setDataIda(String dataIda) {
        this.dataIda = dataIda;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }

    public String toString(){
        return "DADOS DA VIAGEM: " +
               "\n NOME DA EMPRESA: " + getNome () +
               "\n CNPJ: " + getCnpj () +
               "\n DESTINO: " + getCidade()  +
               "\n PAÍS: " + getPais () + 
               "\n DATA DE IDA: " + getDataIda()  + 
               "\n DATA DE VOLTA: " + getDataVolta() ;
    }
    
    
}
