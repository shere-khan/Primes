package justin.java.exercise;

import org.junit.Assert;
import org.junit.Test;

import justin.common.exercise.ReverseString;

public class ReverseStringTest {
	@Test
	public void isStringReversedTest() {
		String reversed = ReverseString.reverseString("justin");
		System.out.println(reversed);
		Assert.assertEquals("nitsuj", reversed);
	}
}
