package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.orders;

public class OrdersTest {
    private orders order;

    @BeforeEach
    void setUp() {
        order = new orders();
        order.setOrder_Id(1001);
        order.setCustomer_Name("Alice Brown");
        order.setCustomer_City("New York");
        order.setDate("2024-02-13");
        order.setTotal_Price(120000);
        order.setStatus("Confirmed");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(1001, order.getOrder_Id());
        assertEquals("Alice Brown", order.getCustomer_Name());
        assertEquals("New York", order.getCustomer_City());
        assertEquals("2024-02-13", order.getDate());
        assertEquals(120000, order.getTotal_Price());
        assertEquals("Confirmed", order.getStatus());
    }
    
}