public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}