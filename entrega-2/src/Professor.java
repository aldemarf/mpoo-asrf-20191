import java.util.Date;

public class Professor extends Pessoa {
    private Date admissao;

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public Aluno toStudent (int ano, int entrada) {
        Aluno student = new Aluno();
        student.setNome(this.getNome());
        student.setCpf(this.getCpf());
        student.setEnderecos(this.getEnderecos());
        student.setAnoEntrada(ano);
        student.setPeriodoEntrada(entrada);
        return student;
    }
    @Override
    public String toString(){
        return String.format("Perfil: Professor%n" +
                        "Nome: %s %n" +
                        "CPF: %s %n" +
                        "Data de admissao: %s%n",
                        this.getNome(), this.getCpf(), Application.dateToString(this.getAdmissao()));
    }
}
