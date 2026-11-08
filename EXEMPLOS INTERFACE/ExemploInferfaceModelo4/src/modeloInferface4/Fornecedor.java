
package modeloInferface4;


public abstract class Fornecedor {
    private String nome;
    protected Double totalArrecadado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTotalArrecadado() {
        return totalArrecadado;
    }

    public void setTotalArrecadado(Double totalArrecadado) {
        this.totalArrecadado = totalArrecadado;
    }
    
    public Fornecedor(String nome, Double totalArrecadado){
        this.nome=nome;
        this.totalArrecadado=totalArrecadado;
    }
}
