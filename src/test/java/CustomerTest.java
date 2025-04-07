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
                Exception ex = assertThrows(IllegalArgumentException.class)->{myCustomer.firstName()}
            }






}
