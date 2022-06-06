/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Calculadora;
    
    import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author david_leiva_moreno
 */

@RunWith(Parameterized.class)
public class CalculadoradivideTest {
    private int numen1;
    private int numen2;
    private int res;
   
   
    public CalculadoradivideTest(int num1, int num2, int res) {
        this.numen1 = num1;
        this.numen2 = num2;
        this.res = res;
    }

   
    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            {10,2,5}
            
         
            
        });
    }
   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void testDivide () {
        System.out.println("divide");
        Calculadora instance = new Calculadora (numen1,numen2);
        int expResult = res;
        int result = instance.divide();
        assertEquals(expResult, result);
        }
        


     
   
}

