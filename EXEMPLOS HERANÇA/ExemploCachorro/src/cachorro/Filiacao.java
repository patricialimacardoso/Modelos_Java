
package cachorro;

public class Filiacao {
    private String nomeDoPai;
    private String nomeDaMae;

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }
    
    public Filiacao(String nomeDoPai, String nomeDaMae){
        this.nomeDoPai=nomeDoPai;
        this.nomeDaMae=nomeDaMae;
    }
    
    public String toString (){
        return  "\n FILIAÇÃO DO CACHORRO" +
                "\n NOME DO PAI: " +getNomeDoPai() +
                "\n NOME DA MÃE: " +getNomeDaMae() ;
               
    }
}
