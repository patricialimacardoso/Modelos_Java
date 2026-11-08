
package exemploShopping;


public class Box {
    private int numero;
    private String descricao;
    protected static Double valorAluguel;
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

    public Double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(Double valorAluguel) {
        this.valorAluguel = valorAluguel;
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
    
    public Box(int numero, String descricao, Double valorAluguel, 
            Locatario locatario, Produto produto){
        this.numero=numero;
        this.descricao=descricao;
        this.valorAluguel=valorAluguel;
        this.locatario=locatario;
        this.produto=produto;
    }
    
    public static Double calculaDesconto(){
        return (valorAluguel*0.01);
    }
    
    public static Double calculaValorFinal(){
        return (valorAluguel-calculaDesconto());
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n ===========> DADOS DO BOX <===========" + 
                "\n =======================================" +
                "\n NÚMERO: " + getNumero() +
                "\n DESCRIÇÃO: " + getDescricao() +
                "\n VALOR DO ALUGUEL: " + getValorAluguel() +
                "\n DESCONTO: " + calculaDesconto() +
                "\n VALOR FINAL DO ALUGUEL: " + calculaValorFinal() +
                                getLocatario() +
                                getProduto() +
                "\n =======================================" ;
    }
}
