package BackEnd;
import java.util.Scanner;
public class Cliente {
    private int codigo;
    private String nome;
    private String sobrenome;
    private long cpf;
    private String cadastroC;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public long getCpf() {
        return cpf;
    }

    public void setCadastroC(String cadastroC) {
        this.cadastroC = cadastroC;
    }
    public String getCadastroC() {
        return cadastroC;
    }
}
