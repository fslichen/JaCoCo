package evolution.service;
import org.junit.Assert;
import org.junit.Test;

import evolution.BaseTest;
import evolution.service.AnyClass;

public class AnyClassTest extends BaseTest {
	@Test
	public void testAnyMethod() {
	    AnyClass palindromeTester = new AnyClass();
	    Assert.assertTrue(palindromeTester.anyMethod(""));
	}
}
