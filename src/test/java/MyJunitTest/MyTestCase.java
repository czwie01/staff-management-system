package MyJunitTest;

import org.junit.*;

public class MyTestCase {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }
    @Before
    public void before() {
        System.out.println("Before");
    }
    @Test
    public void testCase1() {
        System.out.println("Case1");
    }

    @Test
    public void testCase2() {
        System.out.println("Case2");
    }


    @After
    public void after() {
        System.out.println("After");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

}
