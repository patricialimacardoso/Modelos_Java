
package classeAbstrataFuncionario;

public class AtendimentoEficaz extends Curso {
    private int duracaoMeses;
    private int qtdProfessores;
    private int qtdAula;

    public int getDuracaoMeses() {
        return duracaoMeses;
    }

    public void setDuracaoMeses(int duracaoMeses) {
        this.duracaoMeses = duracaoMeses;
    }

    public int getQtdProfessores() {
        return qtdProfessores;
    }

    public void setQtdProfessores(int qtdProfessores) {
        this.qtdProfessores = qtdProfessores;
    }

    public int getQtdAula() {
        return qtdAula;
    }

    public void setQtdAula(int qtdAula) {
        this.qtdAula = qtdAula;
    }
    
    public AtendimentoEficaz (int codigo, String nome, Double valorHoraAula, Professor professor, 
            int duracaoMeses, int qtdProfessores, int qtdAula){
        super(codigo, nome, valorHoraAula, professor);
        this.duracaoMeses=duracaoMeses;
        this.qtdProfessores=qtdProfessores;
        this.qtdAula=qtdAula;
    }
    
    public Double valorTotalDoCurso(){
        return (qtdAula*valorHoraAula);
    }
    
    public String toString(){
        return  "\n =======================================" +
                "\n => DADOS DO CURSO ATENDIMENTO EFICAZ <=" +
                "\n =======================================" +
                "\n NOME: " + getNome() +
                "\n CÓDIGO: " + getCodigo() +
                "\n VALOR DA HORA AULA: " + getValorHoraAula() +
                "\n DURAÇÃO EM MESES: " + getDuracaoMeses() +
                "\n QUANTIDADE DE PROFESSORES: " + getQtdProfessores() +
                "\n QUANTIDADE DE AULA: " + getQtdAula() +
                "\n =======================================" +
                "\n =======>  DADOS DO PROFESSOR  <========" + 
                "\n =======================================" +
                           getProfessor() +
                "\n VALOR TOTAL DO CURSO: " + valorTotalDoCurso() +
                "\n =======================================" ;
    }
}
