
package modeloInterfaceLaticinio;


public class Animal {
    private String tipo;
    private Double peso;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public Animal (String tipo, Double peso){
        this.tipo=tipo;
        this.peso=peso;
    }
}
