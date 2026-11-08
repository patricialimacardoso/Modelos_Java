
package exemploFarmacia;


public class Cliente {
    private String cpf;
    private String nome;
    private String dataNasci;
    
    private Receita receita;
    private Pedido pedido;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasci() {
        return dataNasci;
    }

    public void setDataNasci(String dataNasci) {
        this.dataNasci = dataNasci;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public Cliente (String cpf, String nome, String dataNasci, Receita receita, Pedido pedido){
        this.cpf=cpf;
        this.nome=nome;
        this.dataNasci=dataNasci;
        this.receita=receita;
        this.pedido=pedido;
    }
    
    @Override
    public String toString(){
        return "\n" +
               "====> DADOS DO CLIENTE <====" +
               "\n NOME: " + getNome()+ 
               "\n CPF: " + getCpf()+
               "\n DATA DE NASCIMENTO: " + getDataNasci()+
               "\n" + getReceita()+
               "\n" + getPedido();     
    } 
}
