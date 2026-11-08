
package modeloInterfaceLaticinio;


public class Recepcionista extends Funcionario implements ValeAlimentacao, Gratificacao{
    private Double comissao;
    
    private Caminhao caminhao;
    
    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(Caminhao caminhao) {
        this.caminhao = caminhao;
    }
    
    public Recepcionista(int matricula, String nome, Double salario, Double comissao, Caminhao caminhao) {
        super(matricula, nome, salario);
        this.comissao=comissao;
        this.caminhao=caminhao;
    }
    
    public Double calculaSalarioFinal2(){
        return(salario + VALOR2 + VALORUNICO +getComissao());
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =======> DADOS DO FUNCIONÁRIO <========" +
               "\n ----------- RECEPCIONISTA -------------" +
               "\n =======================================" +
               "\n NOME:" + getNome()+
               "\n MATRÍCULA:" + getMatricula()+
               "\n SALÁRIO:" + getSalario()+
               "\n COMISSÃO:" + getComissao()+
               "\n CÁLCULO DO SALÁRIO FINAL 2:" + calculaSalarioFinal2()+
                        getCaminhao();
    }
}
