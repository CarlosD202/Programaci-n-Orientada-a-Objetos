/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package proyectodepoo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class InspectorTest {
    
    public InspectorTest() {
    }

    @Test
    public void testGetedad() {
        System.out.println("getedad");
        Inspector instance = null;
        int expResult = 0;
        int result = instance.getedad();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetedad() {
        System.out.println("setedad");
        Inspector instance = null;
        int expResult = 0;
        int result = instance.setedad();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetnumeroDui() {
        System.out.println("getnumeroDui");
        Inspector instance = null;
        String expResult = "";
        String result = instance.getnumeroDui();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetnumeroDui() {
        System.out.println("setnumeroDui");
        Inspector instance = null;
        String expResult = "";
        String result = instance.setnumeroDui();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testMostrarDatos() {
        System.out.println("mostrarDatos");
        Inspector instance = null;
        instance.mostrarDatos();
        
    }
    
}
