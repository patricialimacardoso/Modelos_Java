
package exemploAnimal;


public class Baleia extends Animal{
    private String especie;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public Baleia(int qtdAnos) {
        super(qtdAnos);
    }
    
    public Baleia(int qtdAnos, String especie) {
        super(qtdAnos);
        this.especie=especie;
    }
   
    public String toString(){
        return "\n ESPÉCIE: " + getEspecie()+ 
               "\n " + getQtdAnos() ;   
    }
}
