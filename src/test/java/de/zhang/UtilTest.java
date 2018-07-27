package de.zhang;
import org.junit.Test;

public class UtilTest
{
	@Test(expected=IllegalArgumentException.class)
	public void TestIstErstesHalbjahr()
	{
		Util.istErstesHalbjahr(-5);
	}
}