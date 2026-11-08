
package modeloInterfaceLaticinio;


public class ProdutoRural implements ValorLeite{
    private int codigo;
    private String nome;
    protected static int qtdeLeite;
    
    private Vaca vaca;
    private Ovelha ovelha;
    private NotaFiscal notaFiscal;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeLeite() {
        return qtdeLeite;
    }

    public void setQtdeLeite(int qtdeLeite) {
        this.qtdeLeite = qtdeLeite;
    }

    public Vaca getVaca() {
        return vaca;
    }

    public void setVaca(Vaca vaca) {
        this.vaca = vaca;
    }

    public Ovelha getOvelha() {
        return ovelha;
    }

    public void setOvelha(Ovelha ovelha) {
        this.ovelha = ovelha;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    
    public ProdutoRural (int codigo, String nome, int qtdeLeite, 
            Vaca vaca, Ovelha ovelha, NotaFiscal notaFiscal){
        this.codigo=codigo;
        this.nome=nome;
        this.qtdeLeite=qtdeLeite;
        this.vaca=vaca;
        this.ovelha=ovelha;
        this.notaFiscal=notaFiscal;
    }
    
    public static Double calculaValorRecebido(){
        return (qtdeLeite * VALOR);
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =======> DADOS DO PRODUTO RURAL <======" +
               "\n =======================================" +
               "\n NOME:" + getNome()+
               "\n CÓDIGO:" + getCodigo()+
               "\n QUANTIDADE DE LEITE:" + getQtdeLeite()+
               "\n VALOR RECEBIDO:" + calculaValorRecebido()+ 
                        getVaca()+
                        getOvelha()+
                        getNotaFiscal();
    }
}
