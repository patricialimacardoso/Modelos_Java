
package autoEscola;

public class DoCursoTeorico extends Instrutor{
    private String nomeFormacao;

    
    public String getNomeFormacao() {
        return nomeFormacao;
    }

    public void setNomeFormacao(String nomeFormacao) {
        this.nomeFormacao = nomeFormacao;
    }
    
    public DoCursoTeorico(String cpf, String nome, String nomeFormacao) {
        super(cpf, nome);
        this.nomeFormacao=nomeFormacao;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO INSTRUTOR DO CURSO TEÓRICO <====" +
               "\n NOME: " + getNome()+ 
               "\n CPF: " + getCpf()+ 
               "\n FORMAÇÃO: " + getNomeFormacao();
    } 
}
