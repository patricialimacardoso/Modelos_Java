
package herancaagencia;

public class Acomodacao extends Praia{
    private String quantidadeDePessoas;
    private String quarto;

    public Acomodacao(String nome, String cnpj, String cidade, String pais, String dataIda, String dataVolta,String quantidadeDePessoas, String quarto) {
        super(nome, cnpj, cidade, pais, dataIda, dataVolta);
        this.quantidadeDePessoas=quantidadeDePessoas;
        this.quarto=quarto;
    }

    public String getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    public void setQuantidadeDePessoas(String quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }
    
    public String toString(){
        return "DADOS DA VIAGEM: " +
               "\n NOME DA EMPRESA: " + getNome () +
               "\n CNPJ: " + getCnpj () +
               "\n DESTINO: " + getCidade()  +
               "\n PAÍS: " + getPais () + 
               "\n DATA DE IDA: " + getDataIda()  + 
               "\n DATA DE VOLTA: " + getDataVolta() +
               "\n QUANTIDADE DE PESSOAS: " + getQuantidadeDePessoas()+
               "\n TIPO DE QUARTO: " + getQuarto();
    }
    
}
