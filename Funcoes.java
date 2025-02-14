import java.util.Scanner;
public class Funcoes {

    public void cadastrarLivros (Livro livro, Scanner sc){
    livro.setTitulo(sc);
    livro.setAutor(sc);
    livro.setPreco(sc);
    livro.setPaginas(sc);
    }

    public void showLivros (Livro livro){
        System.out.println("\nNome do livro: "+livro.getTitulo()+"\nAutor: "+livro.getAutor()+"\nPreço: "+livro.getPreco()+"\nQuantidade de páginas: "+livro.getPaginas());
    }

}
