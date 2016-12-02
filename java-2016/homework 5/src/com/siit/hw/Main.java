package com.siit.hw;

/**
 * This is the main class
 * 
 * @author Alin Cipariu Created on 28 Nov 2016
 */
public class Main {
	/**
	 * This is the main method Created on 29 Nov 2016
	 */
	public static void main(String[] args) {

		String s = "joHn one one six eIgHt      anA lAura    niNe ";
		

		StringUtility su = new StringUtility();

		su.removeAllWhiteSpaces(s);
		su.replaceAllNumbers(s);
		
	}

}
