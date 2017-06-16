/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0042204
 */
public class AutenticacaoDAOTest {

    public AutenticacaoDAOTest() {
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
     * Test of consultar method, of class AutenticacaoDAO.
     */
    @Test
    public void testConsultar() throws Exception {
        try {
            AutenticacaoDAO instance = new AutenticacaoDAO();
            Usuario result = instance.consultar("G0042204");
            assertTrue(!result.getLogin().isEmpty());
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
    }

}
