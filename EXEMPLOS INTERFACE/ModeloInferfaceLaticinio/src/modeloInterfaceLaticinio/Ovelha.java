
package modeloInterfaceLaticinio;


public class Ovelha extends Animal{
    
    private String descricao;
   
    private Ovino ovino;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Ovino getOvino() {
        return ovino;
    }

    public void setOvino(Ovino ovino) {
        this.ovino = ovino;
    }
    
    public Ovelha(String tipo, Double peso, String descricao, Ovino ovino) {
        super(tipo, peso);
        this.descricao=descricao;
        this.ovino=ovino;
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n ==========> DADOS DO ANIMAL <==========" +
               "\n --------------- OVELHA ----------------" +
               "\n =======================================" +
               "\n TIPO:" + getTipo()+
               "\n PESO:" + getPeso()+
               "\n DESCRIÇÃO:" + getDescricao()+
                        getOvino();
    }
}
