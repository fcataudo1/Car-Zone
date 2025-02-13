package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.cart;

public class CartTest {
    private cart shoppingCart;

    @BeforeEach
    void setUp() {
        shoppingCart = new cart();
        shoppingCart.setName("John Doe");
        shoppingCart.setBname("BMW");
        shoppingCart.setCname("Berlina");
        shoppingCart.setCarname("BMW Series 3");
        shoppingCart.setCarprice(50000);
        shoppingCart.setCarquantity(2);
        shoppingCart.setCarimage("bmw_series3.jpg");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals("John Doe", shoppingCart.getName());
        assertEquals("BMW", shoppingCart.getBname());
        assertEquals("Berlina", shoppingCart.getCname());
        assertEquals("BMW Series 3", shoppingCart.getCarname());
        assertEquals(50000, shoppingCart.getCarprice());
        assertEquals(2, shoppingCart.getCarquantity());
        assertEquals("bmw_series3.jpg", shoppingCart.getCarimage());
    }

    
}
