package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.dilusso;

public class DilussoTest {
    private dilusso luxuryCar;

    @BeforeEach
    void setUp() {
        luxuryCar = new dilusso();
        luxuryCar.setBname("Ferrari");
        luxuryCar.setCname("Di Lusso");
        luxuryCar.setCarname("Ferrari F8 Tributo");
        luxuryCar.setCarprice(250000);
        luxuryCar.setCarquantity(3);
        luxuryCar.setCarimage("ferrari_f8.jpg");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals("Ferrari", luxuryCar.getBname());
        assertEquals("Di Lusso", luxuryCar.getCname());
        assertEquals("Ferrari F8 Tributo", luxuryCar.getCarname());
        assertEquals(250000, luxuryCar.getCarprice());
        assertEquals(3, luxuryCar.getCarquantity());
        assertEquals("ferrari_f8.jpg", luxuryCar.getCarimage());
    }

    
}
