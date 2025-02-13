package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.elettrica;

public class ElettricaTest {
    private elettrica electricCar;

    @BeforeEach
    void setUp() {
        electricCar = new elettrica();
        electricCar.setBname("Tesla");
        electricCar.setCname("Elettrica");
        electricCar.setCarname("Tesla Model S");
        electricCar.setCarprice(80000);
        electricCar.setCarquantity(4);
        electricCar.setCarimage("tesla_model_s.jpg");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals("Tesla", electricCar.getBname());
        assertEquals("Elettrica", electricCar.getCname());
        assertEquals("Tesla Model S", electricCar.getCarname());
        assertEquals(80000, electricCar.getCarprice());
        assertEquals(4, electricCar.getCarquantity());
        assertEquals("tesla_model_s.jpg", electricCar.getCarimage());
    }

   
}
