
package herancaagencia;


public class Destino extends AgenciaDeViagens{
    private String cidade;
    private String pais;

    public Destino(String nome, String cnpj, String cidade,String pais) {
        super(nome, cnpj);
        this.cidade=cidade;
        this.pais=pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
