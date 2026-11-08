
package interfacePessoa;


public class Funcionario extends Pessoa implements Comissao{
    private int matr;
    private Double valorComissao;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public Double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(Double valorComissao) {
        this.valorComissao = valorComissao;
    }
    
    public Funcionario(String cpf, String nome, Endereco endereco, int matr, Double valorComissao){
        super(cpf, nome, endereco);
        this.matr=matr;
        this.valorComissao=valorComissao;
    }
    
    public Double calculaSalComissao(){
        return (SAL + valorComissao);
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =========> DADOS DA PESSOA <===========" + 
               "\n ------------ FUNCIONÁRIO --------------" +
               "\n =======================================" +
               "\n NOME:" + getNome()+
               "\n CPF:" + getCpf()+
               "\n MATRÍCULA:" + getMatr() +
                        getEndereco() +
               "\n VALOR DA COMISSÃO:" + getValorComissao() +
               "\n SÁLARIO:" + SAL + 
               "\n SÁLARIO COM COMISSÃO:" + calculaSalComissao() +
               "\n =======================================" ;
    }
    
}
