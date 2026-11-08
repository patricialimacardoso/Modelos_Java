
package modeloInterfaceLaticinio;


public class Bovino extends Leite{
    private String tipo;

    public Bovino(String qualidade, String tipo) {
        super(qualidade);
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n ==========> DADOS DO LEITE <===========" +
               "\n --------------- BOVINO ----------------" +
               "\n =======================================" +
               "\n QUALIDADE:" + getQualidade()+
               "\n TIPO:" + getTipo();
    }
}
