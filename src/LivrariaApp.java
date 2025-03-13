import java.util.Scanner;

public class LivrariaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você gostaria de ver os livros disponíveis? (true/false)");
        Boolean answer = scanner.hasNextBoolean();
        System.out.println(answer);

        while(answer) {
            tracos();

        }
    }

    private static String tracos(){
        String repeated = new String(new char[50]).replace("\0", "-");
        return repeated + "\n";
    }
}
