public class Emprestimos {
    private long id;
    private Livro livro;
    private Autor autor;

    Emprestimos(long id, Livro livro, Autor autor) {
        this.id = id;
        this.livro = livro;
        this.autor = autor;
    }
}