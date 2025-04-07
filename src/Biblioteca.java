import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private static List<Livro> livros = new ArrayList<>();
    private static List<Autor> autores = new ArrayList<>();
    private static List<Emprestimos> emprestimos = new ArrayList<>();

    public static void adicionarLivro() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do livro: ");
        String livroNome = scanner.nextLine();
        System.out.print("Nome do autor: ");
        String autorNome = scanner.nextLine();
        System.out.print("Data de nascimento do autor(dd MM yy): ");
        String autorDataNascimento = scanner.nextLine();

        Autor autor = new Autor(autorNome, autorDataNascimento);
        Livro livro = new Livro(livroNome, autor);


        livros.add(livro);
        autores.add(autor);
    }

    public static void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("\n" + livro.getTitulo());
        }
    }

    public static void realizarEmprestimo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("ID do livro: ");
        long id = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Nome do livro: ");
        String titulo = scanner.nextLine();

        boolean encontrado = false;

        for (Livro livro : livros) {
            if ((livro.getId() == id) && (livro.getTitulo().equals(titulo))) {
                encontrado = true;
                if (livro.isDisponivel()) {
                    System.out.println("Livro emprestado.");
                    livro.setDisponivel(false);

                    Emprestimos emprestado = new Emprestimos(livro.getId(), livro, livro.getAutor());
                    emprestimos.add(emprestado);
                } else {
                    System.out.println("Livro indisponível");
                }

                break;
            }
        }

        if (!encontrado) {
            System.out.println("Livro ou ID incorretos.");
        }
    }
}