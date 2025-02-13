package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.brand;

public class BrandTest {
    private brand carBrand;

    @BeforeEach
    void setUp() {
        carBrand = new brand();
        carBrand.setBid(1);
        carBrand.setBname("BMW");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(1, carBrand.getBid());
        assertEquals("BMW", carBrand.getBname());
    }

    
}
