import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarCreationServiceTest {
    
    public CarCreationServiceTest() {
    }

    /**
     * Test of CreateTesla method, of class CarCreationService.
     */
    @Test
    public void testCreateTesla() {
        System.out.println("CreateTesla");
        String Model = "S";
        CarCreationService instance = new CarCreationService();
        String expResult = "Tesla";
        String expResultMore = Model;
        String result = instance.CreateTesla(Model).Make;
        String resultMore = instance.CreateTesla(Model).Model;
        
        System.out.println("Expects: "+expResult+" "+expResultMore);
        System.out.println("Got: "+result+" "+resultMore);
        
        assertEquals(expResult, result);
        assertEquals(expResultMore, resultMore);
    }

    /**
     * Test of CreateFord method, of class CarCreationService.
     */
    @Test
    public void testCreateFord() {
        System.out.println("CreateFord");
        String Model = "Mondeo";
        CarCreationService instance = new CarCreationService();
        String expResult = "Ford";
        String expResultMore = Model;
        String result = instance.CreateFord(Model).Make;
        String resultMore = instance.CreateTesla(Model).Model;
        
        System.out.println("Expects: "+expResult+" "+expResultMore);
        System.out.println("Got: "+result+" "+resultMore);
        
        assertEquals(expResult, result);
        assertEquals(expResultMore, resultMore);
    }
    
}
