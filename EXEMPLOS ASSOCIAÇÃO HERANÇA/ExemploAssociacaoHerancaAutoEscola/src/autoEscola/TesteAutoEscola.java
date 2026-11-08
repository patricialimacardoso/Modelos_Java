
package autoEscola;


public class TesteAutoEscola {

 
    public static void main(String[] args) {
        CursoTeorico c = new CursoTeorico ("LEIS DE TRÂNSITO", "07/04/2026", "07/05/2026", 120.5, 
        new Aluno ("111.222.333-20", "PATRÍCIA LIMA", "QNC 12"), 
                new DoCursoTeorico ("072.072.072-33", "FERNANDO", "ENSINO MÉDIO"), 
                new Escrito ("ESCRITO", 
                        new Aluno ("000.002.003-67", "PEDRO PAULO", "QNQ 34"), 40, 7.8, 
                        new Agendamento (001, "06/04/2026", "14 HS")), 
                new Teorica ("20/04/2026","INFRAÇÕES"));
        
        System.out.println(c);
    }
    
}
