
package herancafuncionario;

public class TesteFuncionario {

  
    public static void main(String[] args) {

        Professor prof = new Professor("ANA","1234",5000.0,"MESTRADO","MATEMÁTICA",10);
        System.out.println(prof);
        
        TecnicoAdministrativo tec = new TecnicoAdministrativo("CARLOS","5678",3000.0,"SECRETÁRIA","ENSINO SUPERIOR");
        System.out.println(tec);
        
        ProfessorTemp profTemp = new ProfessorTemp("JOÃO",1001,"HISTÓRIA", 2500.0);
        System.out.println(profTemp);
        
        DaLimpeza limp = new DaLimpeza("MARIA",2002,40,"BLOCO A" );
        System.out.println(limp);
        
        System.out.println("OBJETOS CRIADOS COM SUCESSO!");
    }
}

