package com.siit.hw;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilityTests {

	@Test
	public void unspacedStringIsSpaced() {
		// given
		String s1 = new String("dani has apples.");
		StringUtility su = new StringUtility();
		// when
		String s2 = su.removeAllWhiteSpaces(s1);
		// then
		String s3 = new String("danihasapples.");
		Assert.assertEquals(s2, s3);
	}
	
	@Test
	public void unreplacedStringIsReplaced() {
		// given
		String s4 = new String("Ana has Two apples and fOur plums.");
		StringUtility su = new StringUtility();
		// when
		String s5 = su.replaceAllNumbers(s4);
		System.out.println(s5);
		// then
		String s6 = new String("ana has 2 apples and 4 plums.");
		Assert.assertEquals(s5, s6);
	}

}
