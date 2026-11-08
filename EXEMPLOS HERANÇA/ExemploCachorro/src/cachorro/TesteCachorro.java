
package cachorro;

public class TesteCachorro {


    public static void main(String[] args) {
      /*
    Proprietario p = new Proprietario("PATRICIA", "RUA A");
        Filiacao f = new Filiacao("THOR", "LUNA");

        Cachorro c = new Cachorro("001", "REX", "PASTOR ALEMÃO", p, f);

        System.out.println(c);
    
     */
      Cachorro toto = new Cachorro ("001", "REX", "PASTOR ALEMÃO",
                      new Proprietario ("PATRÍCIA", "QNC 12 CHÁCARA 10"), 
                      new Filiacao ("THOR", "LUNA"));
        System.out.println(toto);
    }
    
}
