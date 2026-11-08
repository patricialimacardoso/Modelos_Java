
package exemploFarmacia;


public class Pagamento {
    private String forma;

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
    
    public Pagamento (String forma){
        this.forma=forma;
    }
    
    public String toString(){
        return  "\n" +
                "====> DADOS DO PAGAMENTO <====" +
                "\n FORMA: " + getForma();         
    } 
   
}
