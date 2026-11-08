
package classeAbstrataFuncionario;


public class Patrao {
    private String nome;
    private int idade;
    
    private Empresa empresa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public Patrao (String nome, int idade, Empresa empresa){
        this.nome=nome;
        this.idade=idade;
        this.empresa=empresa;
    }
    
    public String toString (){
        return  "\n =======================================" +
                "\n ==========> DADOS DO PATRÃO <==========" +
                "\n ---------------------------------------" +
                "\n NOME: " + getNome()+
                "\n IDADE: " + getIdade()+
                "\n ---------------------------------------" +
                "\n ==========> DADOS DA EMPRESA <=========" +
                "\n ---------------------------------------" +
                "\n " + getEmpresa()+
                "\n ---------------------------------------" ;
    }
}
