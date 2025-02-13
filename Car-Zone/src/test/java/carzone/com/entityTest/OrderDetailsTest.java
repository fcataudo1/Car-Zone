package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.order_details;

public class OrderDetailsTest {
    private order_details orderDetails;

    @BeforeEach
    void setUp() {
        orderDetails = new order_details();
        orderDetails.setDate("2024-02-13");
        orderDetails.setName("John Doe");
        orderDetails.setBname("BMW");
        orderDetails.setCname("Berlina");
        orderDetails.setCarname("BMW Series 5");
        orderDetails.setCarprice(60000);
        orderDetails.setCarquantity(2);
        orderDetails.setCarimage("bmw_series5.jpg");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals("2024-02-13", orderDetails.getDate());
        assertEquals("John Doe", orderDetails.getName());
        assertEquals("BMW", orderDetails.getBname());
        assertEquals("Berlina", orderDetails.getCname());
        assertEquals("BMW Series 5", orderDetails.getCarname());
        assertEquals(60000, orderDetails.getCarprice());
        assertEquals(2, orderDetails.getCarquantity());
        assertEquals("bmw_series5.jpg", orderDetails.getCarimage());
    }
    
}