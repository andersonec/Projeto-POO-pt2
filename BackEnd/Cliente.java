package BackEnd;

public class Cliente extends Pessoa{
    private int codigo;
    private String cadastroC;
    private Pessoa pessoa;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCadastroC(String cadastroC) {
        this.cadastroC += "\nNome" + pessoa.getNome() + " " + pessoa.getSobrenome() +
                          "\nCPF: " + pessoa.getCpf();
    }
    public String getCadastroC() {
        return cadastroC;
    }
}
