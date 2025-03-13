public class Emprestimos {
    private Livro livro;
    private static boolean disponivel = true;

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean diponivel) {
        this.disponivel = diponivel;
    }
}
