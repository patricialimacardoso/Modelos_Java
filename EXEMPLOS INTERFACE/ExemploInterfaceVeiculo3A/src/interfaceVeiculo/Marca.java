
package interfaceVeiculo;


public class Marca {
    private String cnpj;
    private String paisOrigem;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    
    public Marca(String cnpj, String paisOrigem){
        this.cnpj=cnpj;
        this.paisOrigem=paisOrigem;
    }
    
    public String toString(){
        return "\n CNPJ:" + getCnpj()+
               "\n PAÍS ORIGEM:" + getPaisOrigem();
    }
}
