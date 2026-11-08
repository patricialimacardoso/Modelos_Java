
package exemploFarmacia;

public class Medicamento extends Produto {
    private String tarja;
    private String doenca;

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }
    
    public Medicamento(String codigo, String nome, Double preco, 
            Fornecedor fornecedor,String tarja, String doenca) {
        super(codigo, nome, preco, fornecedor);
        this.tarja=tarja;
        this.doenca=doenca;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO MEDICAMENTO <====" +
               "\n NOME DO MEDICAMENTO: " + getNome()+
               "\n CÓDIGO: " + getCodigo()+ 
               "\n PREÇO: " + getPreco()+
               "\n TARJA: " + getTarja()+
               "\n DOENÇA TRATADA: " + getDoenca();
    } 
}
