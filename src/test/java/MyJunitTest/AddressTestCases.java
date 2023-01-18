package MyJunitTest;

import hc.managementsystem.Address;
import hc.managementsystem.StaffMember;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTestCases {

    @Test
    public void testAccess(){

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

        assertTrue("Equal Addresses asserted equal", a.equals(b));
        assertTrue("Identical Addresses asserted equal", a.equals(a));
        assertFalse("Different Classes asserted unequal", a.equals(e));
        assertFalse("Non-null Address asserted unequal to null", a.equals(d));
        assertFalse("Unequal Adresses asserted unequal",a.equals(c));
    }
}
