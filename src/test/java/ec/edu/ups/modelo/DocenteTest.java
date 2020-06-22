/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.modelo.pagos.ReciboDePago2;
import java.util.Date;
import java.util.List;
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
public class DocenteTest {
    
    public DocenteTest() {
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
    public void testGetSueldo() {
        System.out.println("getSueldo");
        Docente2 instance = new Docente2();
        double expResult = 0.0;
        double result = instance.getSueldo();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetSueldo() {
        System.out.println("setSueldo");
        double sueldo = 0.0;
        Docente2 instance = new Docente2();
        instance.setSueldo(sueldo);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFechaDeRegistro() {
        System.out.println("getFechaDeRegistro");
        Docente2 instance = new Docente2();
        Date expResult = null;
        Date result = instance.getFechaDeRegistro();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetFechaDeRegistro() {
        System.out.println("setFechaDeRegistro");
        Date fechaDeRegistro = null;
        Docente2 instance = new Docente2();
        instance.setFechaDeRegistro(fechaDeRegistro);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTitulos() {
        System.out.println("getTitulos");
        Docente2 instance = new Docente2();
        List<Titulo2> expResult = null;
        List<Titulo2> result = instance.getTitulos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTitulos() {
        System.out.println("setTitulos");
        List<Titulo2> titulos = null;
        Docente2 instance = new Docente2();
        instance.setTitulos(titulos);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRecibosDePagos() {
        System.out.println("getRecibosDePagos");
        Docente2 instance = new Docente2();
        List<ReciboDePago2> expResult = null;
        List<ReciboDePago2> result = instance.getRecibosDePagos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRecibosDePagos() {
        System.out.println("setRecibosDePagos");
        List<ReciboDePago2> recibosDePagos = null;
        Docente2 instance = new Docente2();
        instance.setRecibosDePagos(recibosDePagos);
        fail("The test case is a prototype.");
    }
    
}
