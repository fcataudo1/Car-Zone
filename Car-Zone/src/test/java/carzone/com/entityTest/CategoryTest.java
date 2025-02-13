package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.category;

public class CategoryTest {
    private category carCategory;

    @BeforeEach
    void setUp() {
        carCategory = new category();
        carCategory.setCid(101);
        carCategory.setCname("Luxury");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(101, carCategory.getCid());
        assertEquals("Luxury", carCategory.getCname());
    }

    
}