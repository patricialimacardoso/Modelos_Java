
package classeAbstrataFuncionario;


public abstract class Funcionario {
    
    private String matr;
    private String nome;
    private String endereco;
    
    private Patrao patrao;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Patrao getPatrao() {
        return patrao;
    }

    public void setPatrao(Patrao patrao) {
        this.patrao = patrao;
    }
    
    public Funcionario (String matr, String nome, String endereco, Patrao patrao){
        this.matr=matr;
        this.nome=nome;
        this.endereco=endereco;
        this.patrao=patrao;
    }
    
    public abstract Double comissao();
    public abstract Double inss();
    public abstract Double salarioFinal();
    
    public abstract String toString();
}
