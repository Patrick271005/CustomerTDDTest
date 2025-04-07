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
            void testFirstnameSuccess(){
            assertEquals("Patrick",myCustomer.firstName());
            }
            @Test
            void testFirstnameFail(){
                Exception ex = assertThrows(IllegalArgumentException.class,()->{myCustomer.firstName("Patrick");)};
            }
    @Test
    void testLastnameSuccess(){
        assertEquals("Flanagan",myCustomer.lastName());
    }
    @Test
    void testLastnameFail(){
        Exception ex = assertThrows(IllegalArgumentException.class,()->{myCustomer.firstName("Flanagan");)};
    }
    @Test
    void testCustomerIdSuccess(){
        assertEquals("customerid",myCustomer.CustomerId);

    }
    @Test
    void testCustomerIdFail(){
        Exception ex=assertThrows(IllegalArgumentException.class,() ->{new Customer()("c");})
    }







}
