package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.suv;

public class SuvTest {
    private suv suvCar;

    @BeforeEach
    void setUp() {
        suvCar = new suv();
        suvCar.setBname("Jeep");
        suvCar.setCname("SUV");
        suvCar.setCarname("Jeep Wrangler");
        suvCar.setCarprice(55000);
        suvCar.setCarquantity(4);
        suvCar.setCarimage("jeep_wrangler.jpg");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals("Jeep", suvCar.getBname());
        assertEquals("SUV", suvCar.getCname());
        assertEquals("Jeep Wrangler", suvCar.getCarname());
        assertEquals(55000, suvCar.getCarprice());
        assertEquals(4, suvCar.getCarquantity());
        assertEquals("jeep_wrangler.jpg", suvCar.getCarimage());
    }
}
