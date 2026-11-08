
package herancaagencia;


public class Cliente extends AgenciaDeViagens {
    private String name;
    private String cpf;

    public Cliente(String nome, String cnpj, String name, String cpf) {
        super(nome, cnpj);
        this.name=name;
        this.cpf=cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return "DADOS DO CLIENTE: " +
               "\n NOME: " + getName()  +
               "\n CPF: " + getCpf () ;
              
    }
}
