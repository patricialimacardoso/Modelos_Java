
package herancaagencia;


public class TesteAgenciaDeViagens {

  
    public static void main(String[] args) {
        
        Campo n = new Campo("ÁGUIA TURISMO", "001.001.001-13", "CEARÁ", "BRASIL", "10/03/2026","20/03/2026");
        System.out.println(n);
        System.out.println("----------------------------------------------------------------------------------");
        
        Acomodacao a = new Acomodacao ("ÁGUIA TURISMO", "001.001.001-13", "CEARÁ", "BRASIL", "10/03/2026","20/03/2026","10", "5");
        System.out.println(a);
        System.out.println("----------------------------------------------------------------------------------");

        Cliente c = new Cliente ("ÁGUIA TURISMO", "001.001.001-13","PATRÍCIA DE LIMA ", "01.01.01");
        System.out.println(c);
        System.out.println("----------------------------------------------------------------------------------");
        
        Pagamento p = new Pagamento ("ÁGUIA TURISMO", "001.001.001-13", "10/03/2026", "20/03/2026", 5000.00, "CARTÃO DE CRÉDITO EM 10X");
        System.out.println(p);
        System.out.println("----------------------------------------------------------------------------------");
        
        NaoConfirmada r = new NaoConfirmada ("ÁGUIA TURISMO", "001.001.001-13", "10/03/2026", "PENDENTE");
        System.out.println(r);
        System.out.println("----------------------------------------------------------------------------------");

    }
    
}
