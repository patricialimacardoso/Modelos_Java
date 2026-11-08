
package associacaoLivro;


public class TesteLivro {

   
    public static void main(String[] args) {
       /*Edicao ed = new Edicao (10, 2026);
       Patrocinador pat = new Patrocinador ("NASA");
       Editora edit = new Editora ("001", "ATLAS");
       Endereco end = new Endereco ("QNC", 10);
       
       Livro livro = new Livro ("PODE RODAR", 500, ed, 
            pat, edit, end);
       System.out.println(livro);*/
       
       Livro livro = new Livro ("O HOMEM MAIS RICO DA BABILÔNNIA", 200, 
               new Edicao (10, 2017, 
                       new Patrocinador ("GOOGLE", 
                               new Editora ("555", " HarperCollins Brasil", 
                                       new Endereco ("SAÍDA DA MISÉRIA", 10)), 
                               new Endereco ("RUA BOULEVAR", 2))));
       System.out.println(livro);
      
    }
    
}
