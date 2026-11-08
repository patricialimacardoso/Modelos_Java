
package modeloInterfaceLaticinio;


public class Atendente extends Funcionario implements ValeAlimentacao, Gratificacao{
    private int qtdeAtendimentos;
    
    private ProdutoRural produtoRural;

    public Atendente(int matricula, String nome, Double salario, int qtdeAtendimentos, 
            ProdutoRural produtoRural) {
        super(matricula, nome, salario);
        this.qtdeAtendimentos=qtdeAtendimentos;
        this.produtoRural=produtoRural;
    }

    public int getQtdeAtendimentos() {
        return qtdeAtendimentos;
    }

    public void setQtdeAtendimentos(int qtdeAtendimentos) {
        this.qtdeAtendimentos = qtdeAtendimentos;
    }

    public ProdutoRural getProdutoRural() {
        return produtoRural;
    }

    public void setProdutoRural(ProdutoRural produtoRural) {
        this.produtoRural = produtoRural;
    }
    
    public Double calculaSalarioFinal1(){
        return(salario + VALOR1 + VALORUNICO + (qtdeAtendimentos * 0.01));
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =======> DADOS DO FUNCIONÁRIO <========" +
               "\n ------------- ATENDENTE ---------------" +
               "\n =======================================" +
               "\n NOME:" + getNome()+
               "\n MATRÍCULA:" + getMatricula()+
               "\n SALÁRIO:" + getSalario()+
               "\n QUANTIDADE DE ATENDIMENTOS:" + getQtdeAtendimentos()+
               "\n CÁLCULO DO SALÁRIO FINAL 1:" + calculaSalarioFinal1()+
                        getProdutoRural();
    }
}
