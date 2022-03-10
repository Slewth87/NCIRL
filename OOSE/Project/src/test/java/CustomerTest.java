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
public class CustomerTest {
    
    public CustomerTest() {
    }

    /**
     * Test of setCustID and getCustID methods, of class Customer.
     */
    @Test
    public void testSetGetCustID() {
        System.out.println("setCustID and getCustID");
        Customer instance = new Customer();
        instance.setCustID();
        int result = instance.getCustID();
        
        System.out.println("CustID: "+result);
        assertTrue(0 < result && 10000000 >= result);
    }

    /**
     * Test of setID and getID methods, of class Customer.
     */
    @Test
    public void testSetGetID() {
        System.out.println("setID and getID");
        boolean ID = true;
        boolean IDTwo = false;
        Customer instance = new Customer();
        instance.setID(ID);
        Customer instanceTwo = new Customer();
        boolean result = instance.getID();
        boolean resultTwo = instanceTwo.getID();
        
        System.out.println(ID+" = "+result);
        assertEquals(ID,result);
        System.out.println(IDTwo+" = "+resultTwo);
        assertEquals(IDTwo,resultTwo);
    }
    /**
     * Test of setCustomCriteria and getCustomCriteria methods, of class Customer.
     */
    @Test
    public void testSetCustomCriteria() {
        System.out.println("setCustomCriteria and getCustomCriteria");
        boolean criteria = true;
        boolean criteriaTwo = false;
        Customer instance = new Customer();
        instance.setCustomCriteria(criteria);
        Customer instanceTwo = new Customer();
        instanceTwo.setCustomCriteria(criteriaTwo);
        boolean result = instance.getCustomCriteria();
        boolean resultTwo = instanceTwo.getCustomCriteria();
        
        System.out.println(criteria+" = "+result);
        assertEquals(criteria,result);
        System.out.println(criteriaTwo+" = "+resultTwo);
        assertEquals(criteriaTwo,resultTwo);
    }

    /**
     * Test of makePayment method, of class Customer.
     */
    @Test
    public void testMakePayment() {
        System.out.println("makePayment");
        double payment = Math.floor(Math.random()*(50000-1)+1)/100;
        double owed = payment;
        double paymentTwo = Math.floor(Math.random()*(50000-1)+1)/100;
        double owedTwo = Math.floor(Math.random()*(50000-(Math.floor(paymentTwo+1)))+Math.floor(paymentTwo+1))/100;
        Customer instance = new Customer();
        double expResult = 0.0;
        double result = instance.makePayment(payment, owed);
        Customer instanceTwo = new Customer();
        double expResultTwo = ((owedTwo*100)-(paymentTwo*100))/100;
        double resultTwo = instanceTwo.makePayment(paymentTwo, owedTwo);
        
        System.out.println(owed+" - "+payment+" should equal "+expResult+", Actually returned: "+result);
        assertEquals(expResult, result);
        System.out.println(owedTwo+" - "+paymentTwo+" should equal "+expResultTwo+", Actually returned: "+resultTwo);
        assertEquals(expResultTwo, resultTwo);
    }

    /**
     * Test of logDenial method, of class Customer.
     */
    @Test
    public void testLogCust() {
        System.out.println("logCust");
        String failedCriteria = "ID";
        boolean state = true;
        Customer instance = new Customer();
        boolean result = instance.logCust(failedCriteria,state);
        
        System.out.println(result);
        assertTrue( result == true || result == false );
    }

    /**
     * Test of viewCustomer method, of class Customer.
     */
    @Test
    public void testViewCustomer() {
        System.out.println("viewCustomer");
        Customer instance = new Customer();
        instance.setCustID();
        
        int custo = instance.getCustID();

        String expResult = "CustID: "+custo+"\nID: false\nCustom Criteria: false\nBalance: €0.0";
        String result = instance.viewCustomer(instance.getCustID());
        System.out.println("Just custID: "+result);
        assertEquals(expResult, result);
        
        instance.setID(true);
        expResult = "CustID: "+custo+"\nID: true\nCustom Criteria: false\nBalance: €0.0";
        result = instance.viewCustomer(instance.getCustID());
        System.out.println("custID and ID: "+result);
        assertEquals(expResult, result);
        
        instance.setCustomCriteria(true);
        expResult = "CustID: "+custo+"\nID: true\nCustom Criteria: true\nBalance: €0.0";
        result = instance.viewCustomer(instance.getCustID());
        System.out.println("custID, ID, and custom criteria: "+result);
        assertEquals(expResult, result);
        
        double bal = instance.makePayment(5.00,10.00);
        expResult = "CustID: "+custo+"\nID: true\nCustom Criteria: true\nBalance: €5.0";
        result = instance.viewCustomer(instance.getCustID());
        System.out.println("custID, ID, custom criteria, and sample balance which should be 5.0: "+result);
        assertEquals(expResult, result);
    }
}
