
package herancaveiculo;


public class TesteVeiculo {
    public static void main(String[] args) {
       
    Gol G = new Gol(10000000, 2025, 4 , "VOLKSWAGEN", 10000.00, 5);
        System.out.println(G);
        
    Pesado P = new Pesado (1000000000, 2000, "CAMINHÃO", 100 );

    System.out.println(P);
    }
   
}
