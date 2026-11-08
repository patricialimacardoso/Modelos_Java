
package modeloInferface4;


public abstract class Funcionario {
    private String matr;
    private String nome;

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
    
    public Funcionario (String matr, String nome){
        this.matr=matr;
        this.nome=nome;
    }
}
