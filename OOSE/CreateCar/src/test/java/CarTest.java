import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test

    public void testCreateTesla() {

        System.out.println("CreateTesla");
        String Model = "";
        CarCreationService instance = new CarCreationService();
        String expResult = "Tesla";
        String result = instance.CreateTesla(Model).Make;

        assertEquals(expResult, result);
    }

    @Test

    public void testCreateFord() {

        System.out.println("CreateFord");
        String Model = "";
        CarCreationService instance = new CarCreationService();
        String expResult = "Ford";
        String result = instance.CreateFord(Model).Make;

        assertEquals(expResult, result);
    }
    
}