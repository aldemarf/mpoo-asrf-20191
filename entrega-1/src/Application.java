import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();

        aluno01.setNome("Chico");
        aluno01.setCpf("000.000.000-00");
        aluno01.setAnoEntrada("2018");
        aluno01.setPeriodoEntrada("01");

        Endereco endereco01 = new Endereco();
        endereco01.setCidade("Recife");
        endereco01.setNumero(1000);
        endereco01.setComplemento("Casa");
        endereco01.setRua("Av. Abdias de Carvalho");

        aluno01.getEnderecos().add(endereco01);


        Professor professor01 = new Professor();

        professor01.setNome("Gabriel");
        professor01.setCpf("000.000.000-01");
        professor01.setAdmissao(new Date());

        Endereco endereco02 = new Endereco();
        endereco02.setCidade("Recife");
        endereco02.setNumero(2000);
        endereco02.setComplemento("Casa");
        endereco02.setRua("Av. Abdias de Carvalho");

        professor01.getEnderecos().add(endereco02);

        /* Gabriel -> Aluno Doc
        Aluno profaluno = (Aluno) ((Pessoa) professor01);
        profaluno.setPeriodoEntrada("1");
        profaluno.setAnoEntrada("2018");
        */

        // TODO: Criar metodo para transformar professor em aluno
        // TODO: Criar metodo par transformar aluno em professor
        // TALVEZ CRIAR RELACAO EM VEZ DE HERANCA


        System.out.println(aluno01.getEnderecos().get(0));
        System.out.println(professor01.getEnderecos().get(0));
    }
}
