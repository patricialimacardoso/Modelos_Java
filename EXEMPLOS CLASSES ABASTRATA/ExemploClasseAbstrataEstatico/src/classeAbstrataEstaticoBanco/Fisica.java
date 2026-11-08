
package classeAbstrataEstaticoBanco;

public class Fisica extends Pessoa{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Fisica (Double saldo, String nome, String telefone, Double limite, Double valorGasto, 
            Conta conta, CartaoCredito cartaoCredito, Endereco endereco,
            String cpf){
        super(saldo, nome, telefone, limite, valorGasto, conta, cartaoCredito, endereco);
        this.cpf=cpf;
    }
    
    public static Double saldoAtual(){
        return (saldo-valorGasto);
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n =======> DADOS DA PESSOA FÍSICA <======" +
                "\n =======================================" +
                "\n NOME: " + getNome() +
                "\n CPF: " + getCpf() +
                "\n TELEFONE: " + getTelefone() +
                "\n SALDO: " + getSaldo() +
                "\n LIMITE: " + getLimite() +
                "\n VALOR GASTO: " + getValorGasto() +
                "\n =======================================" +
                "\n =========>  DADOS DA CONTA  <==========" + 
                "\n =======================================" +
                            getConta() +
                "\n =======================================" +
                "\n ====>  DADOS DO CARTÃO DE CRÉDITO  <===" + 
                "\n =======================================" +
                            getCartaoCredito() +
                "\n =======================================" +
                "\n ============>  ENDEREÇO  <=============" +
                "\n =======================================" +
                            getEndereco() +
                "\n =======================================" +
                "\n =======>  SALDO ATUAL DA CONTA <=======" +
                "\n =======================================" +
                "\n SALDO ATUAL: "  + saldoAtual() +
                "\n =======================================" ;
    }
}
