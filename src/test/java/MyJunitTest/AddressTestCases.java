package MyJunitTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import hc.managementsystem.Address;
import hc.managementsystem.StaffMember;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTestCases {

    @Test
    public void testAccess(){
        Address a = new Address("nameA",
                "streetA",
                "housenoA",
                "postalcodeA");

        assertAll("Test Getters",
                () -> assertEquals("Assert getName","nameA", a.getName()),
                () -> assertEquals("Assert getStreet", "streetA", a.getStreet()),
                () -> assertEquals("Assert getHouseNumber", "housenoA",a.getHouseNumber()),
                () -> assertEquals("Assert getPostalCode", "postalcodeA",a.getPostalCode())
        );
        a.setName("nameB");
        a.setStreet("streetB");
        a.setHouseNumber("housenoB");
        a.setPostalCode("postalcodeB");

        assertAll("Test Setters",
                () -> assertEquals("Assert setName","nameA", a.getName()),
                () -> assertEquals("Assert setStreet", "streetA", a.getStreet()),
                () -> assertEquals("Assert setHouseNumber", "housenoA",a.getHouseNumber()),
                () -> assertEquals("Assert setPostalCode", "postalcodeA",a.getPostalCode())
        );
    }

    @Test
    public void testEqualsMethod(){
        Address a = new Address("nameA",
                "strasseA",
                "housenoA",
                "postalcodeA");

        Address b = new Address("nameA",
                "strasseA",
                "housenoA",
                "postalcodeA");

        Address c = new Address("nameC",
                "strasseC",
                "housenoC",
                "postalcodeC");

        Address d = null;

        StaffMember e = new StaffMember("nameA","surnameA",c);

        assertAll("Test equals method",
            ()-> assertEquals("Equal Addresses asserted equal", a, b),
            ()-> assertEquals("Identical Addresses asserted equal", a, a),
            ()-> assertNotEquals("Different Classes asserted unequal", a, e),
            ()-> assertNotEquals("Non-null Address asserted unequal to null", a, d),
            ()-> assertNotEquals("Unequal Adresses asserted unequal", a, c)
        );
    }
}
