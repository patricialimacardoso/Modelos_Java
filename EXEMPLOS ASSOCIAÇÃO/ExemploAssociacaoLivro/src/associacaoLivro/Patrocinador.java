
package associacaoLivro;


public class Patrocinador {
    private String nome;
    private Editora editora;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Patrocinador(String nome, Editora editora, Endereco endereco){
        this.nome=nome;
        this.editora=editora;
        this.endereco=endereco;
        
    }
    
    public String toString(){
        return    "DADOS DO PATROCINADOR" +
                  "\n NOME: " + getNome () + 
                  "\n" +
                  "\n EDITORA " + getEditora() + 
                  "\n" +
                  "\n ENDEREÇO DO PATROCINADOR" + getEndereco();        
    }
        


          
}
