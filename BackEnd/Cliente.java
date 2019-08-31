package BackEnd;
import java.util.Scanner;
public class Cliente {
    private int codigo;
    private String nome;
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

    public void cadastrar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        setNome(input.nextLine());
        System.out.println("Digite o CPF: ");
        setCpf(input.nextLong());
        System.out.println("CADASTRADO");
        setCadastroC("\nCodigo: " + getCodigo() + "\nNome: " + getNome() + "\nCPF: " + getCpf());
    }
}
