
package modeloInterfaceLaticinio;


public class Vaca extends Animal{
    private String raca;
    private int idade;
    
    private Bovino bovino;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Bovino getBovino() {
        return bovino;
    }

    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }
    
    public Vaca(String tipo, Double peso, String raca, int idade, Bovino bovino) {
        super(tipo, peso);
        this.raca=raca;
        this.idade=idade;
        this.bovino=bovino;
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n ==========> DADOS DO ANIMAL <==========" +
               "\n ---------------- VACA -----------------" +
               "\n =======================================" +
               "\n TIPO:" + getTipo()+
               "\n PESO:" + getPeso()+
               "\n RAÇA:" + getRaca()+
               "\n IDADE:" + getIdade()+
                        getBovino();
    }
    
}
