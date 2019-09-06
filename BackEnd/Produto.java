package BackEnd;
import java.util.Scanner;
public class Produto {

    protected int codigo;
    protected String nome;
    protected int precoVenda;
    protected int precoCusto;
    protected int quantidade;   
    private String fornecedor;
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setPrecoVenda(int precoVenda){
        this.precoVenda = precoVenda;
    } 
    public int getPrecoVenda(){
        return precoVenda;
    }
    public void setPrecoCusto(int precoCusto){
        this.precoCusto = precoCusto;
    } 
    public int getPrecoCusto(){
        return precoCusto;
    }
        
    public void setQuantidade(int quantidadeEntrada){
        this.quantidade += quantidadeEntrada;
    }
    public int getQuantidade(){
        return quantidade;
    }
     public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }
    public String getFornecedor(){
        return fornecedor;
    
    }
    public void aumentarQuantidade(){
       
    }

    
}
