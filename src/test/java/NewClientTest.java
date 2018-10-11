import com.company.NewClient;
import com.company.NewClientAddress;
import com.company.NewClientAge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewClientTest {

    @Test
    public void testThatCanRetrieveFullName() {
        NewClient newClient = new NewClient("Steve Walton");
        assertEquals("Steve Walton", newClient.getFullName());
    }


    @Test
    public void testThatCanRetrieveAddress() {
        NewClientAddress myClientAddress = new NewClientAddress("22 Farm Street");
        assertEquals("22 Farm Street", myClientAddress.getFullAddress());
    }

    @Test
    public void testThatCanRetrieveAge() {
        NewClientAge newClientAge = new NewClientAge("33");
        assertEquals("33", newClientAge.getClientAge());

    }
}
