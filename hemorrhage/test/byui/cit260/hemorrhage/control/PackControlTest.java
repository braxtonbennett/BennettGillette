/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hemorrhage.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Douglas
 */
public class PackControlTest {
    
    public PackControlTest() {
    }

    /**
     * Test of makeCure method, of class PackControl.
     */
    @Test
    public void testMakeCure() {
        System.out.println("makeCure");
        System.out.println("\tTest Case #1");
        long brahmi = 2;
        long calihari = 6;
        long henna = 3;
        long harida = 1;
        PackControl instance = new PackControl();
        long expResult = 1;
        long result = instance.makeCure(brahmi, calihari, henna, harida);
        assertEquals(expResult, result);
        
        
         System.out.println("\tTest Case #2");
         
         brahmi = -2;
         calihari = 6;
         henna = 3;
         harida = 1;
         expResult = -1;
         
        result = instance.makeCure(brahmi, calihari, henna, harida);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #3");
         
         brahmi = 2;
         calihari = -6;
         henna = 3;
         harida = 1;
         expResult = -1;
         
        result = instance.makeCure(brahmi, calihari, henna, harida);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #4");
         
         brahmi = 2;
         calihari = 6;
         henna = -3;
         harida = 1;
         expResult = -1;
         
        result = instance.makeCure(brahmi, calihari, henna, harida);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #5");
         
         brahmi = 2;
         calihari = 6;
         henna = 3;
         harida = -1;
         expResult = -1;
         
        result = instance.makeCure(brahmi, calihari, henna, harida);
        assertEquals(expResult, result);
        
        
        System.out.println("\tTest Case #6");
         
         brahmi = 1;
         calihari = 6;
         henna = 3;
         harida = 1;
         expResult = 2;
         
        result = instance.makeCure(brahmi, calihari, henna, harida);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #7");
         
         brahmi = 2;
         calihari = 1;
         henna = 3;
         harida = 1;
         expResult = 2;
         
        result = instance.makeCure(brahmi, calihari, henna, harida);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #8");
         
         brahmi = 2;
         calihari = 6;
         henna = 1;
         harida = 1;
         expResult = 2;
         
        result = instance.makeCure(brahmi, calihari, henna, harida);
        assertEquals(expResult, result);
        
        System.out.println("\tTest Case #9");
         
         brahmi = 2;
         calihari = 6;
         henna = 3;
         harida = 1;
         expResult = 1;
         
        result = instance.makeCure(brahmi, calihari, henna, harida);
        assertEquals(expResult, result);
        
    }
    
}
