
package modeloInferface4;

public class Vendedor extends Funcionario implements CalculaSalario{
    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public Vendedor (String matr, String nome, String setor){
        super(matr, nome);
        this.setor=setor;
    }
    
    public Double salarioReceber(){
        return (SALARIO + (Cliente.totalPagar() * 0.15) + AUXITRANSPORTE);
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =======> DADOS DO FUNCIONÁRIO <========" + 
               "\n --------------- VENDEDOR --------------" +
               "\n =======================================" +
               "\n NOME:" + getNome()+
               "\n MATRÍCULA:" + getMatr()+
               "\n SETOR:" + getSetor()+
               "\n SALÁRIO:" + SALARIO +
               "\n AUXÍLIO TRANSPORTE:" + AUXITRANSPORTE +
               "\n SALÁRIO A RECEBER:" + salarioReceber()+
               "\n =======================================" ;
    }
}
