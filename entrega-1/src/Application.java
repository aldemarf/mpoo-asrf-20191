import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {
    public static void main(String[] args) {

        // *******************************************
        //Aluno 01
        Aluno aluno01 = new Aluno();

        aluno01.setNome("Chico Science");
        aluno01.setCpf("000.000.000-00");
        aluno01.setAnoEntrada(1994);
        aluno01.setPeriodoEntrada(1);

        Endereco endereco01 = new Endereco();
        endereco01.setCidade("Recife");
        endereco01.setNumero(1000);
        endereco01.setComplemento("Casa");
        endereco01.setRua("Av. Abdias de Carvalho");
        aluno01.getEnderecos().add(endereco01);

        // *******************************************
        //Professor 01
        Professor professor01 = new Professor();

        professor01.setNome("Gabriel Alves");
        professor01.setCpf("000.000.000-01");
        professor01.setAdmissao(stringToDate("15/05/2008"));

        Endereco endereco02 = new Endereco();
        endereco02.setCidade("Recife");
        endereco02.setNumero(2000);
        endereco02.setComplemento("Casa");
        endereco02.setRua("Av. Abdias de Carvalho");
        professor01.getEnderecos().add(endereco02);

        // *******************************************
        // METODO DE CONVERSAO ALUNO <--> PROFESSOR 01

        // Aluno -> Professor
        Date data = stringToDate("10/12/1996");
        Professor professor02 = aluno01.toTeacher(data);

        // Professor -> Aluno
        Aluno aluno02 = professor01.toStudent(2018, 1);

        // Prints
        System.out.println(aluno01);
        System.out.println(aluno02);
        System.out.println(professor01);
        System.out.println(professor02);
    }

    // FUNCOES DE CONVERSAO DATE <--> STRING
    public static Date stringToDate (String data) {
        Date date = null;
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        try {
            date = formatter.parse(data);
        } catch (ParseException err) {
            err.printStackTrace();
        }
        return date;
    }

    public static String dateToString (Date data) {
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        String date = formatter.format(data);
        return date;
    }
}
