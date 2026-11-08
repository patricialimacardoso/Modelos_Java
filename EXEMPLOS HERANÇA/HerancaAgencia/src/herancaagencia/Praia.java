
package herancaagencia;


public class Praia extends Destino{
    private String dataIda;
    private String dataVolta;

    public Praia(String nome, String cnpj, String cidade, String pais, String dataIda, String dataVolta) {
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
    
    
}
