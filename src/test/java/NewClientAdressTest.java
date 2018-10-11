import com.company.NewClientAddress;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewClientAdressTest {
    @Test
    public void testThatCanRetrieveAddress() {
            NewClientAddress myClientAddress = new NewClientAddress ("22 Farm Street");
            assertEquals("22 Farm Street", myClientAddress.getFullAddress());

    }
}
