import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Funcoes f = new Funcoes ();
    Livro livro1 = new Livro ("","",0.0,0);
    Livro livro2 = new Livro ("","",0.0,0);
    
    f.cadastrarLivros(livro1, sc);
    f.cadastrarLivros(livro2, sc);
    f.showLivros(livro1);
    f.showLivros(livro2);
}

}
