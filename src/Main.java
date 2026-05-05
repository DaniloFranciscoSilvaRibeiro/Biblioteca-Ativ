import Model.Emprestimo;
import Model.Livro;
import Model.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Danilo", "danilo@gmail.com");
        System.out.println(usuario.getNome());
        System.out.println(usuario.getEmail());

        Livro livro = new Livro("Nada pode me ferir", "David Goggins", 7.59);
        System.out.println(livro.getAutor());
        System.out.println(livro.getTitulo());
        System.out.println(livro.getValorMulta());

        Emprestimo emprestimo = new Emprestimo(usuario, livro, 8);
        emprestimo.calcularMulta();
        
    }
}