
package modeloInferface4;


public class Cliente implements QtdProduto{
    private String cpf;
    private String nome;
    
    private Tenis tenis;
    private Sandalia sandalia;
    private Vendedor vendedor;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tenis getTenis() {
        return tenis;
    }

    public void setTenis(Tenis tenis) {
        this.tenis = tenis;
    }

    public Sandalia getSandalia() {
        return sandalia;
    }

    public void setSandalia(Sandalia sandalia) {
        this.sandalia = sandalia;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public Cliente (String cpf, String nome, Tenis tenis, Sandalia sandalia, Vendedor vendedor){
        this.cpf=cpf;
        this.nome=nome;
        this.tenis=tenis;
        this.sandalia=sandalia;
        this.vendedor=vendedor;
    }
    
    public static Double totalPagar(){
        return ((QTDTENIS * (Tenis.precoTenis + (Tenis.precoTenis * 0.27))) + (QTDSANDALIA * (Sandalia.precoSandalia + (Sandalia.precoSandalia * 0.31))));
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =========> DADOS DO CLIENTE <==========" + 
               "\n =======================================" +
               "\n NOME:" + getNome()+
               "\n CPF:" + getCpf()+
                         getTenis() +
                         getSandalia() +
                         getVendedor() +
               "\n TOTAL A PAGAR:" + totalPagar();
    }
}
