package junits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import UnitTests.*;

/*
 * This is a test suite class that we will create to run all our tests
 * Follow along to see how its done Pay special attention to annotations
 */

	@RunWith(Suite.class)
	@Suite.SuiteClasses({
	      JunitMathProvider.class,
	      JunitMathProvider1.class
	        	})

public class TestSuite {

}