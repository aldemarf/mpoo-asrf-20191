import java.util.ArrayList;

// METODO 02 DE CONVERSAO -- INSTANCIAR PESSOA COM LISTA DE FUNCOES PARA NAO ARMAZENAR EM DUPLICIDADE OS DADOS


public class Pessoa2 {
    private String nome;
    private String cpf;
    private ArrayList<Endereco> enderecos = new ArrayList<>();
    private ArrayList funcoes = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public ArrayList getFuncoes() {
        return funcoes;
    }

    public void setFuncoes(ArrayList funcoes) {
        this.funcoes = funcoes;
    }
}