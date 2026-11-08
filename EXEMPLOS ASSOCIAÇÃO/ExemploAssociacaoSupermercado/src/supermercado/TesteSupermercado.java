
package supermercado;

public class TesteSupermercado {

    public static void main(String[] args) {
        
        Supermercado s = new Supermercado ("012.345.678/0001","VENDE TUDO", "33445566", 
                new Cliente ("001.002.003-44", "PATRÍCIA LIMA", 42),
new Produto ("012345678", "ALISANTE LOLA", 129.90, 
        new Fornecedor (333.444.111/0001, "FORNECE TUDO", "22243377", 
        new Endereco ("C1", "10", 
                new Cep ("74.444-980")))), 
        new Endereco ("QNC", "12", 
                new Cep ("72.115-620")));
       System.out.println(s);
    }
    
}
