
package exemploAnimal;


public class Telefone {
    private int DDD;
    private String numero;

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Telefone (int DDD, String numero){
        this.DDD=DDD;
        this.numero=numero;
    }
    
    public String toString(){
        return "\n DDD: " + getDDD()+ 
               "\n NÚMERO: " + getNumero() ;   
    }
}
