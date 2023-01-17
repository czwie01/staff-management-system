package MyJunitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({MyTestCase.class})
public class MyTestSuite {
}
