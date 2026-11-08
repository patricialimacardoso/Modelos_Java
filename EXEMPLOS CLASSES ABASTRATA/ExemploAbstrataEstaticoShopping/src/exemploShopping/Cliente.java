
package exemploShopping;


public class Cliente {
    private String cpf;
    private String nome;
    protected static Double tarifa;
    private Endereco endereco;

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

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Cliente(String cpf, String nome, Double tarifa, Endereco endereco){
        this.cpf=cpf;
        this.nome=nome;
        this.tarifa=tarifa;
        this.endereco=endereco;
    }
    
    public static Double calculaPrecoCliente(){
        return (Produto.calculaPrecoFinal()+ tarifa);
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n ==========> DADOS DO CLIENTE <=========" + 
                "\n =======================================" +
                "\n NOME: " + getNome() +
                "\n CPF: " + getCpf() +
                "\n TARIFA: " + getTarifa() +
                "\n PREÇO P/ O CLIENRTE: " + calculaPrecoCliente() +
                "\n =======================================" +
                "\n =============> ENDEREÇO <==============" + 
                "\n =======================================" +
                                 getEndereco() +
                "\n =======================================" ;
    }
}
