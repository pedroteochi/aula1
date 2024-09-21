package semana07;

public class Livro {

    private int Isbn;
    private String titulo;

    public Livro(int isbn, String titulo) {
        this.Isbn = isbn;
        this.titulo = titulo;
    }

    public int getIsbn() {
        return Isbn;
    }
    public void setIsbn(int isbn) {
        Isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    

}
