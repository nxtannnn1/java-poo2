package Atividade1;

public class Livro {

private String titulo;
private String autor;
private String numeroPaginas;
private String preco;

public Livro(String titulo, String autor, String numeroPaginas, String preco) {
    this.titulo = titulo;
    this.autor = autor;
    this.numeroPaginas = numeroPaginas;
    this.preco = preco;
}

public Livro (){
    
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public String getNumeroPaginas() {
    return numeroPaginas;
}

public void setNumeroPaginas(String numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
}

public String getPreco() {
    return preco;
}

public void setPreco(String preco) {
    this.preco = preco;
}

}
