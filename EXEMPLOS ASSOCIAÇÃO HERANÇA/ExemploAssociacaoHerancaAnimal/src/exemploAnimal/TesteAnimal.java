
package exemploAnimal;


public class TesteAnimal {

   
    public static void main(String[] args) {
        Cachorro c = new Cachorro (7, "BARÃO", 
                new Fisica ("PATRÍCIA","000.001.002-11", 
                        new Profissao ("ANALISTA TI", 15000.00)));
        System.out.println(c);
    }
    
}
