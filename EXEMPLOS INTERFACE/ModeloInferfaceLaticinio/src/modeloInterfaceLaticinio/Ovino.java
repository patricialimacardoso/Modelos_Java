
package modeloInterfaceLaticinio;


public class Ovino extends Leite{
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Ovino(String qualidade, String descricao) {
        super(qualidade);
        this.descricao=descricao;
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n ==========> DADOS DO LEITE <===========" +
               "\n --------------- OVINO -----------------" +
               "\n =======================================" +
               "\n QUALIDADE:" + getQualidade()+
               "\n DESCRIÇÃO:" + getDescricao();
    }
}
