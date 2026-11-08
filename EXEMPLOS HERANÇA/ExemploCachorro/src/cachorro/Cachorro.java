
package cachorro;


public class Cachorro {
    private String codigo;
    private String nome;
    private String raca;
    
    private Proprietario proprietario;
    private Filiacao filiacao;

   
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }
    
     public Cachorro(String codigo, String nome, String raca,
                    Proprietario proprietario, Filiacao filiacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
        this.proprietario = proprietario;
        this.filiacao = filiacao;
    }
     
    public String toString() {
        return     "*** DADOS DO CACHORRO *** " + 
                   "\n NOME: " +getNome() +
                   "\n CÓDIGO: " + getCodigo() +
                   "\n RAÇA: " + getRaca() +
                   "\n--------------------------" +
                    getFiliacao()+
                   "\n--------------------------" +
                   getProprietario();
                   
                   
    }
   
}
