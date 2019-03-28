import java.util.Date;

public class Aluno extends Pessoa {
    private int anoEntrada;
    private int periodoEntrada;

    public int getAnoEntrada() {
        return anoEntrada;
    }

    public void setAnoEntrada(int anoEntrada) {
        this.anoEntrada = anoEntrada;
    }

    public int getPeriodoEntrada() {
        return periodoEntrada;
    }

    public void setPeriodoEntrada(int periodoEntrada) {
        this.periodoEntrada = periodoEntrada;
    }

    public Professor toTeacher (Date admissao) {
        Professor teacher = new Professor();
        teacher.setNome(this.getNome());
        teacher.setCpf(this.getCpf());
        teacher.setEnderecos(this.getEnderecos());
        teacher.setAdmissao(admissao);
        return teacher;
    }

    public String toString(){
        return String.format("Perfil: Aluno%n" +
                        "Nome: %s %n" +
                        "CPF: %s %n" +
                        "Entrada: %s.%s%n",
                        this.getNome(), this.getCpf(), this.getAnoEntrada(), getPeriodoEntrada());
    }
}

