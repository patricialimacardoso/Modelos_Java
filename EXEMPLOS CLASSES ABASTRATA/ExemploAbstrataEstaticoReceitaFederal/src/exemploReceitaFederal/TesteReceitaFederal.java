
package exemploReceitaFederal;


public class TesteReceitaFederal {


    public static void main(String[] args) {
        Atendente a = new Atendente (1010, "JOÃO JOSÉ", 1621.0, "VENDAS", 
                new Fisica ("JOÃO JOSÉ", 
                        new Endereco ("QNL", 10), "001.002.003-44", 
                        new ParaPessoaFisica (2020, 2025, 310000.0, 
            new Deducao (3030, "PLANO DE SAÚDE", 8000.0), 
                                new Pagamento (2522, "CONSULTAS", 5000.0), 
                                new Bens (777, "CASA", 300000.0), 2000.0, 
                                new Dependente (22, "RAISSA MARIA", 15))));
        System.out.println(a);
    }
    
}
