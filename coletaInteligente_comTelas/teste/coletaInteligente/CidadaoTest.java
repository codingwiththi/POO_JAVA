/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thiag
 */
public class CidadaoTest {
    
    public CidadaoTest() {
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
    
    Cidadao instance = new Cidadao();

    /**
     * Test of getCodigo method, of class Cidadao.
     */
    /*@Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Não faz o GetCodigo corretamente");
    }*/

    /**
     * Test of setNome method, of class Cidadao.
     */
    @Test
    public void testSetNome() throws Exception {
        System.out.println("setNome");
        String nome = "Thiago";
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("Não faz o SetNome corretamente, verificar mensagem do Validador");
    }
    
    /**
     * Test of getNome method, of class Cidadao.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String expResult = "Thiago";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Não faz o GetNome corretamente");
    }
    
    /**
     * Test of setEmail method, of class Cidadao.
     */
    @Test
    public void testSetEmail() throws Exception {
        System.out.println("setEmail");
        String email = "thiagom.r@hotmail.com";
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("Não faz setSenha corretamente, verificar mensagem do validador");
    }

    /**
     * Test of getEmail method, of class Cidadao.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "thiagom.r@hotmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Não faz o getEmail corretamente");
    }

    /**
     * Test of setSenha method, of class Cidadao.
     */
    @Test
    public void testSetSenha() throws Exception {
        System.out.println("setSenha");
        String senha = "123456";
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("não faz o setSenha corretamente, vê o validador");
    }
    
    /**
     * Test of getSenha method, of class Cidadao.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        String expResult = "123456";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Não faz o getSenha corretamente");
    }

    /**
     * Test of getLatitude method, of class Cidadao.
     */
    /*@Test
    public void testGetLatitude() {
        System.out.println("getLatitude");
        Cidadao instance = new Cidadao();
        float expResult = 0.0F;
        float result = instance.getLatitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("Não faz o getLat");
    }

    /**
     * Test of getLongitude method, of class Cidadao.
     */
    /*@Test
    public void testGetLongitude() {
        System.out.println("getLongitude");
        Cidadao instance = new Cidadao();
        float expResult = 0.0F;
        float result = instance.getLongitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("Não faz o getLog");
    }

    /**
     * Test of toString method, of class Cidadao.
     */
    /*@Test
    public void testToString() {
        System.out.println("toString");
        Cidadao instance = new Cidadao();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("toString fail");
    }*/
    
}
