import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Autor {
    private static long contadorGlobal;
    private long id;
    private String nome;
    private LocalDate dataNascimento;

    Autor(String nome, String dataNascimento) {
        this.id = contadorGlobal++;
        this.nome = nome;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
    }
}