import java.util.Scanner;

public class LivrariaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você gostaria de ver os livros disponíveis? (true/false)");
        Boolean answer = scanner.nextBoolean();

        Biblioteca biblioteca = new Biblioteca();
        try {
            while(answer) {
                System.out.println("\n" + tracos());

                System.out.println("1 - Adicionar um novo livro");
                System.out.println("2 - Listar todos os livros disponíveis");
                System.out.println("3 - Realizar empréstimo de um livro");
                System.out.println("4 - Sair");
                int choice = scanner.nextInt();

                if (choice == 4) {System.out.println("Até a próxima!"); break;}
                choices(choice);
            }
        } catch (Exception e) {e.printStackTrace();}

    }

    private static void choices(int choice) {
        if(choice == 1) {
            Biblioteca.adicionarLivro();
        } else if (choice == 2) {
            Biblioteca.listarLivros();
        } else if(choice == 3) {
            Biblioteca.realizarEmprestimo();
        }
    }

    private static String tracos(){
        String repeated = new String(new char[50]).replace("\0", "-");
        return repeated + "\n";
    }
}
