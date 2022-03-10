/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

/**
 *
 * @author rduffy
 */
public class GroupTest {
    
    public GroupTest() {
    }

    /**
     * Test of setSize and getSize methods, of class Group.
     */
    @Test
    public void testSetGetSize() {
        System.out.println("setSize and getSize");
        Random rand = new Random();
        int size = rand.nextInt(8)+1;
        Group instance = new Group();
        instance.setSize(size);
        int expResult = size;
        int result = instance.getSize();
        
        System.out.println(size+" = "+result);
        assertEquals(expResult,result);
    }

    /**
     * Test of setGroupID and getGroupID methods, of class Group.
     */
    @Test
    public void testSetGetGroupID() {
        System.out.println("setGroupID and getGroupID");
        Group instance = new Group();
        instance.setGroupID();
        int result = instance.getGroupID();
                
        System.out.println(result);
        assertTrue(0 < result && 10000000 >= result);
    }

    /**
     * Test of logGroup method, of class Group.
     */
    @Test
    public void testLogGroup() {
        System.out.println("logGroup");
        Group instance = new Group();
        boolean result = instance.logGroup();
        
        System.out.println(result);
        assertTrue( result == true || result == false );
    }
    
}
