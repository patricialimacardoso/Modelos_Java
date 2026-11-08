
package loja;

public class DeAlimentacao extends Loja{
    private String pais;
 
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public DeAlimentacao(int numero, String descricao, Atendente atendente, String pais) {
        super(numero, descricao, atendente);
        this.pais=pais;
    }
       
    public String toString(){
        return "\n" +
               "====> DADOS DA LOJA DE ALIMENTAÇÃO <====" +
               "\n NÚMERO: " + getNumero()+ 
               "\n DESCRIÇÃO: " + getDescricao()+
               "\n PAÍS" + getPais()+
               "\n " + getAtendente();     
    } 
   
}
