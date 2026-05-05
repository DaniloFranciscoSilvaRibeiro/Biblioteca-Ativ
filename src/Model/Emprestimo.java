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

    public String getEmprestimo(){
        return usuario + " " + livro + " " + diasAtraso;
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

    public Double calcularMulta(){
        double taxaDiaria = 1.49;
        double resultado = (diasAtraso <= 0) ? 0.0 : diasAtraso * taxaDiaria;
        this.livro.setValorMulta(resultado);
        return resultado;
    }

    public String getResumo(){
        return "Cliente: " + usuario.getNome() + "\nDias de Atraso: " +diasAtraso;
    }

}
