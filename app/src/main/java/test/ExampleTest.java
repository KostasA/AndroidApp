package test;

import android.test.InstrumentationTestCase;

/**
 * Created by grinkoan on 6/13/2016.
 */
public class ExampleTest extends InstrumentationTestCase
{
	public void test() throws Exception
	{
		final int expected = 1;
		final int reality = 1;
		assertEquals(expected,reality);

	}
}
