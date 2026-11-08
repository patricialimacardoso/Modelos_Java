
package autoEscola;


public class DeAulaPratica extends Instrutor {
    private String diaDeFolga;

   
    public String getDiaDeFolga() {
        return diaDeFolga;
    }

    public void setDiaDeFolga(String diaDeFolga) {
        this.diaDeFolga = diaDeFolga;
    }
    
    public DeAulaPratica(String cpf, String nome, String diaDeFolga) {
        super(cpf, nome);
        this.diaDeFolga=diaDeFolga;
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO INSTRUTOR Da AULA PRÁTICA <====" +
               "\n NOME: " + getNome()+ 
               "\n CPF: " + getCpf()+ 
               "\n DIA DE FOLGA: " + getDiaDeFolga();
    } 
}
