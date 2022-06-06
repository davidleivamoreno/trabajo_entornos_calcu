
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
public class CalculadoraRestaTest {
    private int numen1;
    private int numen2;
    private int res;
   
   
    public CalculadoraRestaTest(int num1, int num2, int res) {
        this.numen1 = num1;
        this.numen2 = num2;
        this.res = res;
    }

   
    @Parameterized.Parameters
    public static Iterable<Object[]> getData() {
        return Arrays.asList(new Object[][]{
            {5,2,3}
            
         
            
        });
    }
   
    @Test
    public void testResta () {
        System.out.println("resta");
        Calculadora instance = new Calculadora (numen1,numen2);
        int expResult = res;
        int result = instance.resta();
        assertEquals(expResult, result);
        }
}