
package interfacePessoa;


public class TesteInterfacePessoa {

   
    public static void main(String[] args) {
        Cliente p = new Cliente ("001.002.003-44", "MARIA DE JESUS", 
                new Endereco ("QNP", 10), 12.5, 100, 
            new Impressao ("LIVRO", 0.25), 
            new Internet ("TIM", 12.4));
        System.out.println(p);
        
        Tecnico t = new Tecnico ("10021003", "JOSÉ DE OLIVEIRA", 
                new Endereco ("QNQ", 20),"2023", 200.5, 
                new Equipamento ("WALITA", "DIGITAL"));
        System.out.println(t);
        
        Funcionario f = new Funcionario ("55226612", "RODOLFO JOSÉ MENDOÇA", 
                new Endereco ("QNR", 30),303, 150.5);
        System.out.println(f);
    }
    
    
}
