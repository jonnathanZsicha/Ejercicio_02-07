/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author claum
 */
public class ControladorPagosDocenteTest {
    
    public ControladorPagosDocenteTest() {
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
    public void testCalcularMensual() {
        System.out.println("calcularMensual");
        Date fechaUltimoPago = null;
        ControladorPagosDocente instance = new ControladorPagosDocente();
        Date expResult = null;
        Date result = instance.calcularMensual(fechaUltimoPago);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
