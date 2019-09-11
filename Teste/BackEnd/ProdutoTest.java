/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexandro
 */
public class ProdutoTest{
   
    Produto p;
    
    
    public ProdutoTest() {
        this.p = new Produto(0," ",0,0,0," ");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setCodigo method, of class Produto.
     */
    @Test
    public void testSetCodigo() {
        
       
    }

    /**
     * Test of setNome method, of class Produto.
     */
    @Test
    public void testSetNome() {
       p.setNome(" ");
       Assert.assertEquals(" ", p.getNome());
        
    }
    
    /**
     * Test of setPrecoVenda method, of class Produto.
     */
    @Test
    public void testSetPrecoVenda() {
        p.setPrecoVenda(29);
        Assert.assertEquals(29, p.getPrecoVenda());
    }

    /**
     * Test of setPrecoCusto method, of class Produto.
     */
    @Test
    public void testSetPrecoCusto() {
        p.setPrecoCusto(90);
        Assert.assertEquals(90, p.getPrecoCusto());
    }

    /**
     * Test of setQuantidade method, of class Produto.
     */
    @Test
    public void testSetQuantidade() {
        p.setQuantidade(7);
        Assert.assertEquals(7, p.getQuantidade());
    }

    /**
     * Test of setFornecedor method, of class Produto.
     */
    @Test
    public void testSetFornecedor() {
        p.setFornecedor("nike");
        Assert.assertEquals("nike", p.getFornecedor());
    }

    private void assertEquals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
