
package exemploReceitaFederal;

public class ParaPessoaFisica extends DeclaracaoImposto{
    private Double multa;
    
    private Dependente dependente;

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }
    
    public ParaPessoaFisica (int numero, int ano, Double valorDeclarado, 
            Deducao deducao, Pagamento pagamento, Bens bens, Double multa, Dependente dependente){
        super (numero, ano, valorDeclarado, deducao, pagamento, bens);
        this.multa=multa;
        this.dependente=dependente;
    }
    
    public static Double calculaParcial(){
        return (valorDeclarado + Bens.valor + Bens.calculaTarifacao());
    }
    
    public static Double calculaDesconto(){
        return (valorDeclarado - Pagamento.calculaTaxa() - Deducao.calculaDeducao());
    }
    
    public Double calculaImpostoPessoaFisica(){
        return (valorDeclarado + calculaParcial() - calculaDesconto());
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n =======> DECLARAÇÃO DE IMPOSTO  <======" + 
                "\n ----------- PESSOA FÍSICA -------------" +
                "\n =======================================" +
                "\n NÚMERO: " + getNumero() +
                "\n ANO: " + getAno() +
                "\n VALOR DECLARADO: " + getValorDeclarado() +
                "\n VALOR DA MULTA: "  + getMulta()          +
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
                "\n =======>  DADOS DO DEPENDENTE  <=======" + 
                "\n =======================================" +
                            getDependente() +
                "\n =======================================" +
                "\n CÁLCULO PARCIAL: " + calculaParcial()  +
                "\n =======================================" +
                "\n CÁLCULO DE DESCONTO: " + calculaDesconto()  +
                "\n =======================================" +
                "\n CÁLCULO DO IMPOSTO DA PESSOA FÍSICA: " 
                            + calculaImpostoPessoaFisica() ;
    }
}
