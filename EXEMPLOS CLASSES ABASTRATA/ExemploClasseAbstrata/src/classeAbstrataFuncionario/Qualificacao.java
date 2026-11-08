
package classeAbstrataFuncionario;


public class Qualificacao {
    private String nome;
    private int duracao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public Qualificacao (String nome, int duracao){
        this.nome=nome;
        this.duracao=duracao;
    }
    
    public String toString (){
        return  "\n NOME: " + getNome()+
                "\n DURAÇÃO: " + getDuracao();
    }
}
