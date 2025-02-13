package carzone.com.entityTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.Product;

public class ProductTest {
    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product();
        product.setCarid(101);
        product.setCarname("Ferrari F8 Tributo");
        product.setCarprice(250000);
        product.setCarquantity(3);
        product.setCarimage("ferrari_f8.jpg");
        product.setCarDescription("Luxury sports car with high performance.");
        product.setBid(7);
        product.setCid(4);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(101, product.getCarid());
        assertEquals("Ferrari F8 Tributo", product.getCarname());
        assertEquals(250000, product.getCarprice());
        assertEquals(3, product.getCarquantity());
        assertEquals("ferrari_f8.jpg", product.getCarimage());
        assertEquals("Luxury sports car with high performance.", product.getCarDescription());
        assertEquals(7, product.getBid());
        assertEquals(4, product.getCid());
    }
    
}