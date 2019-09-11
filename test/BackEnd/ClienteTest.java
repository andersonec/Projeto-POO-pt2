/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexandro
 */
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of setCodigo method, of class Cliente.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Cliente instance = new Cliente();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Cliente.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Cliente.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Cliente instance = new Cliente();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Cliente.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSobrenome method, of class Cliente.
     */
    @Test
    public void testSetSobrenome() {
        System.out.println("setSobrenome");
        String sobrenome = "";
        Cliente instance = new Cliente();
        instance.setSobrenome(sobrenome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSobrenome method, of class Cliente.
     */
    @Test
    public void testGetSobrenome() {
        System.out.println("getSobrenome");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getSobrenome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCpf method, of class Cliente.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        long cpf = 0L;
        Cliente instance = new Cliente();
        instance.setCpf(cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class Cliente.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Cliente instance = new Cliente();
        long expResult = 0L;
        long result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCadastroC method, of class Cliente.
     */
    @Test
    public void testSetCadastroC() {
        System.out.println("setCadastroC");
        String cadastroC = "";
        Cliente instance = new Cliente();
        instance.setCadastroC(cadastroC);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCadastroC method, of class Cliente.
     */
    @Test
    public void testGetCadastroC() {
        System.out.println("getCadastroC");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCadastroC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
