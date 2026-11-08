
package classeAbstrataVeiculo;


public class TestaVeiculo {

   
    public static void main(String[] args) {
        
        
        DePasseio DP = new DePasseio ("PAT1984", 2026, "AZUL", 35000000.0, 
                new Proprietario ("001.286.541-98", "PATRÍCIA LIMA", 
                            new Endereco ("QNC", "12")),
            "BYD", "SONG PLUS", 
                new Montadora ("001002003/0001", "CHINESA", 
                        new Endereco ("RUA 01", "32")));
        
        System.out.println(DP);
    
        
        
        Onibus O = new Onibus ("PAT19894", 2026, "AZUL", 900000.0, 
                new Proprietario ("001.002.003-44", "PATRICIA LIMA", 
        new Endereco ("QNC", "12")), 
            60, 
            new Montadora ("015.016.017/0001", "VOLVO", 
                        new Endereco ("BANDEIRANTES", "1001")));
        
        System.out.println(O);
        
    
        
        Moto M = new Moto ("PAT1984", 2027, "AZUL", 60000.0, 
                new Proprietario ("001.002.003-55", "PATRÍCIA LIMA", 
                        new Endereco ("QNC", "12")), 
            600);
        
        System.out.println(M);
    }
    
}
