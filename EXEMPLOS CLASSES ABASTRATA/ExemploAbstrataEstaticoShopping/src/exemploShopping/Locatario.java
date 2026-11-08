
package exemploShopping;

public class Locatario {
    private String codigo;
    private String nome;
    protected static Double taxaCondominio;
    
    private Contrato contrato;
    private Endereco endereco;
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTaxaCondominio() {
        return taxaCondominio;
    }

    public void setTaxaCondominio(Double taxaCondominio) {
        this.taxaCondominio = taxaCondominio;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Locatario(String codigo, String nome, Double taxaCondominio, 
            Contrato contrato, Endereco endereco){
        this.codigo=codigo;
        this.nome=nome;
        this.taxaCondominio=taxaCondominio;
        this.contrato=contrato;
        this.endereco=endereco;
    }
    public String toString(){
        return  "\n =======================================" +
                "\n =========> DADOS DO LOCATÁRIO <========" + 
                "\n =======================================" +
                "\n CÓDIGO: " + getCodigo() +
                "\n NOME: " + getNome() +
                "\n TAXA DE CONDOMÍNIO: " + getTaxaCondominio() +
                "\n =======================================" +
                "\n =========> DADOS DO CONTRATO <=========" + 
                "\n =======================================" +
                                getContrato() +
                "\n =======================================" +
                "\n =============> ENDEREÇO <==============" + 
                "\n =======================================" +
                                 getEndereco() +
                "\n =======================================" ;
    }
}
