
package classeAbstrataFuncionario;


public class QualidadeTotal extends Curso{
    private String turno;
    private int qtdAula;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getQtdAula() {
        return qtdAula;
    }

    public void setQtdAula(int qtdAula) {
        this.qtdAula = qtdAula;
    }
    
    public QualidadeTotal (int codigo, String nome, Double valorHoraAula, Professor professor, 
            String tuno, int qtdAula){
       super(codigo, nome, valorHoraAula, professor);
       this.turno=turno;
       this.qtdAula=qtdAula;
    }
    
    public Double valorTotalDoCurso(){
        return (getQtdAula()*valorHoraAula);
    }
    
    public String toString(){
        return  "\n NOME: " + getNome() +
                "\n CÓDIGO: " + getCodigo() +
                "\n VALOR DA HORA AULA: " + getValorHoraAula() +
                "\n TURNO: " + getTurno() +
                "\n QUANTIDADE DE AULA: " + getQtdAula() +
                "\n" +
                "\n =======================================" +
                "\n =======>  DADOS DO PROFESSOR  <========" + 
                "\n =======================================" +
                getProfessor() +
                "\n VALOR TOTAL DO CURSO: " + valorTotalDoCurso() +
                "\n =======================================" +
                "\n" ;
    }
}
