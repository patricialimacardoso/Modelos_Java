
package exemploAnimal;


public class Juridica extends Pessoa{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public Juridica (String nome, String cnpj){
        super (nome);
        this.cnpj=cnpj;
    }
    
    public String toString(){
        return "\n CNPJ: " + getCnpj()+ 
               "\n " + getNome() ;   
    }
}
