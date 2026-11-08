
package associacaoVeiculo;


public class TestaVeiculo {


    public static void main(String[] args) {
       Veiculo V = new Veiculo("PPP4X28", "AZUL PEROLIZADO", 
               new Motor(167.0, "FLEX"), 
               new Roda(17, 5), 
               new Porta("ESQUERDO"));
    
    System.out.println(V);
    
    }
}