package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.berlina;

public class BerlinaTest {
    private berlina berlinaCar;

    @BeforeEach
    void setUp() {
        berlinaCar = new berlina();
        berlinaCar.setBname("Audi");
        berlinaCar.setCname("Berlina");
        berlinaCar.setCarname("Audi A4 Sport");
        berlinaCar.setCarprice(45000);
        berlinaCar.setCarquantity(5);
        berlinaCar.setCarimage("audi_a4.jpg");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals("Audi", berlinaCar.getBname());
        assertEquals("Berlina", berlinaCar.getCname());
        assertEquals("Audi A4 Sport", berlinaCar.getCarname());
        assertEquals(45000, berlinaCar.getCarprice());
        assertEquals(5, berlinaCar.getCarquantity());
        assertEquals("audi_a4.jpg", berlinaCar.getCarimage());
    }

    
}
