package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.customer;

public class CustomerTest {
    private customer customer;

    @BeforeEach
    void setUp() {
        customer = new customer();
        customer.setName("Alice Brown");
        customer.setPassword("securepassword123");
        customer.setEmail_Id("alice.brown@example.com");
        customer.setContact_Number(987654321);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals("Alice Brown", customer.getName());
        assertEquals("securepassword123", customer.getPassword());
        assertEquals("alice.brown@example.com", customer.getEmail_Id());
        assertEquals(987654321, customer.getContact_Number());
    }

  
}
