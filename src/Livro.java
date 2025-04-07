import java.time.LocalDate;

public class Livro {
    private long contadorGlobal = 0;
    private long id;
    private String titulo;
    private Autor autor;
    private boolean disponivel = true;
    private LocalDate dataCadastro = LocalDate.now();
    private LocalDate dataAtualizacao;

    public Autor getAutor() {
        return autor;
    }

    Livro(String titulo, Autor autor) {
        this.id = contadorGlobal++;
        this.titulo = titulo;
        this.autor = autor;
        this.dataAtualizacao = LocalDate.now();
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public long getId() {
        return id;
    }
}