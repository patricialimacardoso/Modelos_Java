
package exemploShopping;


public class Atendente {
    private int matricula;
    private String nome;
    private Double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public Atendente(int matricula, String nome, Double salario){
        this.matricula=matricula;
        this.nome=nome;
        this.salario=salario;
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n =========> DADOS DO ATENDENTE <========" + 
                "\n =======================================" +
                "\n NOME: " + getNome() +
                "\n MATRÍCULA: " + getMatricula() +
                "\n SALÁRIO: " + getSalario() +
                "\n =======================================" ;
    }
}
