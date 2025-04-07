import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CustomerTest {
    Customer myCustomer;

    @BeforeEach
            void setup(){
        myCustomer=new Customer();
            }
            @Test
            void testFirstnameSucess(){
            assertEquals("Patrick",myCustomer.firstName());
            }
            @Test
            void testFirstnameFail(){
                Exception ex = assertThrows(IllegalArgumentException.class,()->{myCustomer.firstName("Patrick");)};
            }
    @Test
    void testLastnameSucess(){
        assertEquals("Flanagan",myCustomer.lastName());
    }
    @Test
    void testLastnameFail(){
        Exception ex = assertThrows(IllegalArgumentException.class,()->{myCustomer.firstName("Flanagan");)};
    }






}
