
package exemploFarmacia;

public class TesteFarmacia {
    
    public static void main(String[] args) {
      
    Compra V = new Compra (123, "01/04/2026", 255.60, 
            new Pagamento ("CARTÃO DE CRÉDITO"), 
            new Cliente ("001.002.003-44", "PATRÍCIA LIMA", "20/05/1984", 
                    new Receita ("31/03/26", 122.3, 
                            new Farmaceutico (1001, "MATHEUS FERREIRA", 15000.0, "SUPERIOR COMPLETO"), 
                            new Medicamento ("22", "VITAMINA B12", 100.0, 
            new Fornecedor ("111.222.333/0001", "FORNECE DROGA", "RUA DAS SOLUÇÕES"),"AMARELA", "LEUCOPENIA")), 
                    new Pedido (121, 850.0, 
                            new Atendente (002, "PEDRO HENRIQUE", 1621.5, 25), 
                            new Perfumaria ("003", "ALISANTE LOLA", 129.9, 
            new Fornecedor ("444.555.666/0001", "BELLAPELE", "CNB 04"), 40.0, "VERDE"))));
    
    System.out.println(V);
    }
}
