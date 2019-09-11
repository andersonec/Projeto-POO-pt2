package BackEnd;
abstract class Pessoa implements ClienteInter{
    private String nome;
    private String sobrenome;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    @Override
    public String getSobrenome() {
        return sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public String getCpf() {
        return cpf;
    }
}
