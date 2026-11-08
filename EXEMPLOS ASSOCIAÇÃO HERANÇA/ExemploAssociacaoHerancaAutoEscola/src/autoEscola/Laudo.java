
package autoEscola;


public class Laudo {
    private String data;
    private String resultado;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public Laudo (String data, String resultado){
        this.data=data;
        this.resultado=resultado;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO LAUDO <====" +
               "\n DATA: " + getData()+ 
               "\n RESULTADO: " + getResultado();  
    } 
}
