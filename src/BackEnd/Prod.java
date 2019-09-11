/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;


abstract class Prod implements ProdutoInterface{
    int codigo;
    String nome;
    int precoVenda;
    int precoCusto;
    int quantidade;   
    String fornecedor;
    
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    @Override
    public int getCodigo(){
        return codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public String getNome(){
        return nome;
    }
    public void setPrecoVenda(int precoVenda){
        this.precoVenda = precoVenda;
    } 
    @Override
    public int getPrecoVenda(){
        return precoVenda;
    }
    public void setPrecoCusto(int precoCusto){
        this.precoCusto = precoCusto;
    }
    @Override
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
     @Override
    public String getFornecedor(){
        return fornecedor;
    
    }
}
