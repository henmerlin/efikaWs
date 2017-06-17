/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackson;

import entidades.Usuario;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class SerializationJUnitTest {

    public SerializationJUnitTest() {
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

    @Test
    public void hello() {
        try {
            //Test code
            ObjectMapper mapper = new ObjectMapper();
            
            Usuario u = new Usuario();
            
            u.setLogin("G0042204");
            u.setSenha("akjsdhlkjh");
            u.setNivel(10);
            
            String out = mapper.writeValueAsString(u);
            System.out.println(out);
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }
}
