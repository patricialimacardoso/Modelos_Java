
package autoEscola;


public class Teorica extends Aula{
    private String conteudo;

    
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    public Teorica(String data,String conteudo) {
        super(data);
        this.conteudo=conteudo;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DA AULA TEÓRICA <====" +
               "\n DATA: " + getData()+ 
               "\n CONTEÚDO: " + getConteudo();
    } 
}
