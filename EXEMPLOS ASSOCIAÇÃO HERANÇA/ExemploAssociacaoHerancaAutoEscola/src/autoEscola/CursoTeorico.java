
package autoEscola;


public class CursoTeorico {
    private String nome;
    
    private String dataInicio;
    private String dataTermino;
    private Double cargaHoraria;
    private Aluno aluno;
    private DoCursoTeorico doCursoTeorico;
    private Escrito escrito;
    private Teorica teorica;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public DoCursoTeorico getDoCursoTeorico() {
        return doCursoTeorico;
    }

    public void setDoCursoTeorico(DoCursoTeorico doCursoTeorico) {
        this.doCursoTeorico = doCursoTeorico;
    }

    public Escrito getEscrito() {
        return escrito;
    }

    public void setEscrito(Escrito escrito) {
        this.escrito = escrito;
    }

    public Teorica getTeorica() {
        return teorica;
    }

    public void setTeorica(Teorica teorica) {
        this.teorica = teorica;
    }
    
    public CursoTeorico (String nome, String dataInicio, String dataTermino, Double cargaHoraria, 
        Aluno aluno, DoCursoTeorico doCursoTeorico, Escrito escrito, Teorica teorica){
        this.nome=nome;
        this.dataInicio=dataInicio;
        this.dataTermino=dataTermino;
        this.cargaHoraria=cargaHoraria;
        this.aluno=aluno;
        this.doCursoTeorico=doCursoTeorico;
        this.escrito=escrito;
        this.teorica=teorica;            
    }
    
    public String toString(){
        return "\n" +
               "====> DADOS DO CURSO TEÓRICO <====" +
               "\n NOME DO CURSO: " + getNome()+ 
               "\n DATA DE INÍCIO: " + getDataInicio()+ 
               "\n DATA DE TÉRMINO: " + getDataTermino()+ 
               "\n CARGA HORÁRIA: " + getCargaHoraria()+
               "\n ALUNO DO CURSO TEORICO:" + getAluno()+
               "\n " + getDoCursoTeorico()+
               "\n " + getEscrito()+
               "\n " + getTeorica();
    } 
}
