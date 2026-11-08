
package modeloInferface4;


public abstract class Calcado {
    private String codigo;
    private String modelo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Calcado(String codigo, String modelo){
        this.codigo=codigo;
        this.modelo=modelo;
    }
    
    public abstract Double precoFinal();
    public abstract String toString();
}
