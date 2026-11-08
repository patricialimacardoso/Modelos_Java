
package interfacePessoa;

public class Tecnico extends Pessoa implements Salario, HoraExtra{
    private String matr;
    private Double gratificacao;
    private Equipamento equipamento;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    
    public Tecnico(String cpf, String nome, Endereco endereco, String matr, Double gratificacao, Equipamento equipamento){
        super(cpf, nome, endereco);
        this.matr=matr;
        this.gratificacao=gratificacao;
        this.equipamento=equipamento;
    }
    
    public Double calculaSalario(){
        return (SAL + gratificacao + (QTDHORAEXTRA * VALORHORAEXTRA));
    }
    
    public String toString(){
        return "\n =======================================" +
               "\n =========> DADOS DA PESSOA <===========" + 
               "\n -------------- TÉCNICO ----------------" +
               "\n =======================================" +
               "\n NOME:" + getNome()+
               "\n CPF:" + getCpf()+
               "\n MATRÍCULA:" + getMatr() +
                        getEndereco() +
               "\n SÁLARIO:" + SAL + 
               "\n GRATIFICAÇÃO:" + getGratificacao() +
               "\n QUANTIDADE DE HORA EXTRA:" + QTDHORAEXTRA +
               "\n VALOR DA HORA EXTRA:" + VALORHORAEXTRA +
               "\n CALCÚLO DO SÁLARIO:" + calculaSalario() + 
                        getEquipamento() ;
    }
}
