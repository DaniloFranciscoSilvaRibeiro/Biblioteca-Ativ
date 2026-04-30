package Model;

public class Emprestimo {

    private Usuario usuario;
    private Livro livro;
    private Integer diasAtraso;

    public Emprestimo(Usuario usuario, Livro livro, Integer diasAtraso) {
        this.usuario = usuario;
        this.livro = livro;
        this.diasAtraso = diasAtraso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Integer getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(Integer diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

}
