
package exemploReceitaFederal;


public class ParaPessoaJuridica extends DeclaracaoImposto{
    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public ParaPessoaJuridica(int numero, int ano, Double valorDeclarado, Deducao deducao, 
            Pagamento pagamento, Bens bens, String observacao) {
        super(numero, ano, valorDeclarado, deducao, pagamento, bens);
        this.observacao=observacao;
    }
    
    public static Double calculaParcial(){
        return (valorDeclarado + (Bens.valor *2)+ Bens.calculaTarifacao());
    }
    
    public Double calculaImpostoPessoaJuridica(){
        return (calculaParcial() - Deducao.calculaDeducao() + Pagamento.valor + valorDeclarado);
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n =======> DECLARAÇÃO DE IMPOSTO  <======" + 
                "\n ---------- PESSOA JÚRIDICA ------------" +
                "\n =======================================" +
                "\n NÚMERO: " + getNumero() +
                "\n ANO: " + getAno() +
                "\n VALOR DECLARADO: " + getValorDeclarado() +
                "\n OBSERVAÇÃO: "  + getObservacao()         +
                "\n =======================================" +
                "\n =========>  DADOS DA DEDUÇÃO  <========" + 
                "\n =======================================" +
                            getDeducao() +
                "\n =======================================" +
                "\n =======>  DADOS DO PAGAMENTO  <========" + 
                "\n =======================================" +
                            getPagamento() +
                "\n =======================================" +
                "\n =========>  DADOS DOS BENS  <==========" + 
                "\n =======================================" +
                            getBens() +
                "\n =======================================" +
                "\n CÁLCULO PARCIAL: " + calculaParcial()  +
                "\n =======================================" +
                "\n CÁLCULO DO IMPOSTO DA PESSOA JURÍDICA: " + 
                            calculaImpostoPessoaJuridica() ;
    }
    
}
