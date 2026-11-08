
package interfacePessoa;


public class Internet extends Servico implements HoraExtra{
    private Double valorHora;

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    
    public Internet (String nome, Double valorHora){
        super(nome);
        this.valorHora = valorHora;
    }
    
    public Double totalPagar(){
        return (valorHora * QTDHORAEXTRA);
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =========> DADOS DO SERVIÇO <==========" + 
               "\n -------------- INTERNET ---------------" +
               "\n =======================================" +
               "\n NOME:" + getNome()+
               "\n VALOR HORA:" + getValorHora()+
               "\n QUANTIDADE DE HORA EXTRA:" + QTDHORAEXTRA +
               "\n VALOR DA HORA EXTRA:" + VALORHORAEXTRA +
               "\n TOTAL A PAGAR:" + totalPagar() ;
    }
}
