package com.siit.hw;

/**
 * This class has 2 methods
 * 
 * @author Alin Cipariu Created on 29 Nov 2016
 */
public class StringUtility {
	/**
	 * This method removes all whitespace (space, tab, new-line) characters from
	 * s String Created on 01 Dec 2016
	 */
	public String removeAllWhiteSpaces(String s) {
		
		s = s.replaceAll("(\r\n)", "");
		s = s.replaceAll(" ", "");

		System.out.println(s);

		return s;
		
	}

	/**
	 * This method replaces all numbers (0-9) that are presented as words
	 * Created on 01 Dec 2016
	 */
	public String replaceAllNumbers(String s) {
		String[] array = new String []{ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		s = s.toLowerCase();
		
		for (int i = 0; i < array.length; i++) {
			  if (s.contains(array[i])) {
				  s = s.replace(array[i], Integer.toString(i));
			  }
		}
		System.out.println(s);
		return s;
	}

}
