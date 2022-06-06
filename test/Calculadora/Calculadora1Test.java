/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david_leiva_moreno
 */
public class Calculadora1Test {
     private static Calculadora calcu;
    private int resultado;
    private int nume1;
    private int nume2;
    private int resul;
    public Calculadora1Test() {
    }
    
    public static void creaCalculadora() {
        calcu=new Calculadora(20,10);
    }
    
    
    @AfterClass
    public static void borraCalculadora(){
    calcu=null;
    }  @Before
    public void crearCalculadora() {
        calcu=new Calculadora(20,10);
    } 
    
    
    @After
    public void borrarCalculadora() {
        calcu=null;
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
   public void testSuma() {
        System.out.println("suma");
        Calculadora calcu =new Calculadora(20,10);
        int resultado=calcu.suma();
        assertEquals("Fallo en la suma: ",30,resultado);
    }
    

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora calcu=new Calculadora(20,10); 
        int resultado=calcu.resta(); 
        assertEquals("Fallo en la resta: ",10,resultado);
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
  public void testMultiplica() {
        System.out.println("multiplica");
      Calculadora calcu=new Calculadora(20,10);
      int resultado=calcu.multiplica();
      assertEquals("Fallo en la multiplicación: ",200,resultado);
    }


    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
     public void testDivide() {
        System.out.println("divide");
       Calculadora calcu=new Calculadora(20,10); 
       int resultado=calcu.divide(); 
       assertEquals("Fallo en la dividir: ",2,resultado);
    }
}
