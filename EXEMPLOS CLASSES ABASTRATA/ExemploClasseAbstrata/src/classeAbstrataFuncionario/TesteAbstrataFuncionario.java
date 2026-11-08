
package classeAbstrataFuncionario;


public class TesteAbstrataFuncionario {


    public static void main(String[] args) {
        
        Vendedor p = new Vendedor ("1010", "MARIA DE JESUS", "QR 415", 
                new Patrao ("PATRÍCIA LIMA", 42, 
                        new Empresa ("001.002.003/0001", "ÁGUIA TURISMO")),
            "VENDAS", 1621.5, 
                new QualidadeTotal (20, "VENDAS COM FOCO", 50.5, 
                        new Professor ("3030", "PAULO DE TARSO"), 
            "MATUTINO", 40));
            
        System.out.println(p);
    }
}
