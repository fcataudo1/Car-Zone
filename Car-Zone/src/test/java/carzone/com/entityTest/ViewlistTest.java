package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.suv;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.viewlist;

public class ViewlistTest {
    private viewlist viewCar;

    @BeforeEach
    void setUp() {
        viewCar = new viewlist();
        viewCar.setBname("Audi");
        viewCar.setCname("Berlina");
        viewCar.setCarname("Audi Q7");
        viewCar.setCarprice(75000);
        viewCar.setCarquantity(2);
        viewCar.setCarimage("audi_q7.jpg");
        viewCar.setCarDescription("Luxury SUV with premium features.");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals("Audi", viewCar.getBname());
        assertEquals("Berlina", viewCar.getCname());
        assertEquals("Audi Q7", viewCar.getCarname());
        assertEquals(75000, viewCar.getCarprice());
        assertEquals(2, viewCar.getCarquantity());
        assertEquals("audi_q7.jpg", viewCar.getCarimage());
        assertEquals("Luxury SUV with premium features.", viewCar.getCarDescription());
    }

    
}
