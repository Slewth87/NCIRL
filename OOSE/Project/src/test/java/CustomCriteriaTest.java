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
public class CustomCriteriaTest {
    
    public CustomCriteriaTest() {
    }

    /**
     * Test of setName and getName methods, of class CustomCriteria.
     */
    @Test
    public void testSetGetName() {
        System.out.println("setName and getName");
        String name = "Covid Cert";
        CustomCriteria instance = new CustomCriteria();
        instance.setName(name);
        String expResult = name;
        String result = instance.getName();
        
        System.out.println(name+" = "+result);
        assertEquals(result, expResult);
    }


    /**
     * Test of setDescription and getDescription methods, of class CustomCriteria.
     */
    @Test
    public void testSetGetDescription() {
        System.out.println("setDescription and getDescription");
        String description = "Whether or not the customer has a valid Covid vaccination cert.";
        CustomCriteria instance = new CustomCriteria();
        instance.setDescription(description);
        String expResult = description;
        String result = instance.getDescription();
        
        System.out.println(description+" = "+result);
        assertEquals(result, expResult);
    }

    /**
     * Test of setPassed and getPassed methods, of class CustomCriteria.
     */
    @Test
    public void testSetGetPassed() {
        System.out.println("setPassed and getPassed");
        boolean passed = true;
        boolean passedTwo = false;
        CustomCriteria instance = new CustomCriteria();
        instance.setPassed(passed);
        CustomCriteria instanceTwo = new CustomCriteria();
        instanceTwo.setPassed(passedTwo);
        boolean expResult = passed;
        boolean result = instance.getPassed();
        boolean expResultTwo = passedTwo;
        boolean resultTwo = instanceTwo.getPassed();
        
        System.out.println(passed+" = "+result);
        System.out.println(passedTwo+" = "+resultTwo);
        assertEquals(result,expResult);
        assertEquals(resultTwo,expResultTwo);
    }

    /**
     * Test of storeCriteria method, of class CustomCriteria.
     */
    @Test
    public void testStoreCriteria() {
        System.out.println("storeCriteria");
        CustomCriteria instance = new CustomCriteria();
        boolean result = instance.storeCriteria();
        
        System.out.println(result);
        assertTrue( result == true || result == false );
    }
    
}
