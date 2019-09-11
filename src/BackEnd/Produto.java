package BackEnd;
import java.util.Scanner;

/**
 *
 * @author Alexandro
 */
public  class Produto extends Prod  {

    

    public Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    @Override
    public void setCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrecoVenda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrecoCusto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setQuantidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFornecedor() {
        throw new UnsupportedOperationException("Note supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public  Produto(int codigo,String nome, int precoVenda, int precoCusto, int quantidade, String fornecedor){
    this.codigo = codigo;
    this.nome = nome;
    this.precoVenda = precoVenda;
    this.precoCusto = precoCusto;
    this.precoCusto = quantidade;   
    this.fornecedor= fornecedor;
}
   // Produto produto1 = new Produto(9999,"SAPATO",30,40,6,"alimentos");

 

 
    
}
