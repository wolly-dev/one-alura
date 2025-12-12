public class Livro {
    private String titulo;
    private String autor;

    // Setters //
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    // Setters //

    // Getters //
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    // Getters //

    void exibirDetalhes(){
        System.out.println("Livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
    }
}
