
package classeAbstrataEstaticoBanco;


public class TesteBanco {

    
    public static void main(String[] args) {
        Fisica f = new Fisica (3000000.0, "PATRÍCIA LIMA", "82006482", 1000000.0, 20000.0, 
            
                new Conta (3600, 3000000.0, 
                        new Transacao ("PIX", 30000.0), 
                        new Agencia (4905, "ITAÚ")), 
                new CartaoCredito (9031, "10/05/2030", 10000.0, 
                        new TransacaoCartao (777, 3000.0)), 
                new Endereco ("QNC", 12, 
                        new Cep ("72.115-620")),
            "001.002.003-44");
        System.out.println(f);
    }
    
}
