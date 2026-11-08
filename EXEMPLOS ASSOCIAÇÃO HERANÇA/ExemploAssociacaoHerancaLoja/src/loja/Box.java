
package loja;


public class Box {
    private int numero;
    private String descricao;
    
    private Locatario locatario;
    private Produto produto;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Box (int numero, String descricao, Locatario locatario, Produto produto){
        this.numero=numero;
        this.descricao=descricao;
        this.locatario=locatario;
        this.produto=produto;
    }
    
    public String toString(){
        return "\n" +
               "====> BOX <====" +
               "\n NÚMERO: " + getNumero()+ 
               "\n DESCRIÇÃO: " + getDescricao()+
               "\n " + getLocatario()+ 
               "\n " + getProduto();       
    } 
}
