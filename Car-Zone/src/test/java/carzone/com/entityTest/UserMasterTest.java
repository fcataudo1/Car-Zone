package carzone.com.entityTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import carzone.com.entity.usermaster;

public class UserMasterTest {
    private usermaster user;

    @BeforeEach
    void setUp() {
        user = new usermaster();
        user.setName("AdminUser");
        user.setPassword("secureAdmin123");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals("AdminUser", user.getName());
        assertEquals("secureAdmin123", user.getPassword());
    }

}
