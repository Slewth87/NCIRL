/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rduffy
 */
public class OddEvenTest {
    
    public OddEvenTest() {
    }

    /**
     * Test of calculate method, of class OddEven.
     */
    @Test
    public void testCalculateOdd() {
        System.out.println("Calculate Odd");
        int userNo = 1;
        OddEven instance = new OddEven();
        String expResult = "Odd";
        String result = instance.calculate(userNo);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateEven() {
        System.out.println("Calculate Even");
        int userNo = 2;
        OddEven instance = new OddEven();
        String expResult = "Even";
        String result = instance.calculate(userNo);
        
        assertEquals(expResult, result);
    }
}
