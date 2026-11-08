
package interfaceVeiculo;


public class TesteVeiculo {

   
    public static void main(String[] args) {
        Gol g1 = new Gol (2014, 400000.0, 96000.0, 
                new Proprietario ("MARIA DE FÁTIMA", "RUA PRINCIPAL 13", "123"), 
            "GOL GTS", "BRANCO", 
                new Marca ("1010", "ALEMANHA"));
            
        System.out.println(g1);
    }
    
    
}
