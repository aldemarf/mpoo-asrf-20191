import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class HelloWorld {
    private String nome;
    private String hora;

    public void setNome(String name) {
        this.nome = name;
    }

    public String getNome() {
        return nome;
    }

    public String getHora() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        this.hora = LocalTime.now().format(dtf);
        return hora;
    }

    public void imprimir(){
        System.out.println(this.getHora() + " - Olá " + this.getNome() + ". Você acabou de fazer seu primeiro Hello World em Java. Parabéns!");
    }
}
