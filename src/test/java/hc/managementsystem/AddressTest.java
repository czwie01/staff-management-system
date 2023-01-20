package hc.managementsystem;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressTest {

    @Test
    public void testAddressLine(){
        Address address = new Address("nameA","strasseA","hausnummerA","00000");

        Assertions.assertEquals("nameA strasseA hausnummerA 00000", address.getAddressLine());

    }

}
