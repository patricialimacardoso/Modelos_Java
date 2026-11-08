
package interfacePessoa;


public class Cliente extends Pessoa {
    private Double horasGastas;
    protected static int qtdPaginaImpressa;
    private Impressao impressao;
    private Internet internet;

    public Double getHorasGastas() {
        return horasGastas;
    }

    public void setHorasGastas(Double horasGastas) {
        this.horasGastas = horasGastas;
    }

    public int getQtdPaginaImpressa() {
        return qtdPaginaImpressa;
    }

    public void setQtdPaginaImpressa(int qtdPaginaImpressa) {
        this.qtdPaginaImpressa = qtdPaginaImpressa;
    }

    public Impressao getImpressao() {
        return impressao;
    }

    public void setImpressao(Impressao impressao) {
        this.impressao = impressao;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }
    
    public Cliente (String cpf, String nome, Endereco endereco, Double horasGastas, int qtdPaginaImpressa, 
            Impressao impressao, Internet internet){
        super(cpf, nome, endereco);
        this.horasGastas=horasGastas;
        this.qtdPaginaImpressa=qtdPaginaImpressa;
        this.impressao=impressao;
        this.internet=internet;
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =========> DADOS DA PESSOA <===========" + 
               "\n -------------- CLIENTE ----------------" +
               "\n =======================================" +
               "\n NOME:" + getNome()+
               "\n CPF:" + getCpf()+
                        getEndereco() +
               "\n HORAS GASTAS:" + getHorasGastas() +
               "\n QUANTIDADE DE PÁGINAS IMPRESSAS:" + getQtdPaginaImpressa() +
                        getImpressao() +
                        getInternet() ;
    }
}
