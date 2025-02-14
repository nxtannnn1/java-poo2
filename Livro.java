import java.util.Scanner;

public class Livro  {
private String titulo;
private String autor;
private double preco;
private int paginas;

public Livro(String titulo, String autor, double preco, int paginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.preco = preco;
    this.paginas = paginas;
}

Scanner sc = new Scanner (System.in);

public String setTitulo (Scanner sc){
    System.out.println("\nInformar título: ");
    this.titulo=sc.nextLine();
    return this.titulo;
}

public String getTitulo (){
    return this.titulo;
}

public String setAutor (Scanner sc){
    System.out.println("\nInformar autor: ");
    this.autor=sc.nextLine();
    return this.autor;
}

public String getAutor (){
    return this.autor;
}

public Double setPreco (Scanner sc){
    System.out.println("\nInformar preço: ");
    this.preco=sc.nextDouble();
    return this.preco;
}

public Double getPreco (){
    return this.preco;
}

public int setPaginas (Scanner sc){
    System.out.println("\nInformar quantidade de páginas: ");
    this.paginas=sc.nextInt();
    sc.nextLine();
    return this.paginas;
}

public int getPaginas (){
    return this.paginas;
}

}
