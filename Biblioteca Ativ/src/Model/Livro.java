package Model;

public class Livro {

    private String titulo;
    private String autor;
    private Double valorMulta;

    public Livro(String titulo, String autor, Double valorMulta) {
        this.titulo = titulo;
        this.autor = autor;
        this.valorMulta = valorMulta;
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

    public Double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
    }

}
