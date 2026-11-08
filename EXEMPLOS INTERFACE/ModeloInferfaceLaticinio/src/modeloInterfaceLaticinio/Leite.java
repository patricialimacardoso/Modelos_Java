
package modeloInterfaceLaticinio;


public abstract class Leite {
    private String qualidade;

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }
    
    public Leite (String qualidade){
        this.qualidade=qualidade;
    }
}
