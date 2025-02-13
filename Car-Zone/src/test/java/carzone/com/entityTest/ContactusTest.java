package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.contactus;

public class ContactusTest {
    private contactus contact;

    @BeforeEach
    void setUp() {
        contact = new contactus();
        contact.setId(1);
        contact.setName("John Doe");
        contact.setEmail_Id("john.doe@example.com");
        contact.setContact_Number(1234567890);
        contact.setMessage("Need more information about your cars.");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(1, contact.getId());
        assertEquals("John Doe", contact.getName());
        assertEquals("john.doe@example.com", contact.getEmail_Id());
        assertEquals(1234567890, contact.getContact_Number());
        assertEquals("Need more information about your cars.", contact.getMessage());
    }

   
}
